/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Controlador implements ActionListener {
    
    private Modelo modelo;
    private Vista vista;
    
    // Constructor
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        //No jala sino inicializas los botones,asi que inicializa
        this.vista.btnsum.addActionListener(this);
    }

    @Override
    /* Creamos un objeto que nos ayuda a escuchar sobre los eventos en la
    interfaz grafica y a base de sus estados ejecutar codigo
    */
    public void actionPerformed(ActionEvent ae) {
        if (this.vista.btnsum == ae.getSource()) {
            int a = Integer.parseInt(this.vista.txtnum1.getText());
            int b = Integer.parseInt(this.vista.txtnum2.getText());

            //limpiar cajas
            this.vista.txtnum1.setText("");
            this.vista.txtnum2.setText("");

            int resultado = this.modelo.sumar(a, b);
            this.vista.txtres.setText(String.valueOf(resultado));

        }
    }
    
    public void iniciar(){
        this.vista.setTitle("Ejemplo suma");
        this.vista.setSize(500, 300);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }

}
