
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class HashTable {
    
    int tamanio;
    int clave;
    double claveDos;
    int tempClave;
    char temp;    
    double tempClaveDos;

    public int hashSuma(String word) {
        clave = 0;
        for(int i = 0; i < word.length(); i++) {
            temp = word.charAt(i);
            tempClave = (int) temp;
            tempClave = tempClave - 96;
            //System.out.println(tempClave);
            clave = clave + tempClave;
        }
        return clave;
    }
    
    public double hashMultiPotencias(String word) {
        claveDos = 0;
        for(int i = 0; i < word.length(); i++) {
            temp = word.charAt(i);
            tempClaveDos = (double) temp;
            tempClaveDos = tempClaveDos - 96.0;
            //System.out.println(tempClaveDos);
            claveDos = claveDos + tempClaveDos*(Math.pow(27, (word.length() - 1) - i));
        }
        return claveDos;
    }
}
