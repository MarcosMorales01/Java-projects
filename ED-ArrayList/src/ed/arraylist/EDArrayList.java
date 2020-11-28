
package ed.arraylist;

import java.util.ArrayList;
/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class EDArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> numero = new ArrayList<String>();
        
        for(int i = 1; i <= 5500000; i++){
            numero.add("Elemento" + i);
            
        }
    }
    
}
