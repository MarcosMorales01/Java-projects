
package Dominio;

/**
 *
 * @author marco
 */
public class Distribuidora {
    
    private final static int NUM_PUBLICACIONES = 10;
    private String nombre; 
    private Disco discos[];
    private Libro libros[];
    
    Distribuidora libros[]=new Empleado[3];
    //private final static int contDeDiscos;
    //private final static int contDeLibros;

    public Distribuidora(String nombreDistribuidora) {
        libros
        contDeDiscos = 0;
        contDeLibros = 0;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
    public String getDisco( Disco disco) {
        return discos[--indice];
    }
    */
    
    /*
    public void setDisco(String disco) {
        discos[conDeDiscos++] = disco;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }
    
    public Disco[] getDiscos(){
        return discos;
    }
    public void crearFichas(){
        
    }
    */
    public void imprimirReporte(){
        
    }
}

