/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class PilaVaciaException extends RuntimeException {
    
    public PilaVaciaException(){
        this("Pila");
    }
    
    public PilaVaciaException(String s){
        super(s + "vacia.");
    }
}
