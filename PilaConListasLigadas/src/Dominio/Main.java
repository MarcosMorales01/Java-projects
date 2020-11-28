package Dominio;
/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pila pila = new Pila();
        String expresion = "((((((((((((";
        
        for(int i = 0; i < expresion.length(); i++){
            char c = expresion.charAt(i);
            
            if( c == '('){    
                pila.Push('a');
                    
            } else if (c == ')'){
                
                if(pila.estaVacia() != true){
                    pila.Pop();
                } else {
                    System.out.println("Expresion no evaluable.");
                }
            }
        }
        
        if(pila.estaVacia() == true){
            System.out.println("Expresion evaluable, correcta");
        } else{
            System.out.println("Expresion no evaluable");
        }
    }
    
}
