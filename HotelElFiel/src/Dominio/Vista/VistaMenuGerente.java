/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio.Vista;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class VistaMenuGerente extends javax.swing.JFrame {

    /**
     * Creates new form VisteMenuGerente
     */
    public VistaMenuGerente() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu Gerente");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnDescuento = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("¡Bienvenido Gerente!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 240, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dominio/Vista/LogoHotelELFiel2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 150, 220));

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel.setText("Cancelar Reservas");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 180, -1));

        btnDescuento.setBackground(new java.awt.Color(204, 204, 204));
        btnDescuento.setForeground(new java.awt.Color(102, 102, 102));
        btnDescuento.setText("Cambiar Descuentos");
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, -1));

        btnAct.setBackground(new java.awt.Color(204, 204, 204));
        btnAct.setForeground(new java.awt.Color(102, 102, 102));
        btnAct.setText("Agregar Actividad");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        getContentPane().add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 180, -1));

        btnAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregar.setForeground(new java.awt.Color(102, 102, 102));
        btnAgregar.setText("Agregar Evento");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 150, -1));

        btnReport.setBackground(new java.awt.Color(204, 204, 204));
        btnReport.setForeground(new java.awt.Color(102, 102, 102));
        btnReport.setText("Realizar Reporte");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        getContentPane().add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 150, -1));

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setForeground(new java.awt.Color(102, 102, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 150, -1));

        btnAtras.setBackground(new java.awt.Color(204, 204, 255));
        btnAtras.setForeground(new java.awt.Color(102, 102, 102));
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dominio/Vista/fondo_degradado.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        VistaDescuento ob = new VistaDescuento();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDescuentoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VistaRegistro ob = new VistaRegistro();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        VistaAct ob = new VistaAct();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnActActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        VistaCancelar ob = new VistaCancelar();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        VistaEvento ob = new VistaEvento();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        VistaReporte ob = new VistaReporte();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReportActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAct;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancel;
    public javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnReport;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
