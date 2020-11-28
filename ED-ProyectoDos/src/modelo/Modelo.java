
package modelo;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Modelo {
    Archivo a = new Archivo();
    private String nomArchivo;
    private String directorio;
    private boolean incluirSubCarp;
    private String[] nombres;
    private String[] rutas;
    private String[] fechas;
    private String[] datos;
    
    private TableModel modelOrdenados;
    private TableModel modelArchivoEncontrado;

    public String getNomArchivo() {
        return nomArchivo;
    }

    public void setNomArchivo(String nomArchivo) {
        this.nomArchivo = nomArchivo;
    }

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    } 
    
    public boolean getIncluirSubCarp() {
        return incluirSubCarp;
    }

    public void setIncluirSubCarp(boolean incluirSubCarp) {
        this.incluirSubCarp = incluirSubCarp;
    }
    public void leerArchivos() {
        
       nombres = a.leer(directorio, incluirSubCarp);
    }
    
    public void obtenerRutas() {
        
        rutas = a.obtenerRutas(incluirSubCarp); 
    }
    
    public void obtenerFecha() {
        //String d = getDirectorio();
        fechas = a.obtenerFecha(directorio, incluirSubCarp);
    }
    
    public void imprimirTablaEnc() {
        DefaultTableModel model = (DefaultTableModel) this.modelOrdenados;
        Object[] vector = new Object[3];
        
        for(String date: nombres) {
            
        }
    }
    
}
