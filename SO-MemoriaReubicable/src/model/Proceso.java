
package model;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public class Proceso {
    public static String ASSIGNED = "Asignado";
    public static String UNASSIGNED = "Sin Asignar";

    private String nombre;
    private int tam;
    private String estado;

    
    public Proceso() {
    }

    public Proceso(String nombre, int tam, String estado) {
        this.nombre = nombre;
        this.tam = tam;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return " | Nombre = " + getNombre() + " | Tam = " + getTam() + " | Estado = " + getEstado();
    }
}
