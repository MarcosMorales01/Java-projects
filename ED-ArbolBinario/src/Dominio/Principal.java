
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Principal {

    
    public static void main(String[] args) {
        int elem = 22;
        String nom = "Hola";
        ArbolBinario arbol = new ArbolBinario();
        
        arbol.agregarNodo(elem, nom);
        
        if(!arbol.estaVacio()) {
            arbol.inOrden(arbol.raiz);
        } else {
            System.out.println("Vacio");
        }
    }
    
}
