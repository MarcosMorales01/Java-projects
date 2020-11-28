
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 * @param <Tipo>
 */

//Como se pondran cualquier tipo de objeto, debe ser una pila generica
public class Pila<Tipo> {
    
    final int tam = 10;
    private Tipo pila[];
    private int datos;
    
    //Constructor
    public Pila(){
        datos = 0;
        pila = (Tipo[]) new Object[tam];
    }
    
    //Asignar valores
    public void Push(Tipo dato) throws PilaLlenaException {
        if(datos < tam){
            pila[datos++] = dato;
            
        } else {
            throw new PilaLlenaException();
        }
    }
    
    //Eliminar valores
    Tipo Pop() throws PilaVaciaException{
        if(!isEmpty()){
            return pila[--datos];
        } else {
        
            throw new PilaVaciaException();
        }
    }
    
    // Tamaño de la pila
    int Size(){
        return datos;
    }
    
    public boolean isEmpty() {
        return datos == 0;
    }
    
    // Valor en la cima
    Tipo Peek() throws PilaVaciaException{
        if(isEmpty()){
            throw new PilaVaciaException();
        }
        int numElementosExistentes = datos;
        return pila[--numElementosExistentes];
        
    }
    
    //Metodos set y get
    public Tipo[] getPila() {
        return pila;
    }

    public void setPila(Tipo[] pila) {
        this.pila = pila;
    }

    public int getDatos() {
        return datos;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

}
