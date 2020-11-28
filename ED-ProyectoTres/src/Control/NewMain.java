
package Control;

import Vista.VistaPrincipal;

/**
 *
 * @author Jose Manuel Patron
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaPrincipal vista = new VistaPrincipal();
        ControlVistaPrincipal control = new ControlVistaPrincipal(vista);
        vista.setVisible(true);
    }
}
    

