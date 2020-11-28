
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class DatosEnLaMismaColumnaException extends RuntimeException {

    public DatosEnLaMismaColumnaException() {
        this("Hay mas de ");
    }

    public DatosEnLaMismaColumnaException(String s) {
        super(s + "dos datos en la misma columna.");
    }
    
}
