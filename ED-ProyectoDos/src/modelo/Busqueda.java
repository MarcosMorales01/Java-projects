
package modelo;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Busqueda {
    
    public int busquedaBinaria(int[] arreglo, int elemento) {
        int centro, primero, ultimo, valorCentro;
        primero = 0;
        ultimo = arreglo.length - 1;
        
        while( primero <= ultimo) {
            centro = ( primero + ultimo / 2);
            valorCentro = arreglo[centro];
            
            if(elemento == valorCentro) {
                return centro;
            } else if(elemento < valorCentro) {
                ultimo = centro - 1;
            } else {
                primero = centro + 1;
            }
        }
        return -1;
    }
}
