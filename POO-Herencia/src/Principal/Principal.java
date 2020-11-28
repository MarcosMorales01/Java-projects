
package Principal;

import dominio.Coordenada;
import dominio.Cuadrado;
import dominio.Rectangulo;
import dominio.Romboide;
import dominio.Trapecio;


/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r;
        Coordenada c1;
        Coordenada c2;
        Coordenada c3;
        Coordenada c4;
        
        c1 = new Coordenada(2,1);
        c2 = new Coordenada(4,1);
        c3 = new Coordenada(4,3);
        c4 = new Coordenada(2,3);
        Cuadrado cuadrado = new Cuadrado(0 , c1, c2, c3, c4);
        r = cuadrado.areaCuadrilatero();
        System.out.println("El area del cuadrado es: " + r);
        
        c1 = new Coordenada(3,2);
        c2 = new Coordenada(6,2);
        c3 = new Coordenada(6,4);
        c4 = new Coordenada(3,4);
        Rectangulo rectangulo = new Rectangulo(0, c1, c2, c3, c4);
        r = rectangulo.areaCuadrilatero();
        System.out.println("El area del rectangulo es: " + r);
        
        c1 = new Coordenada(1,1);
        c2 = new Coordenada(5,1);
        c3 = new Coordenada(6,4);
        c4 = new Coordenada(2,4);
        Romboide romboide = new Romboide(0, c1, c2, c3, c4);
        r = romboide.areaCuadrilatero();
        System.out.println("El area del romboide es: " + r);
        
        c1 = new Coordenada(2,1);
        c2 = new Coordenada(6,1);
        c3 = new Coordenada(5,4);
        c4 = new Coordenada(3,4);
        Trapecio trapecio = new Trapecio(0, c1, c2, c3, c4);
        r = trapecio.areaCuadrilatero();
        System.out.println("El area del trapecio es: " + r);
    }
    
}
