
package Lista;
/**
 *
 * José Marcos Morales Gómez
 */

public class ListaDDeque implements Deque{
    public ListaDoble lista;
    private int size;

    public ListaDDeque() {
        lista = new ListaDoble();
        size=0;
    }
    
    /**
     * Metodo que obtiene nodo inicio
     * @return nodo inicio
     */
    public Nodo getInicio(){
        return lista.inicio;
    }
    
    /**
     * Metodo obtiene el tamaño
     * @return 
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Esta vacia
     * @return 
     */
    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }

    @Override
    public void insertLast(Object o) {
        lista.insertaFinal(o);
        size++;
    }

    /**
     * Metodo que inserta al inicio
     * @param o dato a insertar
     */
    @Override
    public void insertFirst(Object o) {
        lista.insertaInicio(o);
        size++;
    }

    /**
     * Metodo que remueve al inicio
     * @return dato removido
     */
    @Override
    public Object removeFirst() {
       size--;
       return lista.eliminaInicio();
    }

    /**
     * Metodo que remueve al final
     * @return dato removido
     */
    @Override
    public Object removeLast() {
        size--;
        return lista.eliminaFinal();
    }

    /**
     * Metodo que obtiene el inicio
     * @return nodo inicio
     */
    @Override
    public Object first() {
        return lista.getInicio();
    }

    /**
     * Metodo que obtiene el final
     * @return nodo final
     */
    @Override
    public Object last() {
        return lista.getUltimo();
    }
    
}
