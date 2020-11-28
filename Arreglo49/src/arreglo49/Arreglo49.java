/*
 Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo
en el lugar adecuado para que la tabla continúe ordenada.
 */
package arreglo49;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Arreglo49 {

    
    public static void main(String[] args) {
        int arreglo[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite los numeros: ");
        for(int i=0; i<5; i++ ){
            System.out.print((i+1)+".");
            arreglo[i] = entrada.nextInt();
        }
        
        boolean creciente = false, decreciente = false;
        for(int i=0; i<4; i++){
            if(arreglo[i] < arreglo[i+1]){
                creciente = true;
            }
            
            if(arreglo[i] > arreglo[i+1]){
                decreciente = true;
            }
            
        }
        
        for(int i=0; i<10; i++){
            System.out.print(arreglo[i]+" ");
        }
        
        if (creciente == true && decreciente == false){
            System.out.println("El arreglo es creciente");
            System.out.println("Digite el numero que desea insertar en la tabla: ");
            numero = entrada.nextInt();
            for(int j=0; j<5; j++){
                if((arreglo[j-1] < numero) && (arreglo[j+1] > numero)){
                   arreglo[j] = numero; 
                }
            }
        } 
        else if(creciente == false && decreciente == true){
            System.out.println("El arreglo es decreciente");
        } 
        else if (creciente == true && decreciente == true){
            System.out.println("Esta desordenado el arreglo");
        } 
        else if(creciente == false && decreciente == false){
            System.out.println("Todos los numeros son iguales");
        }
    }
    
}
