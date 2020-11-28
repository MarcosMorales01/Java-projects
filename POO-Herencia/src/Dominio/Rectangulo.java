
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Rectangulo extends Paralelogramo {

    public Rectangulo(int area, Coordenada coorUno, Coordenada coorDos, Coordenada coorTres, Coordenada coorCuatro) {
        super(area, coorUno, coorDos, coorTres, coorCuatro);
    }
    
    @Override
    public int areaCuadrilatero() {
        int a;
        a = (coorDos.getX() - coorUno.getX())*(coorCuatro.getY() - coorUno.getY());
        return a;
    }
    
}
