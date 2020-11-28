
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Nodo {
    public Nodo siguiente;
    public char dato;
    
    //Constructor para insertar al final
    public Nodo(char d){
        this.dato = d;
        this.siguiente = null;
        
    }
    
    //Constructor para agregar al inicio
    public Nodo(char d, Nodo n){
        dato = d;
        siguiente = n;
    }
    
}
