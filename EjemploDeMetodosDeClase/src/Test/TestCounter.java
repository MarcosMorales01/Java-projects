
package Test;

import Dominio.Count;

public class TestCounter {
    
    public static void main(String[] args){
        
        System.out.println("Number of counter is " + Count.getTotalCount());
        Count counter = new Count();
        System.out.println("Number of counter is " + Count.getTotalCount());
}
    
}
