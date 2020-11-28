
package Prueba;

import Dominio.JuegoFermi;
import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class IniciadorJuegoFermiMain {

    public static void main(String[] args) {
        
        JuegoFermi jugador = new JuegoFermi();
        
        Scanner teclado = new Scanner(System.in);
        int e1, e2, e3;
        String respuesta;
        int cont = 0;
        
        while(true){
            
            System.out.println("Digite el numero1: ");
            e1 = teclado.nextInt();
            
            System.out.println("Digite el numero2: ");
            e2 = teclado.nextInt();
            
            System.out.println("Digite el numero3: ");
            e3 = teclado.nextInt();
            
            cont++;
            
            System.out.println("\n");
            System.out.println(jugador.obtenerPista(e1,e2,e3));
            
            respuesta = jugador.obtenerPista(e1,e2,e3);
            
            if( "FermiFermiFermi".equals(respuesta) ){
                break;
            }
            System.out.println("\n");
        }
        
        System.out.println( "Numero de intentos: " + cont );
    }
    
}
