/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int n = 4;
        
        GrafoAdcia grafo = new GrafoAdcia(n);
        Lista l = new Lista();
        
        grafo.nuevoVertice("A");
        grafo.nuevoVertice("B");
        grafo.nuevoVertice("C");
        grafo.nuevoVertice("D");
        
        
        grafo.nuevoArco("A", "B");
        //grafo.nuevoArco("C", "A");
        //grafo.nuevoArco("B", "D");
        
        grafo.imprimirLista();
        
    }
    
}
