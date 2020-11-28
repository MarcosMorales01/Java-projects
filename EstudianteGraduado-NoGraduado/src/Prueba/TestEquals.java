/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dominio.MyDate;

/**
 *
 * @author marco
 */
    class TestEquals {
        public static void main(String[] args) {
        MyDate date1 = new MyDate(14, 3, 1976);
        MyDate date2 = new MyDate(14, 3, 1976);
        
    if ( date1 == date2 ) {
    System.out.println("date1 is identical to date2");
    } else {
    System.out.println("date1 is not identical to date2");
    }
    if ( date1.equals(date2) ) {
    System.out.println("date1 is equal to date2");
    } else {
    System.out.println("date1 is not equal to date2");
    }
    System.out.println("set date2 = date1;");
    date2 = date1;
    if ( date1 == date2 ) {
    System.out.println("date1 is identical to date2");
    } else {
    System.out.println("date1 is not identical to date2");
    }
    
            System.out.println(date1.toString() );
    }
    }
