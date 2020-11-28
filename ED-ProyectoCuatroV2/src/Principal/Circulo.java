
package Principal;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Circulo {
    private int x ,y;
    String nombre;
    public static final int d = 40;
    boolean sumar = false;
    public Color color;
    public Circulo(int x , int y,String n)
    {
        this.color = Color.YELLOW;
        this.x = x ; 
        this.y = y ;
        this.nombre = n;
    }
    public void pintar(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x- d/2,y -d/2,d,d);
        g.setColor(Color.BLACK); 
        g.drawString(nombre,x ,y);
    }
   public int getX() {return x ;}
   public int getY() {return y;}
   public void set_Color(Color c ) {this.color = c;}
}
