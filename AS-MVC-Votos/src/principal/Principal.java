 
package principal;

import controlador.Controlador;
import modelo.Archivo;
import modelo.Alimento;
import vista.Vista;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivo archivo = new Archivo();
        archivo.leerArchivoDeAlimentos();
        Alimento fresa = new Alimento();
        Alimento manzana = new Alimento();
        Alimento platano = new Alimento();
        Vista view = new Vista();
        
        Controlador c = new Controlador(view, fresa, manzana, platano);
        c.iniciar();
        view.setVisible(true);
        
        //view.alimentoLabelUno.setText(archivo.getNombreDeAlimentoUno());
    }
}
