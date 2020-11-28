
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Nodo {
    
    public Nodo siguiente;
    public int dato;
    
    //Constructor para insertar al final
    public Nodo(int d){
        this.dato = d;
        this.siguiente = null;
        
    }
    
    //Constructor para agregar al inicio
    public Nodo(int d, Nodo n){
        dato = d;
        siguiente = n;
    }
    
    
}
