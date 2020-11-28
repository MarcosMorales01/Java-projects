
package Dominio;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Menu {
   private int opc;
   
   public int MenuUno() {
       
       try{
           opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "(1) Introducir cantidad de vuelos a generar. \n"
                           + "(2) Imprimir la cola de vuelos. \n"
                           + "(3) Sacar un vuelo en específico. \n"
                           + "(4) Sacar el siguiente vuelo. \n"
                           + "(5) Salir. ", "Menú de Opciones", 3));
           
       } catch(Exception e) {
           JOptionPane.showMessageDialog(null, "¡Error! " + e.getMessage());
       }
       
       return opc;
   }
   
   public int MenuDos() {
       try{
           opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
                           "(2) Imprimir la cola de vuelos. \n"
                           + "(3) Sacar un vuelo en específico. \n"
                           + "(4) Sacar el siguiente vuelo. \n"
                           + "(5) Salir. ", "Menú de Opciones", 3));
           
       } catch(Exception e) {
           JOptionPane.showMessageDialog(null, "¡Error! " + e.getMessage());
       }
       return opc;
   }
}
