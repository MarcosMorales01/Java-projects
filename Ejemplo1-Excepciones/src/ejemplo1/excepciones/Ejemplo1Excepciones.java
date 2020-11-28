/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Ejemplo1Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un entero: ");
        try{
            int numero = teclado.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Entrada invalida.");
        }
    }
    
}
