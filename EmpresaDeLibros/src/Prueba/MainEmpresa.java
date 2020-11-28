
package Prueba;

import java.util.Scanner;
import Dominio.*;
/**
 *
 * @author marcos
 */
public class MainEmpresa {

   
    public static void main(String[] args) {
        
        int opcion;
        
        Scanner teclado = new Scanner(System.in);
        
        while(true){
            
            System.out.println("|_____________________________________________|");
            System.out.println("|                  MENU                       |");
            System.out.println("|_____________________________________________|");
            System.out.println("| (1) Agregar libros a la distribuidora       |");
            System.out.println("| (2) Agregar discos a la distribuidora       |");
            System.out.println("| (3) Generar un reporte de las publicaciones |");
            System.out.println("|_____________________________________________|");
            System.out.print(" Digite la opcion: ");
            
            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    
                    Distribuidora libro1 = new Distribuidora("Don Quijote", 12.00, 1988, 457);
                    break;

                case 2: 
                    break;

                case 3: 
                    break;

                default:
                    System.out.println("No ha digitado una de las opciones validas (1, 2, 3)");
                    break;
            }
            
            System.out.println("Si desea terminar, digite (0). ");
            opcion = teclado.nextInt();
            if( opcion == 0 ){
                break;
            }
        }
        
    }   
    
    
}
