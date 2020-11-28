
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Archivo;
import modelo.Alimento;
import vista.Vista;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Alimento modeloFresa;
    private Alimento modeloManzana;
    private Alimento modeloPlatano;
    
    public Controlador(Vista view, Alimento fresa, Alimento manzana, Alimento platano) {
        this.view = view;
        this.modeloFresa = modeloFresa;
        this.modeloManzana = modeloManzana;
        this.modeloPlatano = modeloPlatano;
        this.view.fresaButton.addActionListener(this);
        this.view.manzanaButton.addActionListener(this);
        this.view.platanoButton.addActionListener(this);
        
    }
    
    public void iniciar() {
        //archivo.leerArchivoDeAlimentos();
        view.setTitle("Votaciones");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.fresaButton) {
            //System.out.println("se presiono fresa");
            modeloFresa.contadorDeVotos();
            System.out.println(modeloFresa.getNumDeVotos());
            //System.out.println(modeloFresa.getVotoFresa().getNumDeVotos());
        } else if(e.getSource() == view.manzanaButton) {
            //System.out.println("se presiono manzana");
        } else if(e.getSource() == view.platanoButton) {
            //System.out.println("platano");
        }
    }
}
