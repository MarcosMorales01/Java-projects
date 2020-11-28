
package controller;

import model.AreaLibre;
import model.Proceso;
import model.RAM;
/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chiz
 */
public class ControlRAM {

    private RAM memoria;
    private TAL tal;
    private TP tp;
    private Order order;

    public ControlRAM() {
        this.memoria = new RAM(512,64); //Tamaño total de memoria / Tamaño del SO
        this.tal = new TAL();
        this.tp = new TP();
        ConfigInicial();
    }

    public void procesoEntrante(Proceso process) {
        this.order.setTal(this.tal);
        this.order.setTp(this.tp);
        this.order.setProcess(process);
        this.order.commingProcess();
        this.tal = this.order.getTal();
        this.tp = this.order.getTp();
        if (this.order.getPrint()) {
            printTAL();
            printTP();
            System.out.println("");
        }
    }

    public void procesoFinalizado(String name) {
        Proceso process = procesoEncontrado(name);
        if (process != null) {
            this.order.setTal(this.tal);
            this.order.setTp(this.tp);
            this.order.setProcess(process);
            this.order.endProcess();
            this.tal = this.order.getTal();
            this.tp = this.order.getTp();
            if (this.order.getPrint()) {
                printTAL();
                printTP();
                System.out.println("");
            }
        } else {
            System.out.println(name + " proceso inexistente en la Tabla de Procesos");
        }
    }

    public void setPrimerAjuste() {
        this.order = new PrimerAjuste();
    }
    public void setmejorAjuste() {
        this.order = new MejorAjuste();
    }
    public void setPeorAjuste() {
        this.order = new PeorAjuste();
    }

    private Proceso procesoEncontrado(String name) {
        Proceso procesoEncontrado = null;
        for (int i = 0; i < this.tp.getParticiones().size(); i++) {
            if ((this.tp.getParticiones().get(i).getProceso().getNombre())
                    .equals(name) && (this.tp.getParticiones()
                            .get(i).getProceso().getEstado())
                            .equals(Proceso.ASSIGNED)) {
                procesoEncontrado = this.tp.getParticiones().get(i).getProceso();
            }
        }
        return procesoEncontrado;
    }

    private void printTAL() {
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            System.out.println(this.tal.getAL().get(i).toString());
        }
    }

    private void printTP() {
        for (int i = 0; i < this.tp.getParticiones().size(); i++) {
            System.out.println(this.tp.getParticiones().get(i).toString());
        }
    }

    private void ConfigInicial(){
        int availableSize = this.memoria.getTotalTam()
                - this.memoria.getTamOS();
        AreaLibre area = new AreaLibre(1, availableSize
                , this.memoria.getTamOS(), AreaLibre.AVAILABLE, 1);
        this.tal.addAreaLibre(area);
        printTAL();
        printTP();
        System.out.println("");
    }
}
