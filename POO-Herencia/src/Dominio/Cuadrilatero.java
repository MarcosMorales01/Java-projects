
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public abstract class Cuadrilatero {
    protected int area;
    protected Coordenada coorUno;
    protected Coordenada coorDos;
    protected Coordenada coorTres;
    protected Coordenada coorCuatro;

    public Cuadrilatero(int area, Coordenada coorUno, Coordenada coorDos, Coordenada coorTres, Coordenada coorCuatro) {
        this.area = area;
        this.coorUno = coorUno;
        this.coorDos = coorDos;
        this.coorTres = coorTres;
        this.coorCuatro = coorCuatro;
    }

    public Coordenada getCoorUno() {
        return coorUno;
    }

    public void setCoorUno(Coordenada coorUno) {
        this.coorUno = coorUno;
    }

    public Coordenada getCoorDos() {
        return coorDos;
    }

    public void setCoorDos(Coordenada coorDos) {
        this.coorDos = coorDos;
    }

    public Coordenada getCoorTres() {
        return coorTres;
    }

    public void setCoorTres(Coordenada coorTres) {
        this.coorTres = coorTres;
    }

    public Coordenada getCoorCuatro() {
        return coorCuatro;
    }

    public void setCoorCuatro(Coordenada coorCuatro) {
        this.coorCuatro = coorCuatro;
    }
    
    public abstract int areaCuadrilatero();
}
