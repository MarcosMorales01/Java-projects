
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class ExpresionNoEvaluableException extends RuntimeException {
    public ExpresionNoEvaluableException(){
        this("Expresion");
    }
    
    public ExpresionNoEvaluableException(String s){
        super(s + " no evaluable.");
    }
}
