
package Principal;

import Dominio.ListaDobleLig;
import Dominio.Menu;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc = 0;
        boolean usado = false, terminado = false;
        Menu menu = new Menu();
        ListaDobleLig deque = new ListaDobleLig();
        
        while(terminado != true) {
            
            if(usado == false) {
                opc = menu.MenuUno();
                switch(opc){
                    case 1:
                        try {
                            int cant;        
                            cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de vuelos. "));
                            ArrayList numeros = new ArrayList();
                            usado = true;
                            for (int i = 1; i <= cant; i++) {
                                int numero = (int) (Math.random() * cant + 1);

                                if (numeros.contains(numero)) {
                                    i--;
                                } else {
                                    numeros.add(numero);
                                    deque.agregarFinal(numero);
                                }
                            }
                        } catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "¡Error! " + n.getMessage());
                        }
                        break;
                    case 2:
                        if (usado == false) {
                            JOptionPane.showMessageDialog(null, "No hay vuelos. ");
                        } else {
                            deque.ToString();
                        }
                        break;
                    case 3:
                        if (usado == false) {
                            JOptionPane.showMessageDialog(null, "No hay vuelos. ");
                        }
                        break;
                    case 4:
                        if (usado == false) {
                            JOptionPane.showMessageDialog(null, "No hay vuelos. ");
                        } else {
                            deque.eliminarDelInicio();
                        }
                        break;
                    case 5:
                        terminado = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida. ");
                        break;
                }

            } else {
                opc = menu.MenuDos();
                switch(opc){
                    case 2:
                        deque.ToString();
                        break;
                    case 3:
                        try{
                            int vuelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de vuelo. "));
                            deque.eliminarEspecifico(vuelo);
                        } catch (NumberFormatException n) {
                            JOptionPane.showInputDialog(null, "¡Error! " + n.getMessage());
                        }
                        break;
                    case 4:
                        deque.eliminarDelInicio();
                        break;
                    case 5:
                        terminado = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida. ");
                        break;
                }
            }
        }
    }
    
}
