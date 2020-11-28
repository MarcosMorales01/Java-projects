
package Prueba;

import Dominio.Bicicleta;

/**
 *
 * @author marco
 */
public class MainBicicleta {

    public static void main(String[] args) {
        String b1, b2, b3;
        String num1, num2, num3;
        int numDeSerie;
        
        Bicicleta Bici1, Bici2, Bici3;
       
        Bici1 = new Bicicleta();
        b1 = Bici1.Nombre("Marcos Morales Gomez");
        num1 = Bici1.numDeBici( "9992475750" );
        
        System.out.println( "Nombre: " + b1 + "\nTelefono: " + num1 + "\nNumero De Serie: " + Bicicleta.getTotalCounter() );
        
        Bici2 = new Bicicleta();
        b2 = Bici2.Nombre( "Karen Paredes Gomez" );
        num2 = Bici2.numDeBici( "9992434577" );
        
        System.out.println( "Nombre: " + b2 + "\nTelefono: " + num2 + "\nNumero De Serie: " + Bicicleta.getTotalCounter() );
        
        Bici3 = new Bicicleta();
        b3 = Bici3.Nombre( "Alberto Morales Quintal" );
        num3 = Bici3.numDeBici( "9993454657" );
        
       System.out.println( "Nombre: " + b3 + "\nTelefono: " + num3 + "\nNumero De Serie: " + Bicicleta.getTotalCounter() ); 
    }
    
}
