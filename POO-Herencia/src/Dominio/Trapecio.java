
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Trapecio extends Cuadrilatero {

    public Trapecio(int area, Coordenada coorUno, Coordenada coorDos, Coordenada coorTres, Coordenada coorCuatro) {
        super(area, coorUno, coorDos, coorTres, coorCuatro);
    }
    
    @Override
    public int areaCuadrilatero() {
        int B, b, h, a;
        B = coorDos.getX() - coorUno.getX();
        b = coorTres.getX() - coorCuatro.getX();
        h = (int) Math.sqrt(Math.pow(2,coorCuatro.getX() - coorUno.getX()) + Math.pow(2, coorCuatro.getY() - coorUno.getY()));
        a = ((B + b)*h) / 2;
        return a; 
    }
}
