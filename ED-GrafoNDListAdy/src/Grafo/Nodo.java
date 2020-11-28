
package Grafo;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
class Nodo<T> {
    
    final T object;
    Nodo nextElement;
    
    public Nodo(T object) {
        this.object = object;
        this.nextElement = null;
    }
    
    public T getObject() {
        return object;
    }

    public Nodo getNextElement() {
        return nextElement;
    }

    public void setNextElement(Nodo nextElement) {
        this.nextElement = nextElement;
    }
}
