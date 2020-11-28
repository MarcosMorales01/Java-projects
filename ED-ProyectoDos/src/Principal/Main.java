
package Principal;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;



/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista view = new Vista();
        Controlador cont = new Controlador(view, mod);
        
        cont.iniciar();
        view.setVisible(true);
        
    }
    
}
