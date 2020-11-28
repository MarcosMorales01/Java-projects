
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Romboide extends Paralelogramo {

    public Romboide(int area, Coordenada coorUno, Coordenada coorDos, Coordenada coorTres, Coordenada coorCuatro) {
        super(area, coorUno, coorDos, coorTres, coorCuatro);
    }
    
    @Override
    public int areaCuadrilatero() {
        int a,b,h;
        
        h = coorDos.getX() - coorUno.getX();
        b = (int) Math.sqrt(Math.pow(2,coorCuatro.getX() - coorUno.getX()) + Math.pow(2, coorCuatro.getY() - coorUno.getY()));
        a =  b*h;
        return a;
    }
    
}
