
package Dominio;

//import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Bicicleta {
    
    private String nombre;
    private String numTelefonico;
    private int serialNumber;
    private static int counter = 0;
    
    public String getNumTelefonico() {
        return numTelefonico;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      public String  numDeBici( String telefono ){
        numTelefonico = telefono;
        return numTelefonico;
    }
        public String Nombre( String nombr ){
        nombre =  nombr;
        return nombre;
    }
    
    public static int getTotalCounter(){
        return counter;
    }
    
    public Bicicleta(){
        counter++;
        serialNumber = counter;
    }
}
