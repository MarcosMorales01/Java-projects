
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {
    
    public static void main(String[] args) {
        Cola cola = new Cola();
        
        cola.ToString();
        //cola.quitar();
        //cola.frente();
        
        cola.insertar(1);
        cola.quitar();
        
        
        cola.insertar(0);
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        cola.insertar(6);
        cola.insertar(7);
        cola.insertar(8);
        cola.insertar(9);
        
        cola.ToString();
        
        System.out.println("Frente: " + cola.frente());
        cola.quitar();
        cola.ToString();
        
        cola.insertar(10);
        cola.ToString();
        //cola.insertar(11);
        
    }
}
