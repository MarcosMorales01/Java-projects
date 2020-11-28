package Lista;

/**
 *
 * José Marcos Morales Gómez
 */

public class NodoDoble extends Nodo{
    protected NodoDoble siguiente;
    protected NodoDoble anterior;
    
    public NodoDoble(Object dato, NodoDoble siguiente, NodoDoble anterior){
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;    
    }
    
    public NodoDoble(Object dato){
        this.dato = dato;
        siguiente = null;
        anterior = null;
    }
    
    public NodoDoble(){}

    /**
     * @return the siguiente
     */
    public NodoDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoDoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
}
