
package controller;

import java.util.ArrayList;
import model.AreaLibre;
import model.Particion;
import model.Proceso;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public class PrimerAjuste extends Order {
    private TAL tal;
    private TP tp;
    private Proceso proceso;
    private boolean imprimir;

    public PrimerAjuste() {
        this.tal = null;
        this.tp = null;
        this.proceso = null;
        this.imprimir = true;
    }

    
    
    /**
     * Actualiza las posiciones de las áreas libres
     */
    private void ordenarTAL() {
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            if ((this.tal.getAL().get(i).getEstado()).equals(AreaLibre.AVAILABLE)) {
                this.tal.getAL().get(i).setPosicion(i + 1);
            }
        }
    }
   
    
    private void actualizaTAL() {
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
        int totalTam = 0;
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            if ((this.tal.getAL().get(i).getEstado()).equals(AreaLibre.AVAILABLE)) {
                totalTam += this.tal.getAL().get(i).getTam();
            }
        }
        return totalTam;
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
     * Coloca una nueva particion en la Tabla de Particiones.
     */
    private void setParticion(Proceso proceso) {
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
        this.tal.addAreaLibre(new AreaLibre(NumAL(), tam, locacion
                , AreaLibre.AVAILABLE, this.tal.getAL().size()));
        ordenarTAL();
    }
    
    private int NumAL() {
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
