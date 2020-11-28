/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Scanner;

//Saber si un arreglo es creciente o decreciente
public class Arreglo47 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        
        System.out.println("Digite los numeros: ");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+".");
            arreglo[i] = entrada.nextInt();
        }
        
        boolean creciente = false, decreciente = false;
        for(int i=0; i<9; i++){
            if(arreglo[i] < arreglo[i+1]){
                creciente = true;
            }
            
            if(arreglo[i] > arreglo[i+1]){
                decreciente = true;
            }
            
        }
        
        if (creciente == true && decreciente == false){
            System.out.println("El arreglo es creciente");
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
