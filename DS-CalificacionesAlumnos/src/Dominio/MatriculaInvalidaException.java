
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class MatriculaInvalidaException extends RuntimeException {
    
    public MatriculaInvalidaException() {
        this("La matricula");
    }
    
    public MatriculaInvalidaException(String s) {
        super(s + "no consta de solo números.");
    }
}
