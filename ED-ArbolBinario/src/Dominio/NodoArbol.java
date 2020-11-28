
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class NodoArbol {
    int dato;
    String nombre;
    
    NodoArbol hijoIzq, hijoDer;
    
    public NodoArbol(int d, String nom) {
        this.dato = d;
        this.nombre = nom;
        this.hijoDer = null;
        this.hijoIzq = null;
        
    }
    
    public String toString() {
        return nombre + "Su dato es " + dato;
    }
}
