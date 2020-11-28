/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeexcepciones2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class IngEd {
    private static final String MENSAJE = "Su edad: ";
    private Scanner escaner;
    
    public IngEd(){
        escaner = new Scanner(System.in);
    }
    
    public int obtenEdad(){
        return obtenEdad(MENSAJE);
    }
    /*
    public int obtenEdad(String prompt){
        System.out.print(prompt);
        int edad = escaner.nextInt();
        return edad;
    }
    */
    public int obtenEdad(String prompt){
        int edad=0;
        System.out.print(prompt);
        try{
            edad = escaner.nextInt();
        }catch (InputMismatchException e){
            escaner.next();
        System.out.println("Entrada inválida. Por favor sólo ingrese dígitos.");
        System.out.println(e.getMessage());
        //e.printStackTrace();
        }
        return edad;
        }
}
    


