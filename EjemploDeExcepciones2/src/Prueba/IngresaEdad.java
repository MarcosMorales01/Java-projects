/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import ejemplodeexcepciones2.IngEd;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class IngresaEdad {
    public static void main(String[] args) {
    // TODO code application logic here
        GregorianCalendar hoy;
        int edad, esteAnio, anioNac;
        String respuesta;
        Scanner escaner = new Scanner(System.in);
        IngEd entrada = new IngEd();
        edad = entrada.obtenEdad ("¿Qué edad tiene?");
        hoy = new GregorianCalendar();
        esteAnio = hoy.get(Calendar.YEAR);
        anioNac = esteAnio - edad;
        System.out.print("¿ya cumplió años este año? (S/N)");
        respuesta = escaner.next();
        if (respuesta.equals("N") || respuesta.equals("n")){
            anioNac--;
        }
        System.out.print("nUsted nació en " + anioNac);
    }
}

