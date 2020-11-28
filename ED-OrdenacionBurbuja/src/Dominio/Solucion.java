
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Solucion {
    
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }
    
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void impresion (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        int[] array = {1, 7, 4, 8, 8, 3, 0, 23, 56};
        
       bubbleSort(array);
       impresion(array);
       
    }
}
