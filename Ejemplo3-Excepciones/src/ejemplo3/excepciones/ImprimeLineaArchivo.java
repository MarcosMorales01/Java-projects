/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3.excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ImprimeLineaArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        String fileName;
        BufferedReader fileIn;
        String linea;
        System.out.println("Introduzca el nombre del archivo: ");
        fileName = escaner.nextLine();
        
       try{
        fileIn = new BufferedReader(new FileReader(fileName)); //FileNotFoundException
        linea = fileIn.readLine(); //IOException
        System.out.println("Linea 1: " + linea);
        
        }catch (IOException e){
        
            System.out.println(e.getMessage());
        }
            
    }
    
    
}
