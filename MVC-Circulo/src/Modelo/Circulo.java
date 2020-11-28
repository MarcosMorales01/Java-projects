/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author marco
 */
public class Circulo {
    
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }
    private double altura;
    private final double PI = 3.141516;
    
    public Circulo(){
        
    }
    
    public double calcularPerimetro(){
        return 2 * PI * radio;
    }
    
    public double calcularArea(){
        return PI * radio * radio;
    }
}
