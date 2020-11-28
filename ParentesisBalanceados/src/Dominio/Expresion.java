
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Expresion {
    Pila<String> pilaString = new Pila<>();
    Pila analizador = new Pila();
    private String expresion;
    private int posIzq, posDer;
    
    public Expresion(String expresion) {
     this.expresion = expresion;  
     analizador(expresion);
        
    }
    
    public void analizador(String expresion) throws ExpresionNoEvaluableException{
        this.expresion = expresion;
        
        if(expresion.length() < 10){
            for(int i = 0; i <expresion.length(); i++){
                char c = expresion.charAt (i);

                if( c == '('){
                    
                    pilaString.Push("a");
                    
                } else if (c == ')'){
                    if(analizador.isEmpty() == true){
                        pilaString.Pop();
                    } else {
                        throw new ExpresionNoEvaluableException();
                    }
                }
            }
        } else {
            throw new ExpresionNoEvaluableException();
        }
        
        if(analizador.isEmpty() == true){
            System.out.println("Expresion evaluable, correcta");
        } else{
            throw new ExpresionNoEvaluableException();
        }
    }
    
    
}
