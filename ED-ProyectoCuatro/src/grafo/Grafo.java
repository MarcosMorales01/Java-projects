
package grafo;

import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public abstract class Grafo {
    
    public static void main(String[] args) {
        int opc;
        boolean v = true;
        int[][] matAdy;
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "(1) Crear nuevo grafo con uniones. \n"
                            + "(2) Borrar arco \n"
                            + "(3) Saber si es adyacente. \n"
                            + "(4) Buscar profundidad. \n"
                            + "(5) Buscar amplitud. ", "Menú de Opciones", 3));
        while(v) {
            
            if(opc != 1) {
                
                JOptionPane.showMessageDialog(null, "¡Error! Se necesita primero crear un nuevo grafo o fue una opcion invalida");
                
            } else {
                int numDeNodos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de nodos"));
                matAdy = new int[numDeNodos][numDeNodos];
                
                JFrame ventana = new JFrame("GRAFO");
                MouseListener e;
                ventana.add(new Lienzo());
                ventana.setSize(600,600);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setVisible(true);
               
                v = false;
                /*opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                                 "(2) Borrar arco \n"
                               + "(3) Saber si es adyacente. \n"
                               + "(4) Buscar profundidad. \n"
                               + "(5) Buscar amplitud. \n"
                               + "(6) Salir", "Menú de Opciones", 3));
                
                switch(opc) {
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        v = false;
                    default:
                        break;
                        
                }
*/
            }
        }
    }
    
    public void matrizAdyacente() {
        
    }
    
    public void adyacente() {
        
    }
    
    public void buscarProfundidad() {
        
    }
    
    public void buscarAmplitud() {
        
    }
    
    public void recorrerProfundidad() {
        
    }
    
    public void recorrerAmplitud() {
        
    }
}
