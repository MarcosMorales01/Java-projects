
package controller;

import model.AreaLibre;
import model.Proceso;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public class Compactacion {

    private TAL tal;
    private TP tp;
    private Proceso proceso;

    public Compactacion(TAL tal, TP tp, Proceso proceso){
        this.tal = tal;
        this.tp = tp;
        this.proceso = proceso;
    }

    /**
     * Metodo para reorganizar la memoria con fragmentación.
     */
    public boolean compactacion() {
        boolean band  = false;
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            for (int j = 0; j < i; j++) {
                int val = this.tal.getAL().get(i).getTam()
                        + this.tal.getAL().get(i).getLocacion();

                if (val == this.tal.getAL().get(j).getLocacion()) {

                    this.tal.getAL().get(i).setTam(this.tal.getAL().
                            get(i).getTam()
                            + this.tal.getAL().get(j).getTam());

                    /*this.tal.getFreeA().get(i).setLocation(this.tal.getFreeA().
                            get(i).getLocation());*/

                    this.tal.getAL().get(i).setEsatdo(AreaLibre.AVAILABLE);
                    this.tal.getAL().get(j).setEsatdo(AreaLibre.UNAVAILABLE);
                    band = true;
                }
            }
        }
        return band;
    }
    private int totalTam() {
        int totalTam = 0;
        for (int i = 0; i < this.tal.getAL().size(); i++) {
            if ((this.tal.getAL().get(i).getEstado()).equals(AreaLibre.AVAILABLE)) {
                totalTam += this.tal.getAL().get(i).getTam();
            }
        }
        return totalTam;
    }
    public TAL getTAL() {
        return this.tal;
    }
    public TP getTp() {
        return tp;
    }
    public Proceso getProceso() {
        return this.proceso;
    }
}
