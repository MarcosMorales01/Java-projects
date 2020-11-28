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
        
        ListaSimpleLigada lista = new ListaSimpleLigada();
        lista.ToString();
        
        lista.insertarInicio(1);
        lista.ToString();
        System.out.println("");
        
        lista.insertarFin(2);
        lista.ToString();
        System.out.println("");
        
        lista.insertarFin(3);
        lista.ToString();
        System.out.println("");
        
        lista.insertarInicio(0);
        lista.ToString();
           
    }
    
}
