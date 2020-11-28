package prueba;

import dominio.Mensaje;

/**
 *
 * @author marco
 */
public class MainMensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mensaje mensajeMundo; 
        mensajeMundo = new Mensaje();
        
        mensajeMundo.recibirMensaje( "Hola mundo malditoo!!" );
        System.out.println(mensajeMundo.darMensaje());
    }
    
}
