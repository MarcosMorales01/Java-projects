
package model;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public class AreaLibre {
    public static String AVAILABLE = "Disponible";
    public static String UNAVAILABLE = "No Disponible";

    private int num;
    private int tam;
    private int locacion;
    private String estado;
    private int posicion; //El orden

    public AreaLibre() {
    }


    public AreaLibre(int num, int tam, int locacion, String estado, int posicion) {
        this.num = num;
        this.tam = tam;
        this.locacion = locacion;
        this.estado = estado;
        this.posicion = posicion;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getLocacion() {
        return locacion;
    }

    public void setLocacion(int locacion) {
        this.locacion = locacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEsatdo(String estado) {
        this.estado = estado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Area libre [Numero = " + getNum() + " | Tam = " + getTam() + " | Locacion = " + getLocacion() + " | Estado = " + getEstado() + " | Posicion = " + getPosicion() + "]";
    }
}
