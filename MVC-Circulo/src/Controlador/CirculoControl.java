/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Circulo;
import Vista.CirculoVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author marco
 */
public class CirculoControl implements ActionListener {
    
    private Circulo modeloCirculo;
    private CirculoVista circuloVista;
    
    public CirculoControl( Circulo modeloCirculo, CirculoVista circuloVista ){
        
        this.modeloCirculo = modeloCirculo;
        this.circuloVista = circuloVista;
        
        this.circuloVista.getjTextField1().addActionListener(this);
        this.circuloVista.getjTextField2().addActionListener(this);
        this.circuloVista.getjTextField3().addActionListener(this);
        
    }
    
    public void actionPerfomed( ActionEvent evento){
        //Calcular perimetro
        if(circuloVista.getjTextField1() == evento.getSource() ){
            double perimetro;
            double radio = Double.parseDouble(circuloVista.getjTextField1().getText());
            modeloCirculo.setRadio(radio); 
            perimetro = modeloCirculo.calcularPerimetro();
        }
    }
}
