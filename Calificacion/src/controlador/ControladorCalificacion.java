/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.itextpdf.text.DocumentException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Calificacion;
import modelo.ModeloArchivo;
import modelo.ModeloRegistro;
import vista.Acciones;
import vista.Calificar;

/**
 *
 * @author julio-cabrera
 */
public class ControladorCalificacion implements ActionListener {

    final String ruta = "/home/julio-cabrera/Documentos/alumnos.csv";
    final String rutaCalificados = "/home/julio-cabrera/Documentos/calificados.csv";
    final String rutaPocosAlumnos = "/home/julio-cabrera/Documentos/alumno.csv";
    private ModeloRegistro registro;
    private ModeloArchivo archivo;
    private Acciones acciones;
    private Calificar calificar;

    public ControladorCalificacion() {
        //registro = new ModeloRegistro(ruta);
        registro = new ModeloRegistro(rutaPocosAlumnos);
        archivo = new ModeloArchivo();
        acciones = new Acciones();
        this.acciones.btnCalificar.addActionListener(this);
        this.acciones.btnGenerar.addActionListener(this);
        this.acciones.btnNoCalificados.addActionListener(this);
        this.acciones.btnRegistrados.addActionListener(this);
        calificar = new Calificar();
        this.calificar.btnEnviar.addActionListener(this);
        this.acciones.btnpdf.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.acciones.btnGenerar) {
            try {
                this.registro.guardarArchivoCalificados(rutaCalificados);
            } catch (Exception ex) {
                Logger.getLogger(ControladorCalificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ae.getSource() == this.acciones.btnNoCalificados) {
            this.registro.obtenerNoCalificados();
        } else if (ae.getSource() == this.acciones.btnRegistrados) {
            try {
                this.registro.mostrarAlumnos();
            } catch (Exception ex) {
                Logger.getLogger(ControladorCalificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ae.getSource() == this.acciones.btnCalificar) {
            this.acciones.dispose();
            this.iniciarCalificar();

        } else if (ae.getSource() == this.calificar.btnEnviar) {
            String matricula = this.calificar.txtMatricula.getText();
            int calificacion = Integer.parseInt(this.calificar.txtCalificacion.getText());
            if (calificacion > 0 && calificacion <= 100) {
                this.registro.guardarCalificacion(new Calificacion(matricula, "Diseño de Software", calificacion));
                this.calificar.dispose();
                this.iniciarAcciones();
                this.calificar.txtMatricula.setText(null);
                this.calificar.txtCalificacion.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "La calificacion debe estar en un rango de 1-100");
            }

        }else if(ae.getSource() == this.acciones.btnpdf){
            try {
                this.registro.guardarCalificados();
            } catch (DocumentException ex) {
                Logger.getLogger(ControladorCalificacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ControladorCalificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void iniciarCalificar() {
        this.calificar.setTitle("Calificar");
        this.calificar.setVisible(true);
        this.calificar.setSize(500, 500);
        this.calificar.setLocationRelativeTo(null);
    }

    public void iniciarAcciones() {
        this.acciones.setVisible(true);
        this.acciones.setSize(500, 500);
        this.acciones.setLocationRelativeTo(null);
    }

}
