
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class ArbolBinario {
    
    NodoArbol raiz;
    
    public ArbolBinario() {
        raiz = null;
    }
    
    public void agregarNodo(char nom) {
        NodoArbol nuevo = new NodoArbol(nom);
        
        if(raiz == null) {
            raiz = nuevo;
            
        } else {
            NodoArbol aux = raiz;
            NodoArbol padre;
            
            while(true) {
                padre = aux;
                // izquierdo
                if(d < aux.dato) {
                    aux = aux.hijoIzq;
                    
                    if(aux == null) {
                        padre.hijoIzq = nuevo;
                        return;
                    }
                } else {
                    aux = aux.hijoDer;
                    if(aux == null) {
                        padre.hijoDer = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean estaVacio() {
        return raiz == null;
    }
    
    public void inOrden(NodoArbol r) {
       if(r != null) {
           inOrden(r.hijoIzq);
           System.out.println(r.dato);
           inOrden(r.hijoDer);
       } 
    }
}
