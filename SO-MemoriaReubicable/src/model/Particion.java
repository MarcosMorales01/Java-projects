
package model;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public class Particion {
    private int locacion;
    private Proceso proceso;

    public Particion(int locacion, Proceso proceso) {
        this.locacion = locacion;
        this.proceso = proceso;
    }

    public int getLocacion() {
        return locacion;
    }

    public void setLocacion(int locacion) {
        this.locacion = locacion;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    @Override
    public String toString() {
        return "Particion [locacion = " + getLocacion()
                + getProceso().toString() + "]";
    }
}
