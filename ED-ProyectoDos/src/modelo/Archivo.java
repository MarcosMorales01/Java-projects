
package modelo;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileReader;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Archivo {
    public String[] nombresArchivos;
    public String[] archivosSub;
    public String[] archivosTotales;
    
    public String[] rutas;
    public String[] rutasSub;
    
    public String[] fechas;
    public String[] fechasSub;
    
    
    public String[] leer(String direccion, boolean checkSub) {
        
        try {
            File nombres = new File(direccion);
            //nombresArchivos = nombres.list();
            
            if(checkSub == true) {
                //System.out.println("hola true");
                nombresArchivos = nombres.list();
                for(int i = 0; i < nombresArchivos.length; i++) {
                    File f = new File(nombres.getAbsolutePath(), nombresArchivos[i]);
                    if(f.isDirectory()){
                        archivosSub = f.list();
                    }
                }
                /*
                for(int j = 0; j < nombresArchivos.length; j++) {
                    System.out.println(nombresArchivos[j]);
                }
                */
                /*
                for(int j = 0; j < archivosSub.length; j++) {
                    System.out.println(archivosSub[j]);
                }
                */
            } else {
                //System.out.println("hola false");
                nombresArchivos = nombres.list();
                for(int j = 0; j < nombresArchivos.length; j++) {
                //System.out.println(nombresArchivos[j]);
            }
                
            }
            
            archivosTotales = new String[nombresArchivos.length + archivosSub.length];
            int k = 0;
            for(int j = 0; j < archivosTotales.length; j++) {
                if(j < nombresArchivos.length  ) {
                    archivosTotales[j] = nombresArchivos[j];
                } else {
                    archivosTotales[j] = archivosSub[k];
                    k++;
                }
            }
            
            /* 
            for(int j = 0; j < archivosTotales.length; j++) {
                System.out.println(archivosTotales[j]);
            }
            */

            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error! " + e.getMessage());
        }
        return archivosTotales;
    }
    
    public String[] obtenerRutas(boolean checkSub) {
        String temp;
        //rutas = new String[nombresArchivos.length];
        //rutasSub = new String[archivosTotales.length];
        
        try {
            
                if(checkSub == true) {
                    rutasSub = new String[archivosTotales.length];
                    for(int i = 0; i < archivosTotales.length; i++) {
                        temp = "";

                        File ruta = new File(archivosTotales[i]);
                        temp = ruta.getAbsolutePath();
                        rutasSub[i] = temp;
                    }
                    /*
                    for(int i = 0; i < archivosTotales.length; i++) {
                        System.out.println(rutasSub[i]);
                    }
                    */
                } else {
                    rutas = new String[nombresArchivos.length];
                    for(int i = 0; i < nombresArchivos.length; i++) {
                        temp = "";

                        File rutaSub = new File(nombresArchivos[i]);
                        temp = rutaSub.getAbsolutePath();
                        rutas[i] = temp;
                    }
                    /*
                    for(int i = 0; i < nombresArchivos.length; i++) {
                        System.out.println(rutas[i]);
                    }
                    */

                }
     
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error! " + e.getMessage());
        }
        
        return rutas;
    }
    
    public String[] obtenerFecha(String direcc, boolean checkSub) {
        long lastModified;
        fechas = new String[nombresArchivos.length];
        
        try {
            
            if(checkSub == true) {
                fechasSub = new String[archivosTotales.length];
                
                
                for(int i = 0; i < archivosTotales.length; i++) {
                    File fichero = new File(direcc + "/" + archivosTotales[i]);
                    lastModified = fichero.lastModified();

                    String pattern = "yyyy-MM-dd hh:mm aa";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

                    Date lastModifiedDate = new Date( lastModified );
                    fechasSub[i] = simpleDateFormat.format( lastModifiedDate );
                    //System.out.println(fechasSub[i]);
                }
                
            } else {
                for(int i = 0; i < nombresArchivos.length; i++) {

                    File fichero = new File(direcc + "/" + nombresArchivos[i]);
                    lastModified = fichero.lastModified();

                    String pattern = "yyyy-MM-dd hh:mm aa";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

                    Date lastModifiedDate = new Date( lastModified );
                    fechas[i] = simpleDateFormat.format( lastModifiedDate );
                    //System.out.println(fechas[i]);
                    //System.out.println( " was last modified on " + simpleDateFormat.format( lastModifiedDate ) );

                }   
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error! " + e.getMessage());
        }
        
        return fechas;
    }
}
