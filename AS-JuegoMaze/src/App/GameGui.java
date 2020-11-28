package App;
import File.TheArchitect;
import File.FileLoader;
import Score.HighScore;
import Score.ScoreGui;
import Time.TimeCalculator;
import Time.TimeKeeper;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.*;


public class GameGui extends JFrame implements ActionListener{
    private HighScore hs;  
    private int catFileName = 01;
    private Container cp;
    private FileLoader fl = new FileLoader();

    //crear elementos de menú
    private JMenuBar menuBar;
    private JMenu newMenu;
    private JMenuItem itemExit;
    private JMenuItem newGameItem;
    private JMenuItem openFileItem;
    private JMenuItem itemEnterName;
    private JMenuItem itemHighScore;
    private JMenuItem itemSaveScore;
    private JMenuItem restartLevel;
    //terminar de crear elementos de menú

    private JLabel shagLabel;
    private int ix;
    private int jx;
    private int timeLeft;
    private JPanel progBarPanel;
    private JLabel[][] labelMatrix;
    private TimeCalculator timeCalc;
    private  JProgressBar progressBar;
    private mazeObject mo;
    private JPanel newPanel; // = new JPanel();
    private TheArchitect theArc = new TheArchitect();
    private String[][] scrapMatrix; 
    private  Timer timely; 
    private TimeKeeper tk;
    private  String playerName;
    private int levelNum=1;
    private JLabel yousuckLabel;
    
    
    public static void main(String[] args)
    {
        new GameGui();
    }

    public GameGui()
    {
        super("Maze Minecraft"); //llamar a super para inicializar la barra de título de la G.U.I.
        cp = getContentPane();
        shagLabel = new JLabel("",new ImageIcon("MazeMinecraft.jpg"),JLabel.LEFT);//Fondo de GUI para carga inicial
        cp.add(shagLabel);
        
        //Agregar elementos de menú de salida y nuevos juegos
        itemExit = new JMenuItem("Exit");
        itemExit.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_X, KeyEvent.CTRL_MASK));//presionar CTRL+X para salir si tu quieres
        
        itemSaveScore = new JMenuItem("Save High Score");
        itemSaveScore.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_S, KeyEvent.CTRL_MASK));//presionar CTRL+S para guardar la puntuación más alta si quieres
        
        itemHighScore=new JMenuItem("High Score");
        itemHighScore.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_H, KeyEvent.CTRL_MASK));//presionar CTRL+H para ver la puntuacion más si quieres
        
        itemEnterName = new JMenuItem("Enter Player Name");
        itemEnterName.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_N, KeyEvent.CTRL_MASK));//presionar CTRL+N para introducir tu nombre si quieres
        newGameItem = new JMenuItem("New Game");
       
        openFileItem = new JMenuItem("Open Maze File");
        openFileItem.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_O, KeyEvent.CTRL_MASK));//presionar CTRL+O para abrir un nivel si quieres
        
        restartLevel = new JMenuItem("Restart level");
        restartLevel.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_R, KeyEvent.CTRL_MASK));//presionar CTRL+R para reiniciar
       
        newGameItem.setActionCommand("New Game"); //* Parece que esta opción no funciona 
        newGameItem.addActionListener(this);
        
        itemEnterName.setActionCommand("EnterName"); //* Funciona para que se sepa de quien es el puntaje
        itemEnterName.addActionListener(this);
        
        itemSaveScore.setActionCommand("SaveScore"); //* Funciona
        itemSaveScore.addActionListener(this);
        
        itemHighScore.setActionCommand("HighScore"); //* Funciona
        itemHighScore.addActionListener(this);
        
        itemExit.setActionCommand("Exit"); //* Funciona
        itemExit.addActionListener(this);
        
        openFileItem.setActionCommand("Open");
        openFileItem.addActionListener(this);
        
        restartLevel.setActionCommand("Restart");
        restartLevel.addActionListener(this);
        
        newMenu = new JMenu("File");
        newMenu.add(newGameItem);
        newMenu.add(itemEnterName);
        newMenu.add(restartLevel);
        newMenu.add(openFileItem);
        newMenu.add(itemHighScore);
        newMenu.add(itemSaveScore);
        newMenu.add(itemExit);
        
        
        
        //Agregar elemento de menú de salida
        //Agregar barra de menú
        menuBar = new JMenuBar();
        menuBar.add(newMenu);
        setJMenuBar(menuBar);
        
        //Agregar barra de menú     
        newPanel = new JPanel();
        hs = new HighScore();
        tk = new TimeKeeper();
        pack();
        setVisible (true);//mostrar nuestra barra de menú y shagLabel .. Yea baby Yea! Whoa .. demasiado java.
        setLocationRelativeTo(null);
        this.addWindowListener(new  WindowAdapter() {
            public void windowClosing(WindowEvent e) {
             System.exit(0);
            }
        });
        
    }//final del constructor
    
   
    

       
     
    private class MyKeyHandler extends KeyAdapter //captura el movimiento de las teclas de flecha
    {
        public void keyPressed (KeyEvent theEvent)
       {         
           switch (theEvent.getKeyCode())
           {
               case KeyEvent.VK_UP:
               {
               try {
                   theArc.playerMove(-1,0,scrapMatrix,fl.dimondCount());//Hágale saber al arquitecto que nos mudamos, junto con la matriz actual
                   loadMatrixGui("updateLoad");//recarga la interfaz gráfica de usuario para mostrar el movimiento
                   
                   if (theArc.getLevel() == true)
                   {
                       nextLevelLoad();//si el jugador golpea una puerta de salida, carga el siguiente nivel
                   }
                   break;
               } catch (TheArchitect.StupidAssMove ex) {
                   Logger.getLogger(GameGui.class.getName()).log(Level.SEVERE, null, ex);
               } catch (InterruptedException ex) {
                   Logger.getLogger(GameGui.class.getName()).log(Level.SEVERE, null, ex);
               }
              }
              case KeyEvent.VK_DOWN:
              {
               try {
                   theArc.playerMove(1,0,scrapMatrix,fl.dimondCount());//véase más arriba
                   loadMatrixGui("updateLoad");//véase más arriba
                   if (theArc.getLevel() == true)//véase más arriba
                   {
                       nextLevelLoad();//véase más arriba
                   }
                   break;
               } catch (TheArchitect.StupidAssMove ex) {
                   Logger.getLogger(GameGui.class.getName()).log(Level.SEVERE, null, ex);
               } catch (InterruptedException ex) {
                   Logger.getLogger(GameGui.class.getName()).log(Level.SEVERE, null, ex);
               }
             }
             case KeyEvent.VK_LEFT:
             {
               try {
                   theArc.playerMove(0,-1,scrapMatrix,fl.dimondCount());//véase más arriba
                   loadMatrixGui("updateLoad");//véase más arriba
                   if (theArc.getLevel() == true)//véase más arriba
                   {
                       nextLevelLoad();//véase más arriba
                   }
                   break;
               } catch (TheArchitect.StupidAssMove ex) {
                   Logger.getLogger(GameGui.class.getName()).log(Level.SEVERE, null, ex);
               } catch (InterruptedException ex) {
                   Logger.getLogger(GameGui.class.getName()).log(Level.SEVERE, null, ex);
               }
             }
             case KeyEvent.VK_RIGHT:
             { 
               try {
                   theArc.playerMove(0,1,scrapMatrix,fl.dimondCount()); //véase más arriba
                   loadMatrixGui("updateLoad");//véase más arriba
                   if (theArc.getLevel() == true)
                   {
                       nextLevelLoad();//véase más arriba
                   }   
                   break;
               } catch (TheArchitect.StupidAssMove ex) {
                   Logger.getLogger(GameGui.class.getName()).log(Level.SEVERE, null, ex);
               } catch (InterruptedException ex) {
                   Logger.getLogger(GameGui.class.getName()).log(Level.SEVERE, null, ex);
               }
             }
           }//final switch
           
           JLabel mainLabel = new JLabel("Total Dimonds Left to Collect "+theArc.getDimondsLeft()+"", JLabel.CENTER);//¡muestra cuántos diamantes quedan para recolectar en la interfaz gráfica de usuario!
           JPanel dimondsPanel = new JPanel();
           dimondsPanel.add(mainLabel);
           cp.add(dimondsPanel,BorderLayout.SOUTH);
       }//final del metodo
   }//final de la clase interna
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("Exit"))//salir en la barra de menú
        {
             new Timer(1000, updateCursorAction).stop();
             System.exit(0); //salir del sistema.   
        }
        else if (e.getActionCommand().equals("New Game"))//nuevo juego en la barra de menú
        {
           startGame(); 
        }
        else if(e.getActionCommand().equals("EnterName"))//Permite al usuario ingresar su nombre para obtener una puntuación más alta
        {
               JOptionPane optionPane = new JOptionPane();
               playerName = optionPane.showInputDialog("Please Enter your Earth Name");      
        }
        else if(e.getActionCommand().equals("HighScore"))//Muestra las puntuaciones más altas
        {
            ScoreGui sg = new ScoreGui();
            sg.ScoreGui();   
        }
        else if(e.getActionCommand().equals("SaveScore"))//permite al usuario guardar su puntuación en cualquier momento.
        {
            hs.addHighScore(playerName,tk.getMinutes(),tk.getSeconds(),levelNum);
        }
        else if(e.getActionCommand().equals("Open"))//para iniciar el juego tienes que abrir un archivo .maze: esto está en el menú
        { //*Los archivos maze estan en el proyecto netbeans 
            openFile();
        }else if(e.getActionCommand().equals("Restart")){
            restartLevel();   
            remove(yousuckLabel);
        }
     }//final del metodo actionPerformed 
     
     public void loadMatrixGui(String event)
     {
        if (event == "newLoad")
         {       
             remove(newPanel);//eliminar el juego del nivel anterior de la pantalla
             
             //* Checa que el if de abajo no tiene corchetes, puediendo causar algún conflicto en el codigo
             if(progBarPanel != null)//elimine la barra de progreso de la interfaz gráfica de usuario siempre que ya se haya creado.
             remove(progBarPanel);
             String[][] temp = fl.getGameMatrix();
             scrapMatrix = new String[fl.getMatrixSizeRow()][fl.getMatrixSizeColumn()];
             
             for (int i = 0; i < scrapMatrix.length; i++){
                for (int j = 0; j < scrapMatrix[i].length; j++){
                    scrapMatrix[i][j]= temp[i][j];//¡Cree una nueva matriz para que no tengamos una referencia a otra matriz de objetos!
              }}//final del doble bucle
             
             timeCalc = new TimeCalculator();//Crea la calculadora de tiempo utilizada para determinar cuánto tiempo se le da a cada nivel.
             timeCalc.calcTimeforMaze(fl.dimondCount(),fl.getMatrixSizeRow(),fl.getMatrixSizeColumn());//Deja que la calculadora de tiempo conozca los parámetros del juego. 
             
             timeLeft = timeCalc.getMinutes();//consigue los minutos permitidos para el nivel
             
             ix=timeCalc.getSeconds();//obtenga los segundos permitidos para el nivel.
             jx=0;//restablecer la variable utilizada para mantener el tiempo a cero ya que es un nuevo nivel
             
             timely = new Timer(1000,updateCursorAction);//create a timer to update the progress bar
             timely.start();//start the timer
             
             progBarPanel = new JPanel();//panel for progress bar
             
             progressBar = new JProgressBar(0, timeCalc.getMinutes()*100);//devuelve minutos de un solo dígito, tenemos que multiplicarlo por Bar.
             progressBar.setStringPainted(true);
             
             progBarPanel.add(progressBar);
             cp.add(progBarPanel,BorderLayout.NORTH);
             
             newPanel = new JPanel();
             newPanel.setLayout(new GridLayout(fl.getMatrixSizeRow(),fl.getMatrixSizeColumn()));//configura nuestro panel para el juego al tamaño de la matriz     
             labelMatrix=new JLabel[fl.getMatrixSizeRow()][fl.getMatrixSizeColumn()];
             newPanel.addKeyListener(new MyKeyHandler());
        }//fin if
        else if(event =="updateLoad")//cada vez que el jugador se mueve, la interfaz gráfica de usuario debe actualizarse.
        {
            scrapMatrix = theArc.getUpdatedMatrix();//obtener la nueva matriz para que se muestre del arquitecto
            remove(newPanel);//remover el antiguo juego
            newPanel = new JPanel();
            newPanel.setLayout(new GridLayout(fl.getMatrixSizeRow(),fl.getMatrixSizeColumn()));
            newPanel.addKeyListener(new MyKeyHandler());
            newPanel.grabFocus();        
        }
          for (int i = 0; i < labelMatrix.length; i++){
              for (int j = 0; j < labelMatrix[i].length; j++){
                  labelMatrix[i][j]=  mo = new mazeObject(scrapMatrix[i][j]);//agregue nuestras imágenes de laberinto en la interfaz gráfica de usuario
              }}//fin del doble bucle
         cp.add(newPanel);
         remove(shagLabel);//eliminar el fondo inicial del constructor
         
         System.gc();//forzar a Java a limpiar el uso de memoria.
         pack();
         setVisible (true);
         newPanel.grabFocus();  
     }//fin del metodo loadMatrixGui 
 
    public class mazeObject extends JLabel//clase interna para cada objeto de laberinto, también conocido como pared, jugador, etc.
    {
    private JLabel imageLabel;
        public mazeObject(String fileName)
        {
            fileName += ".png";
            JLabel fancyLabel;
            fancyLabel = new JLabel("",new ImageIcon(fileName),JLabel.LEFT);
            newPanel.add(fancyLabel);
        }
    }//end inner class
    
    public void startGame(){
        if(playerName == null || playerName.length() == 0){
            JOptionPane.showMessageDialog(null,"No a ingresado su player name");
        }else{
            fl.loadFile("level1.maz");//cargar el archivo que necesitamos
            theArc.setExit(fl.ExitXCord(),fl.ExitYCord());
            loadMatrixGui("newLoad");  
            remove(yousuckLabel);
        }
    }
    
    public void openFile(){
        JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showOpenDialog(this);
            if(returnVal == JFileChooser.APPROVE_OPTION) 
            {
                fl.loadFile(chooser.getSelectedFile().getName());//cargar el archivo que necesitamos
                theArc.setExit(fl.ExitXCord(),fl.ExitYCord());
                loadMatrixGui("newLoad"); 
                remove(yousuckLabel);
            }
    }
    
    public void restartLevel(){
        tk.TimeKeeper(timeLeft,ix);//El objeto TimeKeeper mantiene una pestaña en ejecución del tiempo total que el jugador ha utilizado (para puntuación más alta)
        timely.stop();//no cuente mientras cargamos el siguiente nivel.
        theArc = new TheArchitect();//enjuague todo de The Architect para que no obtengamos buenos resultados
        String fileName = "level"+catFileName+".maz";
        System.gc();
        fl.loadFile(fileName);//cargar el archivo que mecesitamos
        scrapMatrix = fl.getGameMatrix();//obtenga la nueva matriz del cargador de archivos para el siguiente nivel.
        theArc.setExit(fl.ExitXCord(),fl.ExitYCord());
        loadMatrixGui("newLoad");         
    }
        
    public void nextLevelLoad()
    {
        levelNum += 1;
        tk.TimeKeeper(timeLeft,ix);//El objeto TimeKeeper mantiene una pestaña en ejecución del tiempo total que el jugador ha utilizado (para puntuación más alta)
        timely.stop();//no cuente mientras cargamos el siguiente nivel.
        theArc = new TheArchitect();//enjuague todo de The Architect para que no obtengamos buenos resultados
        catFileName += 01;//el siguiente archivo que se cargará (número)
        String fileName = "level"+catFileName+".maz";
        System.gc();
        fl.loadFile(fileName);//cargar el archivo que mecesitamos
        scrapMatrix = fl.getGameMatrix();//obtenga la nueva matriz del cargador de archivos para el siguiente nivel.
        theArc.setExit(fl.ExitXCord(),fl.ExitYCord());
        loadMatrixGui("newLoad");         
    }
 
    Action updateCursorAction = new AbstractAction() {
    public void actionPerformed(ActionEvent e)throws SlowAssPlayer //esta clase interna genera una excepción si el jugador tarda mucho en terminar un nivel 
    {
        ix -= 1;
        jx += 1;
        if(ix < 0)
        {
            ix = 60;
            timeLeft -= 1;
        }
    if(timeLeft == 0 && ix == 0)
    {
        timely.stop();
        yousuckLabel = new JLabel("",new ImageIcon("Creeper.jpg"),JLabel.LEFT);
        cp.add(yousuckLabel);
        
        remove(newPanel);
        remove(progBarPanel);
        pack();
        setVisible (true);
        timely.stop();
        catFileName -= 01;
    if(catFileName < 01)
        throw new SlowAssPlayer("Slow ass took to long.");
    else
        loadMatrixGui("newLoad");
    }//final del primer if
        progressBar.setValue(jx);
        progressBar.setString(timeLeft+":"+ix);
    }//fin de actionPerformed
};//fin de clase

    private class SlowAssPlayer extends RuntimeException
    {
        public SlowAssPlayer(String event)
        {
            //el juego ha terminado, aquí debemos decirle su método de puntuación más alta para registrar los detalles.
            hs.addHighScore(playerName,tk.getMinutes(),tk.getSeconds(),levelNum);
            JFrame frame = new JFrame("Warning");
            JOptionPane.showMessageDialog(frame, "GAME OVER");//the entire game has ended.
        }
    }//fin de clase
    

}//fin de la clase    