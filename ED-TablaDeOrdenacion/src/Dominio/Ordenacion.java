
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Ordenacion {
    
    int inter;
    int comp;
    int i; 
    int j; 
    int temporal;
    
    public Ordenacion(){
        this.inter = 0;
        this.comp = 0;
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }
    public void burbuja(int[] array) {
        
        for(i = 0; i < array.length; i++) {
            for(j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    comp++;
                    temporal = array[i];
                    array[i] = array[j];
                    array[j] = temporal;
                    inter++;
                    
                } else {
                    comp++;
                }
            }
            
        }
        
        imprimirArreglo(array);
    }
    
    public void insercion(int[] array, int n) {
        int i, j;
        int aux;
        for(i = 1; i < n; i++){
            aux = array[i];
            j = i - 1;
            while(j >= 0 && array[j] > aux) {
                comp++;
                array[j + 1] = array[j];
                inter++;
                j--;
            }
            
            array[j + 1] = aux;
            //imprimirArreglo(array);
        }
    }
    
    public void quickSort(int[] array, int primero, int ultimo) {
        int i, j, pivote, aux;
        i = primero;
        j = ultimo;
        pivote = array[( primero + ultimo) / 2];
        
        do {
            while(array[i] < pivote){
                i++;
                comp++;
            }
            
            while(array[j] > pivote){
                j--;
                comp++;
            }
            
            if(i <= j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
                inter++;
            }
        } while (i <= j);
        
        if(primero < j) {
            quickSort(array, primero, j);
        }
        
        if(i < ultimo) {
            quickSort(array, i, ultimo);
        }
        
        
    }
    
    public void shellSort(int[] array) {
        int salto, i, j, k, aux;
        salto = array.length / 2;
        
        while(salto > 0) {
            
            for(i = salto; i < array.length; i++) {
                j = i - salto;
                while(j >= 0) {
                    k = j + salto;
                    if(array[j] <= array[k]) {
                        comp++;
                       j = -1; 
                    } else {
                        comp++;
                        aux = array[j];
                        array[j] = array[k];
                        array[k] = aux;
                        j = j - salto;
                        inter++;
                    }
                }
            }
            salto = salto / 2;
            
        }
        imprimirArreglo(array);
    }
    
    public int[] mezclaDirecta(int[] array) {
        int i, j, k;
        if(array.length > 1) {
            comp++;
            int nElementosIzq = array.length / 2;
            int nElementosDer = array.length - nElementosIzq;
            int arrayIzq[] = new int[nElementosIzq];
            int arrayDer[] = new int[nElementosDer];
            
            for(i = 0; i < nElementosIzq; i++){
                inter++;
                arrayIzq[i] = array[i];
            }
            
            for(i = nElementosIzq; i < nElementosIzq + nElementosDer; i++){
                inter++;
                arrayDer[i - nElementosIzq] = array[i];
            }
            
            arrayIzq = mezclaDirecta(arrayIzq);
            arrayDer = mezclaDirecta(arrayDer);
            i = 0;
            j = 0;
            k = 0;
            
            while(arrayIzq.length != j && arrayDer.length != k) {
                if(arrayIzq[j] < arrayDer[k]) {
                    comp++;
                    array[i] = arrayIzq[j];
                    i++;
                    j++;
                    inter++;
                } else {
                    comp++;
                    array[i] = arrayDer[k];
                    i++;
                    k++;
                    inter++;
                }
            }
            
            while(arrayIzq.length != j) {
                array[i] = arrayIzq[j];
                i++;
                j++;
                inter++;
            }
            
            while(arrayDer.length != k) {
                array[i] = arrayDer[k];
                i++;
                k++;
                inter++;
            }
        }   
        
        return array;
    }
    
    public void imprimirArreglo(int[] array) {
        
        for(int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println("");
        
        System.out.println("Intercambios:" + inter);
        System.out.println("Comparaciones:" + comp);
    }
}
