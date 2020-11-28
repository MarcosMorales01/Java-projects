/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public void agregarNodo(int d, String nom) {
        NodoArbol nuevo = new NodoArbol(d, nom);
        
        if(raiz == null) {
            raiz = nuevo;
            
        } else {
            NodoArbol aux = raiz;
            NodoArbol padre;
            
            while(true) {
                padre = aux;
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
