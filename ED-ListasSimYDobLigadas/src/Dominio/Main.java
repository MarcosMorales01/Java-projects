
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDobleLigada lista = new ListaDobleLigada();
        
        lista.ToString();
        
        lista.agregarInicio(1);
        lista.ToString();
        
        lista.agregarFinal(2);
        lista.ToString();
        
        lista.agregarFinal(3);
        lista.ToString();
        
        lista.agregarInicio(0);
        lista.ToString();
        
    } 
    
}
