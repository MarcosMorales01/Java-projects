package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class ColaVaciaException extends RuntimeException {
    
    public ColaVaciaException() {
        this("Cola");
    }
    
    public ColaVaciaException(String s) {
        super(s + " vacia.");
    }
}

