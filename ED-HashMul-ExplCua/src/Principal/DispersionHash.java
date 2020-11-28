
package Principal;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
import java.io.*;

public class DispersionHash {
    static final int M = 1024;
    static final double R = 0.618034;
    static long transformaClave(String clave) {
        long d;
        d = 0;
        for (int j = 0; j < Math.min(clave.length(),10); j++) {
            d = d * 27 + (int)clave.charAt(j);
        }
/*
Para un valor mayor que el máximo entero genera un
numero negativo.
*/
        if (d < 0) d = -d;
        return d;
    }
    static int dispersion(long x) {
        double t;
        int v;
        t = R * x - Math.floor(R * x); // parte decimal
        v = (int) (M * t);
        return v;
    }
    
    public static void main(String[]a) throws IOException {
        String clave;
        long valor;
        BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
        
        for (int k = 1; k <= 10; k++) {
            System.out.print("\nClave a dispersar: ");
            clave = entrada.readLine();
            valor = transformaClave(clave);
            valor = dispersion(valor);
            System.out.println("Dispersion de la clave " + clave + " \t " + valor);
        }
    }
}
