
package Dominio;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class ListaDobleLig {
    private NodoDoble inicio, fin;
    private final int tam;
    // Constructor
    public ListaDobleLig() {
        inicio = fin = null;
        tam = 0;
    }
    
    public boolean isEmpty() {
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
    
    public int eliminarDelInicio(){
        int elemento = fin.dato;
        
        if(inicio == fin){
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }
    
    public void eliminarEspecifico(int vuelo) {
        if(!isEmpty()){
            if(inicio == fin && vuelo == inicio.dato){
                inicio = fin = null;
            } else if(vuelo == inicio.dato) {
                inicio = inicio.siguiente;
            } else {
                NodoDoble ant, temp;
                ant = inicio;
                temp = inicio.siguiente;
                
                while(temp != null && temp.dato != vuelo) {
                    ant = ant.siguiente;
                    temp = temp.siguiente;
                }
                
                if(temp != null) {
                    ant.siguiente = temp.siguiente;
                    if(temp == fin){
                        fin = ant;
                    }
                }
            }
        }
    }
    
    //Imprimir lista de fin a inicio
    public void ToString() {
        
        if(!isEmpty()){
            String datos = "";
            NodoDoble aux = inicio;
            int cont = 0;
            while(aux != null) {
                if(cont != 25 ) {
                    datos = datos + "[" + aux.dato + "]<=>";
                    aux = aux.siguiente;
                    cont++;
                } else {
                    cont = 0;
                    datos = datos + "\n[" + aux.dato + "]<=>";
                    aux = aux.siguiente;
                }
            }
            JOptionPane.showMessageDialog(null, datos);
        }
        
    }
}
