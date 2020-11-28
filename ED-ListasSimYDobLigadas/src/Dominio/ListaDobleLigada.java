
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class ListaDobleLigada {
    private NodoDoble inicio, fin;
    
    public ListaDobleLigada(){
        inicio = fin = null;
    }
    
    public boolean isEmpty(){
        return inicio == null;
    }
    
    //Metodo para agregar nodos al final
    public void agregarFinal(int valor){
        if(!isEmpty()){
            fin =  new NodoDoble(valor, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(valor);
        }
    }
    
    //Metodo para agregar nodos al inicio
    public void agregarInicio(int valor) {
        if(!isEmpty()){
            inicio = new NodoDoble(valor, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(valor);
        }
    }
    
    //Imprimir lista de fin a inicio
    public void ToString() {
        
        if(!isEmpty()){
            String datos = "";
            NodoDoble aux = inicio;
            
            while(aux != null){
                datos = datos + "[" + aux.dato + "]<=>";
                aux = aux.siguiente;
            }
            System.out.println(datos);
        }
    }
    
   
}
