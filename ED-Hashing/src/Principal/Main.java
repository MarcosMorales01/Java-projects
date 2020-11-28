
package Principal;

import Dominio.HashTable;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int indice;
        double indiceDos;
        String palabra = "hola";
        String palabra2 = "estado";
        String palabra3 = "hilo";
        String palabra4 = "olih";
        String palabra5 = "zzzzzz";
        
        HashTable ht = new HashTable();
        
        System.out.println("Resultados con Suma de indices");
        indice = ht.hashSuma(palabra);
        System.out.println("La clave para la palabra " + palabra + " es: " + indice);
        
        indice = ht.hashSuma(palabra2);
        System.out.println("La clave para la palabra " + palabra2 + " es: " + indice);
        
        indice = ht.hashSuma(palabra3);
        System.out.println("La clave para la palabra " + palabra3 + " es: " + indice);
        
        indice = ht.hashSuma(palabra4);
        System.out.println("La clave para la palabra " + palabra4 + " es: " + indice);
        
        System.out.println("");
        System.out.println("Resultados con Multiplicacion de potencias");
        indiceDos = ht.hashMultiPotencias(palabra);
        System.out.println("La clave para la palabra " + palabra + " es: " + indiceDos);
        
        indiceDos = ht.hashMultiPotencias(palabra5);
        System.out.println("La clave para la palabra " + palabra5 + " es: " + indiceDos);
    }
    
}
