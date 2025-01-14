/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio.Vista;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class VistaRegistro extends javax.swing.JFrame {
    private Component confirmacion;
    private String usuario,password;
    /**
     * Creates new form VistaRegistro
     */
    public VistaRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        txtUsuario.setFocusable(true);
        setTitle("Log In Gerente");
    }
    public void datos(String us, String pas){
        usuario = "admin"; 
        password = "admin";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAtrasG = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 67, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, -1));

        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Log In");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 70, 50));

        btnIniciar.setBackground(new java.awt.Color(204, 204, 204));
        btnIniciar.setForeground(new java.awt.Color(102, 102, 102));
        btnIniciar.setText("Log in");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 78, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Gerente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        btnAtrasG.setBackground(new java.awt.Color(204, 204, 255));
        btnAtrasG.setForeground(new java.awt.Color(102, 102, 102));
        btnAtrasG.setText("Atrás");
        btnAtrasG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasGActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dominio/Vista/fondo_degradado2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -6, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        datos(usuario, password);
        if(usuario.equals(txtUsuario.getText()) && password.equals(txtPassword.getText())){
             //VistaRegistro st = new VistaRegistro();
             VistaMenuGerente ob = new VistaMenuGerente();
             ob.setVisible(true);
             this.dispose();
        }else if(txtUsuario.getText().equals("") && txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña estan vacios\nIngrese los por favor.");
            txtUsuario.setFocusable(true);
        }else if(txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Usuario está vacio\nIngrese lo por favor.");
            txtUsuario.setFocusable(true);
        }else if(txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Contraseña está vacio\nIngrese lo por favor.");
            txtPassword.setFocusable(true);
        }
        else if(txtUsuario.getText().compareTo(usuario)!=0 && txtPassword.getText().compareTo(password)!=0){
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña no válidos\nIngrese nuevamente.");
             txtUsuario.setFocusable(true);
        }
        else if(txtUsuario.getText().compareTo(usuario)!=0){
            JOptionPane.showMessageDialog(this,"Usuario no válido\nIngrese nuevamente.");
            txtUsuario.setFocusable(true);
        }else if(txtPassword.getText().compareTo(password)!=0){
            JOptionPane.showMessageDialog(this,"Contraseña no válida\nIngrese nuevamente.");
            txtPassword.setFocusable(true);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnAtrasGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasGActionPerformed
        VistaPrincipal ob = new VistaPrincipal();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasGActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAtrasG;
    public javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
