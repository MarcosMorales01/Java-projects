
package Principal;

import java.awt.Graphics;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Linea {
    private int x1,y1,x2,y2;
    private int peso;
    private boolean sumar = false;
    public Linea(int x1,int y1,int x2,int y2,int peso){
        this.x1 = x1 ; this.x2 = x2;
        this.y1 = y1 ; this.y2 = y2;
        this.peso = peso;
    }
    public void pintar(Graphics g){
        g.drawLine(x1,y1,x2,y2);
//        if(y1 > y2 )
//            if(x1 > x2 )g.drawString(Integer.toString(peso), x1, y1-20);
//            else g.drawString(Integer.toString(peso), x1, y1-20);
//        else 
//            if (x1 > x2)g.drawString(Integer.toString(peso), x1-30, y1+60);
//            else g.drawString(Integer.toString(peso), x1, y1-20);

       int xMenor = menor(x1,x2);
       int yMenor = menor(y1,y2);
          
       int xMayor = mayor(x1,x2);
       int yMayor = mayor(y1,y2);
          
       int distanciaVertical = yMayor - yMenor;
       int distanciaHorizontal = xMayor - xMenor; 
       g.drawString(Integer.toString(peso) + "", distanciaHorizontal / 2 + xMenor, distanciaVertical / 2 + yMenor);
    }
    public void contiene_aristas(int[][] m , int pos_1)
    {
        int cont = 0 ;
        for(int i = 0 ; i < m.length;i++)
        {
            if(m[pos_1][i] >0) cont +=1;
        }
        if ( cont == 0 ) sumar=false;
        else sumar = true;
    }
 
    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
 private int mayor(int n1, int n2)
  {
    return n1 > n2 ? n1 : n2;
  }
  
  private int menor(int n1, int n2)
  {
    return n1 < n2 ? n1 : n2;
  }
}
