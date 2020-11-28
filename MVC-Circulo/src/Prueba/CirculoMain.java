/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Controlador.CirculoControl;
import Modelo.Circulo;
import Vista.CirculoVista;

/**
 *
 * @author marco
 */
public class CirculoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo CirculoModelo = new Circulo();
        CirculoControl circuloControl = new CirculoControl(modeloCirculo, circuloVista);
        CirculoVista.setVisible(true);
    }
    
}
