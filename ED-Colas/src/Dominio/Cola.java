
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 * 
 */

public class Cola {
    
    final int size = 10;
    private final int cola[];
    private final int copia[];
    int tam;
    
    public Cola() {
        tam = 0;
        cola = (int[]) new int[size];
        copia = (int[]) new int[size];
    }
    
    public boolean isEmpty() {
        
        return tam == 0;
    }
    
    public void insertar(int valor) throws ColaLlenaException {
       
        if(tam < size){
            cola[tam++] = valor;
            
        } else {
            throw new ColaLlenaException();
        }
        
    }
    
    public void quitar() throws ColaVaciaException {
        
        if(!isEmpty()) {
            tam--;
            for(int i = 0; i < tam ; i++){
                copia[i] = cola[i + 1];
            }
        } else {
            throw new ColaVaciaException();
        }
        
        for(int j = 0; j < tam; j++){
            cola[j] = copia[j];
        }
          
    }
    
    public int frente() throws ColaVaciaException {
        
        if(isEmpty()){
            throw new ColaVaciaException();
        }
        return cola[0];
        
    }
    
    public int tamanio(){
        return tam;
    }
    
    public void ToString(){
        
        for(int i = 0; i < tam; i++){
            System.out.print(cola[i] + "<-");
        }
        System.out.println("");
    }
}
