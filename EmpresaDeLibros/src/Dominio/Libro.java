
package Dominio;

/**
 *
 * @author marco
 */
public class Libro extends Publicacion {
    
    private int añoDePublicacion;
    private int numDePaginas;

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public int getNumDePaginas() {
        return numDePaginas;
    }

    public void setNumDePaginas(int numDePaginas) {
        this.numDePaginas = numDePaginas;
    }
    
}
