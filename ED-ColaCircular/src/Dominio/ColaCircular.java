package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 * 
 */
public class ColaCircular {
    
    final int size = 10;
    private final int cola[];
    int tam;
    int inicio, fin;
    int cont;
    
    public ColaCircular() {
        tam = 0;
        cola = new int[size];
        inicio = 0;
        fin = 0;
        cont = 0;
    }
    
    public boolean isEmpty() {
        return tam == 0;
    }
    
    public void insertar(int valor) throws ColaLlenaException {
        
        if (tam != size) {
            int ubicacion = (inicio + tam) % size;
            cola[ubicacion] = valor;
            tam++;
            fin = tam;
            
        } else {
            throw new ColaLlenaException();
        }

    }
    
    public void quitar() throws ColaVaciaException {
        
        if( tam != 0) {
            if(cont % 2 != 0){
                int aux = cola[inicio];
                inicio = (inicio + 1) % size;
                tam--;
                fin = tam;
                cont++;
            } else {
                int aux = cola[inicio];
                inicio = (inicio + 1) % size;
                tam--;
                fin = tam;
                cont++;
            }
        } else {
            throw new ColaVaciaException();
        }
    }
    
    public int frente() throws ColaVaciaException {
        
        if(isEmpty()) {
            throw new ColaVaciaException();
        }
        return cola[inicio];
        
    }
    
    public void ToString() {
        
        if( cont % 2 != 0 ){
            for(int i = 0; i < fin; i++){
                System.out.print(cola[i] + "<-");
            }
            if(fin != size){
                System.out.println(cola[9]);
            }
            System.out.println("");
        } else {
            for(int i = 0; i < fin; i++){
                System.out.print(cola[i] + "<-");
            }
            if(fin != size){
                System.out.println(cola[9]);
            }
            System.out.println("");
        }
    }
}

