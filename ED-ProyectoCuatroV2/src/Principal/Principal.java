
package Principal;

import javax.swing.*;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lienzo lien1 = new Lienzo();
        // Definir ventana
        JFrame ventana = new JFrame("Grafos");
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.add(lien1);
        ventana.setVisible(true);
    }
    
}
