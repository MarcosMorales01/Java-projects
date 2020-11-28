
package Grafo;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Lista {
    
    public Nodo head;
    public Nodo tail;
    private int length;
    
    public Lista() {
        this.head = null;
        this.tail = null;
        this.length = 0; 
    }
    
    public Lista(Nodo object) {
        this.head = new Nodo(object);
        this.tail = new Nodo(object);
        this.length = 1;
    }

    Object buscarLista(Arco arco) {
        return null;
        
    }
    
    /*
    void insertarCabezaLista(Arco ab) {
        
    }
    */
    
    public void insertarCabezaLista(Arco ab) {
        Nodo newElement = new Nodo(ab);

        if (this.isEmpty()) {
            // if the list is empty, HEAD & TAIL must to point to the only element (nuevo)
            this.setHead(newElement);
            this.setTail(newElement);
            this.length = 1;
        } else {
            /* if the list is NOT empty, the nextElement property of the newElement node must to
             point to the HEAD NODE in order to not to lose the list. After that the
             newElement now become to be the new HEAD NODE
             */
            newElement.setNextElement(this.getHead());
            this.setHead(newElement);
            this.length++;
        }
    }

    void eliminar(Arco ab) {
        
    }
    
    public boolean isEmpty() {
        return (this.getHead() == null && this.getTail() == null);
    }
    
    
    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    /**
     * @return Retorna la longitud guardada en la PROPIEDAD length
     */
    public int getLength() {
        return length;
    }
    
    public void imprimir() {
         Nodo recorrer = head;
        
        while(recorrer != null){
            
            System.out.print(recorrer.object+"-->");
            recorrer = recorrer.nextElement;
        }
        System.out.println("");
    }

}
