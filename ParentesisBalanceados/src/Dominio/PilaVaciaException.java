
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class PilaVaciaException extends RuntimeException {
    
    public PilaVaciaException(){
        this("Pila");
    }
    
    public PilaVaciaException(String s){
        super(s + "vacia.");
    }
}
