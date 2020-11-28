
package Test;

import Dominio.Circulo;

/**
 *
 * @author marcos
 */
public class CirculoMain {

    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(7.8);
        Circulo circulo2 = new Circulo();
        
        double area;
        area = circulo1.obtenerArea() - circulo2.obtenerArea();
        System.out.println("El area es: " + area);
        
    }
    
}
