/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloLogin;
import vista.Login;

/**
 *
 * @author julio-cabrera
 */
public class ControladorLogin implements ActionListener {

    private ModeloLogin modelo;
    private Login login;
    private final String ruta;
    private ControladorCalificacion calificacion;

    public ControladorLogin() {
        this.modelo = new ModeloLogin();
        this.login = new Login();
        this.login.btnIngresar.addActionListener(this);
        ruta = "/home/julio-cabrera/Documentos/usuarios.csv";
        calificacion = new ControladorCalificacion();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.login.btnIngresar) {
            try {
                String usuario = this.login.txtUsuario.getText();
                String contrasena = this.login.txtContrasena.getText();
               
                if (this.modelo.verificar(ruta, usuario, contrasena)) {
                    this.login.dispose();
                    this.calificacion.iniciarAcciones();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al ingresar");
                }
            } catch (Exception ex) {
                Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void iniciar() {
        this.login.setTitle("Login");
        this.login.setVisible(true);
        this.login.setSize(500, 400);
        this.login.setLocationRelativeTo(null);
    }

}
