
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenacion vector = new Ordenacion();
        int cant = 100000;
        int[] array = new int[cant];
        
        ArrayList numeros = new ArrayList();                   
        for (int i = 0; i < cant; i++) {
            int numero = (int) (Math.random() * cant + 1);

            if (numeros.contains(numero)) {
                i--;
            } else {
                numeros.add(numero);
                array[i] = numero; 
                //vector.insercion(array, i + 1);
            }
        }
        //vector.imprimirArreglo(array);
        
        
        //vector.imprimirArreglo(array);
        //vector.burbuja(array);
        
        //vector.quickSort(array, 0, array.length - 1);
        //vector.imprimirArreglo(array);
        //vector.shellSort(array);
        //vector.mezclaDirecta(array);
        //vector.imprimirArreglo(array);
    
    }
    
}
