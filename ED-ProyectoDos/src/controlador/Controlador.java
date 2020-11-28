
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnSelect.addActionListener(this);
        this.view.btnBusque.addActionListener(this);
        this.view.btnBusque.setEnabled(false);
        
    }
    
    public void iniciar() {
        view.setTitle("Busqueda de archivos");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == this.view.btnBusque){
            resetFrame();
        }
        model.setNomArchivo(view.nomArchivo.getText());
        model.setDirectorio(view.nomDirec.getText());
        model.setIncluirSubCarp(view.checkSubCarp.isSelected());
        model.leerArchivos();
        model.obtenerRutas();
        model.obtenerFecha();
        model.imprimirTablaEnc();
        
        
    }
    
    private void resetFrame(){
        vaciarTabla();
        this.view.btnSelect.setEnabled(true);
        this.view.btnBusque.setEnabled(false);
        this.view.nomArchivo.setText("");
        this.view.nomDirec.setText("C:\\");
        //this.view.getbuttonGroupOrdenamientos().setSelected(view.btnBurbuja.getModel(), true);
        this.view.checkSubCarp.setSelected(false);
    }
    
    private void vaciarTabla(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Ruta");
        model.addColumn("Fecha");
        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn("Nombre");
        model1.addColumn("Ruta");
        model1.addColumn("Fecha");
        /*
        this.vista.getTablaOrdenado().setModel(model);
        this.vista.getTablaArchivosEncontrados().setModel(model1);
        this.modelOrdenados = model;
        this.modelArchivoEncontrado = model1;
*/
    }
 
}
