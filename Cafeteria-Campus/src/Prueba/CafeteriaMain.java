
package Prueba;

import Dominio.Cafeteria;
import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class CafeteriaMain {
    
    public static void main(String[] args) {
        
        int respuesta;
        int puntos;
        
        System.out.println("¿Quiere registrar cuantos puntos le pondra a su tarjeta? 1 = (SI) 0 = (NO)");
        Scanner teclado = new Scanner(System.in);
        respuesta = teclado.nextInt();
        
        if( respuesta == 1 ){
            
            System.out.println("Digite la cantidad de puntos: ");
            puntos = teclado.nextInt();
            Cafeteria estudiante =  new Cafeteria(puntos);
            
            
            
        } else {
            Cafeteria estudiante =  new Cafeteria(100);
        }
        
        
    }
    
}
