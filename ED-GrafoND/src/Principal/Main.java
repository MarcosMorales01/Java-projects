
package Principal;

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
        
        GrafoMatriz grafo = new GrafoMatriz(n);
        
        grafo.nuevoVertice("A");
        grafo.nuevoVertice("B");
        grafo.nuevoVertice("C");
        grafo.nuevoVertice("D");
        
        grafo.nuevoArco("A", "B");
        grafo.nuevoArco("C", "A");
        grafo.nuevoArco("B", "D");
        
        grafo.imprimirMatriz();
        //grafo.recorridoAnchura();
        
    }
    
}
