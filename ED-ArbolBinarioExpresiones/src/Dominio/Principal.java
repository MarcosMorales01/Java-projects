
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Principal {

    
    public static void main(String[] args) {
        int elem = 22;
        String nom = "3 + 2";
        char c;
        ArbolBinario arbol = new ArbolBinario();
        
        for(int i = 0; i < nom.length(); i++) {
            c = nom.charAt(i);
            arbol.agregarNodo(c);
        }
        
        //arbol.agregarNodo(nom);
        //nom.charAt(6);
        
        if(!arbol.estaVacio()) {
            arbol.inOrden(arbol.raiz);
        } else {
            System.out.println("Vacio");
        }
    }
    
}
