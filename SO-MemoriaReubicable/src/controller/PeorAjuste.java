
package controller;

import model.AreaLibre;
import model.Particion;
import model.Proceso;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public class PeorAjuste extends Order {

    private TAL tal;
    private TP tp;
    private Proceso proceso;
    private boolean imprimir;

    public PeorAjuste() {
        this.tal = null;
        this.tp = null;
        this.proceso = null;
        this.imprimir = true;
    }
    /**
     * Ordena en orden ascendente
     */
    private void ordenarTAL(){
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            for (int j = 0; j < i; j++) {
                if (this.tal.getAL().get(j).getTam()
                        < this.tal.getAL().get(i).getTam()
                        && (this.tal.getAL().get(i).getEstado())
                                .equals(AreaLibre.AVAILABLE)) {
                    AreaLibre temp = this.tal.getAL().get(i);
                    this.tal.getAL().set(i, this.tal.getAL().get(j));
                    this.tal.getAL().set(j, temp);
                }
            }
        }
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            if ((this.tal.getAL().get(i).getEstado()).equals(AreaLibre.AVAILABLE)) {
                this.tal.getAL().get(i).setPosicion(i + 1);
            }
        }
        
    }
    /**
     * Nueva Particion
     */
    private void setParticion(Proceso proceso){
        boolean band = false;
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            if (proceso.getTam()
                    <= this.tal.getAL().get(i).getTam()
                    && (this.tal.getAL().get(i).getEstado())
                                .equals(AreaLibre.AVAILABLE)) {
                this.tp.addProceso(new Particion(
                        this.tal.getAL().get(i).getLocacion()
                        , proceso));
                band = true;
                actualizaTAL();
                break;
            }
        }
        if (!band) {
            checaCompact(proceso);
        }
    }
    private void checaCompact(Proceso proceso) {
        if (this.proceso.getTam() <= totalTamAL()) {
            Compactacion compact = new Compactacion(this.tal, this.tp, proceso);
            boolean band = compact.compactacion();
            if (band) {
                this.tal = compact.getTAL();
                setParticion(proceso);
            } else {
                actualizaTablas(compact);
                setParticion(proceso);
            }
        } else {
            System.out.println("Espacio insuficiente");
            this.imprimir = false;
        }
    }
    private int totalTamAL() {
        int totalSize = 0;
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            if ((this.tal.getAL().get(i).getEstado()).equals(AreaLibre.AVAILABLE)) {
                totalSize += this.tal.getAL().get(i).getTam();
            }
        }
        return totalSize;
    }
    private void actualizaTablas(Compactacion compact) {
        Proceso proceso = procesoEncont();
        if (proceso != null) {
            procesoSinAsig(proceso);
            compact.compactacion();
            this.tal = compact.getTAL();
            setParticion(proceso);
        }
    }
    private Proceso procesoEncont() {
        Proceso proceso = null;
        int val;
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            val = this.tal.getAL().get(i).getLocacion()
                    + this.tal.getAL().get(i).getTam();
            for (int j = 0; j < this.tp.getParticiones().size(); j++) {
                if (val == this.tp.getParticiones().get(j).getLocacion()) {
                    proceso = this.tp.getParticiones().get(j).getProceso();
                    break;
                }
            }
        }
        return proceso;
    }
    /**
     * Actualizacion de Tabla de Areas Libres despues que se genera una nueva particion a la 
     * Tabla de Particiones.
     */
    private void actualizaTAL(){
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            for (int j = 0; j < this.tp.getParticiones().size(); j++) {
                if (this.tp.getParticiones().get(j).getLocacion() == this.tal.getAL().get(i).getLocacion()
                        && (this.tal.getAL().get(i).getEstado()).equals(AreaLibre.AVAILABLE)
                        && (this.tp.getParticiones().get(j).getProceso().getEstado()).equals(Proceso.ASSIGNED)) {
                    this.tal.getAL().get(i).setLocacion(this.tal.getAL().get(i).getLocacion()
                                    + this.tp.getParticiones().get(j).getProceso().getTam());
                    this.tal.getAL().get(i).setTam(this.tal.getAL().get(i).getTam()
                                    - this.tp.getParticiones().get(j).getProceso().getTam());
                    if (this.tal.getAL().get(i).getTam() == 0) {
                        this.tal.getAL().get(i).setEsatdo(AreaLibre.UNAVAILABLE);
                    }
                    ordenarTAL();
                    break;
                }
            }
        }
        
    }
    private void procesoSinAsig(Proceso proceso) {
        for (int i = 0; i < this.tp.getParticiones().size(); i++) {
            if ((proceso.getNombre()).equals(
                    this.tp.getParticiones().get(i).getProceso().getNombre())
                    && (this.tp.getParticiones().get(i).getProceso()
                            .getEstado()).equals(Proceso.ASSIGNED)) {
                this.tp.getParticiones().get(i).getProceso()
                        .setEstado(Proceso.UNASSIGNED);
                crearAL(this.tp.getParticiones().get(i).getLocacion(),
                        this.tp.getParticiones().get(i).getProceso().getTam());
                break;
            }
        }
    }
    private void crearAL(int locacion, int tam) {
        this.tal.addAreaLibre(new AreaLibre(numAL(), tam, locacion
                , AreaLibre.AVAILABLE, this.tal.getAL().size()));
        ordenarTAL();
    }

    private int numAL() {
        int i = this.tal.getAL().size();
        return this.tal.getAL().get(i - 1).getNum() + 1;
    }

    @Override
    public TAL getTal() {
        return this.tal;
    }

    @Override
    public TP getTp() {
        return this.tp;
    }

    @Override
    public boolean getPrint() {
        return this.imprimir;
    }

    @Override
    public void setProcess(Proceso process) {
        super.setProcess(process);
        this.proceso = process;
    }

    @Override
    public void setTp(TP tp) {
        super.setTp(tp);
        this.tp = tp;
    }

    @Override
    public void setTal(TAL tal) {
        super.setTal(tal);
        this.tal = tal;
    }

    @Override
    public void commingProcess() {
        super.commingProcess();
        this.imprimir = true;
        ordenarTAL();
        setParticion(this.proceso);
    }

    @Override
    public void endProcess() {
        super.endProcess();
        this.imprimir = true;
        procesoSinAsig(this.proceso);
    }
}
