
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class DatosErroneosException extends RuntimeException {
    public DatosErroneosException() {
        this("Los nombres o apellidos");
    }
    
    public DatosErroneosException(String s) {
        super("no estan compustos de solo letras.");
    }
}
