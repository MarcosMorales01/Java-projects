
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class ColaLlenaException extends RuntimeException {
    
    public ColaLlenaException(){
        this("Cola");
    }
    
    public ColaLlenaException(String s) {
        super(s + " llena.");
    }
}
