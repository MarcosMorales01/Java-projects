
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Pila {
    
    private int numDatos;
    ListaSimpleLigada lista = new ListaSimpleLigada();
    
    //Constructor
    public Pila(){
        numDatos = 0;
                
    }
    
    //Asignar valores
    public void Push(char dato) {
        
        lista.insertarInicio(dato);
        numDatos++;
    }
    
    //Eliminar valores
    public char Pop() throws PilaVaciaException{
        
        char valorEliminado = 'e';
        if(!estaVacia()){
            
            valorEliminado = lista.eliminarNodo();
            numDatos--;
        } else {
        
            throw new PilaVaciaException();
        }
        return valorEliminado;
    }
    
    // Tamaño de la pila
    int Size(){
        return numDatos;
    }
    
    public boolean estaVacia() {
        boolean valorDeVerdad;
        
        if(numDatos == 0){
            valorDeVerdad = true;
        } else {
            valorDeVerdad = false;
        }
        return valorDeVerdad;
    }
    
    // Valor en la cima
    Nodo Peek() throws PilaVaciaException{
        if(estaVacia()) {
            throw new PilaVaciaException();
        }
        int numElementosExistentes = numDatos;
        Nodo elemCima = lista.ToString();
        return elemCima;
        
    }  
}
