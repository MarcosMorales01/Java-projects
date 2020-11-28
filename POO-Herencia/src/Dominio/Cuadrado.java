
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Cuadrado extends Paralelogramo {

    public Cuadrado(int area, Coordenada coorUno, Coordenada coorDos, Coordenada coorTres, Coordenada coorCuatro) {
        super(area, coorUno, coorDos, coorTres, coorCuatro);
    }
    
    @Override
    public int areaCuadrilatero() {
        int a;
        a = 2*(coorDos.getX() - coorUno.getX());
       return a;
    }
    
}
