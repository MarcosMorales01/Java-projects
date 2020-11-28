/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author heri9621
 */
public class Oracion {
    
    private final String string; 
    
    public Oracion(String string) {
        this.string = string;
    }
    
    public String obtenerString() {
        return this.string;
    }
    
    public String[] obtenerPalabras() {
        return this.string.split(" ");
    }
    
    public String obtenerPrimeraPalabra() {
        return this.string.split(" ")[0];
    }
    
    public int obtenerLongitud() {
        return this.obtenerPalabras().length;
    }
    
}