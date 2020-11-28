
package Principal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JOptionPane;
/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Lienzo extends JPanel implements MouseListener {
    // Vector que contendra los circulos y lineas
    private Vector<Circulo> Circulos;
    private Vector<Linea> Lineas;
    private Vector<Nodo>  aCamino;
    private Point p1,p2;
    String msg = "";
    //------------------------------------------
    // Variables que contendran el inicio y el fin del camino
    String go = "&";
    String end = "&";
    // Matriz para guardar  pesos 
    String[] name = {"a","b","c","d","e","f","g","h","i","j","k"};
    int[][] Matriz_pe = new int[name.length][name.length];
    int pos_2 = 0;int pos_1 =0; int cont = 0;int menor = 999;
    //-----------------------------------------------
    // Variables Globales 
    int pos = 0; int numb =0 ;
    
    // Tabla con datos
    public javax.swing.JTable Taristas;
    public javax.swing.JTable Tcamino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    
    
    // Menu Desplegable
    JPopupMenu pmenu = new JPopupMenu() ;
    // Item de menu desplegable
    JMenuItem item_1 = new JMenuItem("Agregar Aristas");
    JMenuItem item_2 = new JMenuItem("Agregar Nodos");
    JMenuItem item_3 = new JMenuItem("Buscar Camino mas corto");
    
    public boolean crear_nodo = true;
    public boolean buscar_ruta= false;
    // Constructor
    public Lienzo()
    {
        
        // Setear valores 
        this.Circulos = new Vector<>();
        this.Lineas   = new Vector<>();
        this.aCamino = new Vector<>();
        this.addMouseListener(this);
        this.setVisible(true);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
        // Llenar matriz con 999 , ya que no existe ninguna conexion
        for(int i=0;i<Matriz_pe.length;i++)
        {
            for(int i2=0;i2<Matriz_pe.length;i2++)
            {
                Matriz_pe[i][i2] = 999;
            }
        }
        
        // Popup Menu
        
        // Agregar Menu a jPane
        pmenu.add(item_1);pmenu.add(item_2);pmenu.add(item_3);
        
        item_1.addActionListener((ActionEvent ae) -> {crear_nodo = false;buscar_ruta= false;});
        item_2.addActionListener((ActionEvent ae) -> {crear_nodo = true;buscar_ruta= false;});
        item_3.addActionListener((ActionEvent ae) -> {buscar_ruta= true;});
        
        
        // Agregar en el panel
        this.add(pmenu);
    }
    // Funcion que grafica 
    public void paint(Graphics g){
        for(Circulo objCirculo : Circulos){
            objCirculo.pintar(g);
        }
        for(Linea objLinea : Lineas){
            objLinea.contiene_aristas(Matriz_pe,pos_1); // Si contiene aristas mueve el 
            objLinea.pintar(g);
        }
    }
    
    // Eventos del Mouse
    @Override
    public void mouseClicked(MouseEvent me) {
       if(me.getButton() == MouseEvent.BUTTON1){
         if (crear_nodo && !buscar_ruta ){
           if(name.length > pos)
           {
               // Agrega Circulos a Lienzo
                this.Circulos.add(new Circulo(me.getX(),me.getY(),name[pos]));  
                pos +=1; 
                repaint();          
           }
        }else if(!buscar_ruta){  
           for(Circulo objCirculo : Circulos){
              // Crea un rectangulo que compruena si existe un Circulo en esa posicion
              if(new Rectangle(objCirculo.getX()-objCirculo.d/2,objCirculo.getY()-objCirculo.d/2,objCirculo.d,objCirculo.d).contains(me.getPoint()))
              {
                  // Si el primer valor es nulo , llena este valor con la posicion 1 
                  if(p1 == null){
                      numb =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Peso"));
                      objCirculo.set_Color(Color.red);
                      repaint();
                      p1 = new Point(objCirculo.getX(),objCirculo.getY());
                      
                      // Obtiene la posicion de las filas para guardar en arreglo peso 
                      pos_1 = get_pos(objCirculo);
                  }else{
                      // Llena con la segunda posicion 2 
                      p2 = new Point(objCirculo.getX(),objCirculo.getY());
                      if ( p2 !=null){
                          // Obtiene la Posicion columnas para guardar en arreglo de Peso
                          pos_2  = get_pos(objCirculo);
                          Matriz_pe[pos_1][pos_1]= 0;
                          Matriz_pe[pos_2][pos_2]=0;
                          Matriz_pe[pos_1][pos_2] = numb;
                          Matriz_pe[pos_2][pos_1] = numb;
                          this.Lineas.add(new Linea(p1.x,p1.y,p2.x,p2.y,numb));
                      }
                      repaint();
                      p1 = null; p2 = null;
                      // Cambia color normal  
                      if ( p1 == null & p2 == null )
                      {
                         for(Circulo obj : Circulos) {obj.set_Color(Color.yellow);} 
                      }
                  }
              }
          }    
        }
         if(buscar_ruta)
         {
            // COntador para que aparezca el mensaje 
            if(cont ==0) 
            {
                JOptionPane.showMessageDialog(null, "Para buscar Camino mas corto , presione nodo de comienzo y se Mostrara los costos para cada nodo", "Camino Mas corto", JOptionPane.DEFAULT_OPTION);
                cont = 1;
            }
            // Busca los circulos presionados
             for(Circulo objCirculo : Circulos)
             {
                if(new Rectangle(objCirculo.getX()-objCirculo.d/2,objCirculo.getY()-objCirculo.d/2,objCirculo.d,objCirculo.d).contains(me.getPoint()))
                {
                    // Codigo que realiza busqueda de camino mas corto
                    if("&".equals(go)){
                        go =  Integer.toString(get_pos(objCirculo));
                        objCirculo.set_Color(Color.red);
                        repaint(); 
                        // Se llama a clase Dijkstra para encontrar camino mas corto
                        Dijkstra d1 = new Dijkstra(Matriz_pe);
                        d1.calc(Circulos.size() ,get_pos(objCirculo));
                        for(int i=0 ; i < Circulos.size() ; i++ )
                        {
                            if ( i != get_pos(objCirculo)){
                                msg  +="Desde:"+name[get_pos(objCirculo)]+"\t destino:"+name[i]+"\t minCost:"+d1.distancia[i]+"\t" +"\n";
                            }
                        
                        }
                    } 
                    JOptionPane.showMessageDialog(null, msg,"Resultado", JOptionPane.DEFAULT_OPTION);
                    msg ="";
                    go = "&";
                    if ( end.equals("&") & go.equals("&")){
                         for(Circulo obj : Circulos) {obj.set_Color(Color.yellow);} 
                    }
                   }
                }
             }
       }
      if(me.getButton() == MouseEvent.BUTTON3)
      {
          pmenu.show(me.getComponent(),me.getX(),me.getY());
      }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    
    public String Mostrar(){
        String msg = " ";
       for(int i = 0 ; i < Matriz_pe.length ; i++){
           for(int y = 0; y < Matriz_pe.length;y++){
               msg +=Matriz_pe[i][y]+" |";
           }
           msg +="\n";
       }
       return msg;
   }
 // Obtener posicion con el nombre del nodo   
  public int get_pos( Circulo objCirculo)
  {
      int pos_1 = 0;
      if (objCirculo.nombre == "a") pos_1 = 0; 
      if (objCirculo.nombre == "b") pos_1 = 1;
      if (objCirculo.nombre == "c") pos_1 = 2;
      if (objCirculo.nombre == "d") pos_1 = 3;
      if (objCirculo.nombre == "e") pos_1 = 4;
      if (objCirculo.nombre == "f") pos_1 = 5;
      if (objCirculo.nombre == "g") pos_1 = 6;
      if (objCirculo.nombre == "h") pos_1 = 7;
      if (objCirculo.nombre == "i") pos_1 = 8;
      if (objCirculo.nombre == "j") pos_1 = 9;
      if (objCirculo.nombre == "k") pos_1 = 10;  
      return pos_1;
  }
}
