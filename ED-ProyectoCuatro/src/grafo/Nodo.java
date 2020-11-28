
package grafo;

import java.awt.Graphics;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Nodo {
    private int x, y;
    public static final int d = 60;
    private String nom;
    
    public Nodo(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void nuevoVertice(Graphics g) {
        g.drawOval(this.x - d/2, this.y - d/2, d, d);
        g.drawString(nom, x, y);
    }
}
