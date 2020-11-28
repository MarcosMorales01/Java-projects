
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class ColumnasVaciasException extends RuntimeException {

    public ColumnasVaciasException() {
        this("La columna referenciada o sugerida ");
    }

    public ColumnasVaciasException(String s) {
        super(s + "no contiene información, esta vacia.");
    }
    
}
