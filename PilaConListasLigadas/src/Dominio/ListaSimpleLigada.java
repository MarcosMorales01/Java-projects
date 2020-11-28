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
    
    public void insertarInicio(char valor){
        inicio = new Nodo(valor, inicio);
        
        if(fin == null){
            fin = inicio;
        }
    }
    
    public char eliminarNodo(){
        char valor = fin.dato;
        
        if(inicio == fin){
            inicio = fin = null;
            
        } else {
            inicio = inicio.siguiente;
        }
        
        return valor;
    }
    
    public boolean isEmpty() {
        if(inicio == null) {
            return true;
        } else {
           return false; 
        }
    }
    
    
    public Nodo ToString(){
        
        Nodo recorrer = inicio;
        
        while(recorrer != null){
            System.out.print(recorrer.dato+"-->");
            recorrer = recorrer.siguiente;
        }
        
        return recorrer;
        
    }

}