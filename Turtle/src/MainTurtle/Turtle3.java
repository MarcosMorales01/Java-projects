/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTurtle;
import java.awt.Color;

import galapagos.Turtle;
import galapagos.TurtleDrawingWindow;


/**
 *
 * @author marco
 */
public class Turtle3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Turtle   t;
        
        TurtleDrawingWindow win = new TurtleDrawingWindow();
        
        int      size, turn;
        
        t = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        t.penColor(Color.yellow);
        
        win.add(t);
        win.setVisible(true);
                
        size     = 50;    //logical units
        turn     = 20;    //in degree
       
        //draw a triangle
        t.move( size ); 
        t.turn( turn );
        
        t.print("First Turn");
        
        t.hide(); //hide the turtle
        
        t.move( size ); 
        t.turn( turn );
        
        t.print("Second Turn");
        
        t.show(); //show the turtle
        
        t.move( size ); 
        t.turn( turn );
        
        t.print("Third Turn");
        
        t.hide();
               


    }
    
}
