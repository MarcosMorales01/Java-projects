/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import dominio.Fraccion;

/**
 *
 * @author marco
 */
public class MainFraccion {

    public static void main(String[] args) {
        
        //Impresion de la fraccion
        Fraccion f1 = new Fraccion(24, 36);
        System.out.println(f1.aString());
        
        //Metodo que imprime la fraccion simplificada
        Fraccion f2 = f1.Simplifica();
        System.out.println(f2.aString());
        System.out.println(f1.aString() + " puede reducirse a " + f2.aString());
        
        // conjunto de fracciones que se suman
        Fraccion f3;
        f1 = new Fraccion(2,5);
        f2 = new Fraccion(3,5);
        f3 = f1.Suma(f2);
        System.out.println( "La suma de " + f1.aString() + " y " + f2.aString() +
        " es " + f3.aString() );
        
        // conjunto de fracciones que se restan
        f3 = f1.Resta(f2);
        System.out.println( "La resta de " + f1.aString() + " y " + f2.aString() +
        " es " + f3.aString() );
        
        // conjunto de fracciones que se multiplican
        
        f3 = f1.Multiplicacion(f2);
        System.out.println( "La multiplicacion de " + f1.aString() + " y " + f2.aString() +
        " es " + f3.aString() );
        
        // conjunto de fracciones que se dividen
        
        f3 = f1.Division(f2);
        System.out.println( "La division de " + f1.aString() + " y " + f2.aString() +
        " es " + f3.aString() );
        
    }
    
    
}
