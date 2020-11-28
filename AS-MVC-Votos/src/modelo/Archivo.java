
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import vista.Vista;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Archivo {
    private Vista vistaLabel = new Vista();
    private String nombreDeAlimentoUno;
    private String nombreDeAlimentoDos;
    private String nombreDeAlimentoTres;

    public Archivo() {
        ///this.nombreDeAlimento = "";
    }
    
    public void leerArchivoDeAlimentos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File ("alimentos.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

         // Lectura del fichero
            String linea;
            int cont = 0;
            while((linea = br.readLine()) != null) {
                System.out.println(linea);
                cont++;
                
                switch(cont) {
                    case 1:
                        setNombreDeAlimentoUno(linea);
                        break;
                    case 2:
                        setNombreDeAlimentoDos(linea);
                        break;
                    case 3:
                        setNombreDeAlimentoTres(linea);
                        break;
                    default:
                        System.out.println("Hubo algún error");
                        break;
                }
                
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        } finally {
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
            try {                    
                if( null != fr ) {   
                    fr.close();   
                }                  
            } catch (Exception e2) { 
            e2.printStackTrace();
            }
        }
    }
    
    public void cambiarNombresDelLabel() {
       vistaLabel.alimentoLabelUno.setText(nombreDeAlimentoUno);
    }
    public String getNombreDeAlimentoUno() {
        return nombreDeAlimentoUno;
    }

    public void setNombreDeAlimentoUno(String nombreDeAlimentoUno) {
        this.nombreDeAlimentoUno = nombreDeAlimentoUno;
    }

    public String getNombreDeAlimentoDos() {
        return nombreDeAlimentoDos;
    }

    public void setNombreDeAlimentoDos(String nombreDeAlimentoDos) {
        this.nombreDeAlimentoDos = nombreDeAlimentoDos;
    }

    public String getNombreDeAlimentoTres() {
        return nombreDeAlimentoTres;
    }

    public void setNombreDeAlimentoTres(String nombreDeAlimentoTres) {
        this.nombreDeAlimentoTres = nombreDeAlimentoTres;
    }
    
}
