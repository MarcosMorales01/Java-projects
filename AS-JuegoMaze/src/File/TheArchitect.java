package File;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
//Tu vida es la suma del resto de una ecuación desequilibrada inherente a la programación
//de la matriz

public class TheArchitect extends JFrame
{
   public void setExit(int x, int y)//registra la ubicación de la salida para que podamos mostrarla cuando sea el momento
   {
       WallXCord = x;
       WallYCord = y;  
   } 
   public void showWall()//se usa cuando llega el momento de mostrar la salida.  
   {
       updatedMatrix[WallXCord][WallYCord] = "E";  
   }

    public void playerMove(int xScale, int yScale, String[][] currentMatrix,int totalDimonds)throws StupidAssMove, InterruptedException
    {
       int x = 0;
       int y = 0;
       int found = 0;
       
       globalTotalDimonds = totalDimonds; //use esto más tarde para el recuento de diamantes de la interfaz gráfica de usuario
       nextLevel(false); //no vayas al siguiente nivel todavía.
       
       String[][] junkMatrix = currentMatrix;//actualizaremos Matrix actual 
        for (int i = 0; i < currentMatrix.length; i++) //el ciclo for encontrará dónde está el jugador ahora
        {
        for (int j = 0; j < currentMatrix[i].length; j++) 
        {
           if(currentMatrix[i][j].equals("P"))//Nosotros encontramos al jugador
           {
            x = i;//Registrar la posición de los jugadores
            y = j;
            found = 1;
            break;
           }
        }}//fin para ambos para bucles
            if(currentMatrix[x+xScale][y+yScale].equals("H"))//es un diamante escondido
            {
                currentMatrix[x][y] = "N";
                currentMatrix[x+xScale][y+yScale] = "P";
                currentMatrix[x][y] = "N";
                collected += 1;//tenemos un diamante escondido! ¡Guauu!
            }
            else if(currentMatrix[x+xScale][y+yScale].equals("D"))//Es un diamante
               
            {
                currentMatrix[x][y] = "N";
                currentMatrix[x+xScale][y+yScale] = "P";
                collected+=1;//Nosotros tenemos un diamante
            }
            else if(currentMatrix[x+xScale][y+yScale].equals("M") && currentMatrix[x+(xScale*2)][y+(yScale*2)].equals("N"))//mover una pared movible
            {
                currentMatrix[x][y] = "N";
                currentMatrix[x+xScale][y+yScale] = "P"; 
                currentMatrix[x+(xScale*2)][y+(yScale*2)] = "M";
            }
            else if (currentMatrix[x+xScale][y+yScale].equals("N"))//normal avanzar hacia la nada
            {
                currentMatrix[x][y] = "N";
                currentMatrix[x+xScale][y+yScale] = "P"; 
            }
            else if (currentMatrix[x+xScale][y+yScale].equals("E"))//Esta es una salida
            {
                currentMatrix[x][y] = "N";
                currentMatrix[x+xScale][y+yScale] = "P"; 
                nextLevel(true);//permitir que se cargue el siguiente nivel.
            }
            else
               throw new StupidAssMove("Ass Hole hit wall!");
                
            if(collected == totalDimonds)//si tenemos todos los diamantes dale al jugador la salida
            showWall();
               
            updatedMatrix = currentMatrix;  //devolveremos Matrix actualizada para la interfaz gráfica de usuario                     
        }//end method

    public void nextLevel(boolean tOrF)//cierto, pasamos al siguiente nivel, falso, actualizamos los niveles actuales de la interfaz gráfica de usuario.
    {
        level = tOrF;
    }
    
    public boolean getLevel()//Nivel de retorno verdadero o falso
    {
        return level;
    }
        
    public int getDimondsLeft()
    {
        return globalTotalDimonds-collected;//para GUI JLabel, muestra cuántos diamantes quedan por recolectar
    }
    
    public String[][] getUpdatedMatrix()//devuelve la matriz actualizada para que la interfaz gráfica de usuario la muestre
    {
        return updatedMatrix;    
    }
    
    public class StupidAssMove extends RuntimeException
    {
         public StupidAssMove(String event) throws InterruptedException
         {
             reproducirSonido("MD.wav");
         }
         
         public void reproducirSonido(String nombreSonido) throws InterruptedException{
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
               System.out.println("Error al reproducir el sonido.");
            }
        }
         
    }//fin de la clase interna
    
int foundPlayer = 0;
String[][] updatedMatrix;
int WallXCord;
int WallYCord;
int collected = 0;
boolean level;
int globalTotalDimonds = 0;
}//fin de la clase
