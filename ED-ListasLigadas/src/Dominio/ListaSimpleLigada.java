
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class ListaSimpleLigada {
    
    //Punteros para saber el inicio y fin
    protected Nodo inicio, fin;
    
    
    public ListaSimpleLigada(){
        inicio = null;
        fin = null;
    }
    
    public void insertarInicio(int valor){
        inicio = new Nodo(valor, inicio);
        
        if(fin == null){
            fin = inicio;
        }
    }
    
    public void insertarFin(int valor) {
        
        if(!isEmpty()) {
            fin.siguiente = new Nodo(valor);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(valor);
        }
        
    }  
    
    public boolean isEmpty() {
        if(inicio == null) {
            return true;
        } else {
           return false; 
        }
    }
    
    
    public void ToString(){
        
        Nodo recorrer = inicio;
        
        while(recorrer != null){
            System.out.print(recorrer.dato+"-->");
            recorrer = recorrer.siguiente;
        }
        
    }
}
