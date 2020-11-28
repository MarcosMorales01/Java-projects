
package Dominio;

/**
 *
 * @author marco
 */
public class Disco extends Publicacion {
    
    private float duracionEnMinutos;

    public String getTituloDelLibro() {
        return tituloDelLibro;
    }

    public void setTituloDelLibro(String tituloDelLibro) {
        this.tituloDelLibro = tituloDelLibro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
