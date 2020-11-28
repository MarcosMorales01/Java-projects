package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RuntimeException {
        
        
        Pila<String> pilaString = new Pila<>();
        Pila<Integer> pilaInt = new Pila<>();
        Pila<Double> pilaDouble = new Pila<>();
        
        Pila pila = new Pila();
        /*
        //Agregando valores String a la pila
        pilaString.Push("Marcos");
        pilaString.Push("String");
        pilaString.Push("Objeto");
        
        //Agregando valores enteros a la pila
        pilaInt.Push(12);
        pilaInt.Push(10);
        
        //Agregando valores decimales a la pila
        pilaDouble.Push(1.5);
        pilaDouble.Push(9.88);
        
        //Se obtiene la cantidad de valores que se tiene del tipo de dato
        //Su suma representa la cantidad de datos que tiene la pila
        System.out.println("Numero de valores enteros");
        System.out.println(pilaInt.Size());
        System.out.println("Numero de valores String");
        System.out.println(pilaString.Size());
        System.out.println("Numero de valores flotantes");
        System.out.println(pilaDouble.Size());
        
        //Para eliminar se necesita saber el tipo de dato que se uso al final
        System.out.println("Numero a eliminar");
        System.out.println(pilaDouble.Pop());
        //Para saber que numero esta en la cima se necesita saber el tipo de 
        //dato que se uso al final
        System.out.println("Numero que esta en la cima");
        System.out.println(pilaDouble.Peek());
        */
         System.out.println(pila.isEmpty());
        
    }
    
}
