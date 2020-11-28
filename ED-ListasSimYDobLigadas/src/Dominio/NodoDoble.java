
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class NodoDoble {
    
    public int dato;
    NodoDoble siguiente, anterior;
    
    //Constructor para cuando no existen nodos
    public NodoDoble(int valor) {
        this(valor, null, null);
    }
    
    //Constructor para cuando existen nodos
    public NodoDoble(int valor, NodoDoble s, NodoDoble a){
        dato = valor;
        siguiente = s;
        anterior = a;
    }
    
    
}
