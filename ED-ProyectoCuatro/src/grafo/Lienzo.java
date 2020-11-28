
package grafo;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Lienzo extends JPanel implements MouseListener {
    private Vector<Nodo> vectorNodo;
    private Vector<Enlace> vectorEnlace;
    private Point p1, p2;
    
    
    public Lienzo() {
        this.vectorNodo = new Vector<>();
        this.vectorEnlace = new Vector<>();
        this.addMouseListener(this);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(Nodo nodos : vectorNodo) {
            nodos.nuevoVertice(g);
        }
        
        for(Enlace enlace : vectorEnlace) {
            enlace.union(g);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getButton() == MouseEvent.BUTTON1) {
            String nombre = JOptionPane.showInputDialog("Ingrese el valor del nodo");
            this.vectorNodo.add(new Nodo(e.getX(), e.getY(), nombre));
            repaint();
        }
        
        if(e.getButton() == MouseEvent.BUTTON3) {
            for(Nodo nodo : vectorNodo) {
                if(new Rectangle(nodo.getX() - Nodo.d/2, nodo.getY() - Nodo.d/2, Nodo.d, Nodo.d).contains(e.getPoint())) {
                    if(p1 == null) {
                        p1 = new Point(nodo.getX(), nodo.getY());
                        
                    } else {
                        p2 = new Point(nodo.getX(), nodo.getY());
                        String nombre = JOptionPane.showInputDialog("Ingrese el valor del enlace");
                        this.vectorEnlace.add(new Enlace(p1.x, p1.y, p2.x, p2.y, nombre));
                        repaint();
                        p1 = null;
                        p2 = null;
                    }
                }
            }
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
