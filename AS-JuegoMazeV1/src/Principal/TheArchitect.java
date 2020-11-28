package Principal;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
//Tu vida es la suma del resto de una ecuación desequilibrada inherente a la programación
//de la matriz

public class TheArchitect extends JFrame {
    
   public void setExit(int registryX, int registryY) {//registra la ubicación de la salida para que podamos mostrarla cuando sea el momento
        wallXCord = registryX;
        wallYCord = registryY;  
    } 
   
   public void showWall() {//se usa cuando llega el momento de mostrar la salida.  
        updatedMatrix[wallXCord][wallYCord] = "E";  
    }

    public void playerMove(int xScale, int yScale, String[][] currentMatrix, int totalDimonds) throws StupidAssMove {
        int coordinateX = 0;
        int coordinateY = 0;
        int positionFound = 0;
        globalTotalDimonds = totalDimonds; //use esto más tarde para el recuento de diamantes de la interfaz gráfica de usuario
        nextLevel(false); //no vayas al siguiente nivel todavía.
        String[][] junkMatrix = currentMatrix;//actualizaremos Matrix actual 
        for (int i = 0; i < currentMatrix.length; i++) {//el ciclo for encontrará dónde está el jugador ahora
            for (int j = 0; j < currentMatrix[i].length; j++) {
                if(currentMatrix[i][j].equals("P")) {//Nosotros encontramos al jugador
                    coordinateX = i;//Registrar la posición de los jugadores
                    coordinateY = j;
                    positionFound = 1;
                    break;
                }
            }
        }//fin para ambos para bucles
            if(currentMatrix[coordinateX + xScale][coordinateY + yScale].equals("H")) {//es un diamante escondido
                currentMatrix[coordinateX][coordinateY] = "N";
                currentMatrix[coordinateX + xScale][coordinateY+yScale] = "P";
                currentMatrix[coordinateX][coordinateY] = "N";
                collected += 1;//tenemos un diamante escondido
            }
            else if(currentMatrix[coordinateX + xScale][coordinateY + yScale].equals("D")) {//Es un diamante 
                currentMatrix[coordinateX][coordinateY] = "N";
                currentMatrix[coordinateX + xScale][coordinateY + yScale] = "P";
                collected += 1;//Nosotros tenemos un diamante
            }
            else if(currentMatrix[coordinateX + xScale][coordinateY + yScale].equals("M") && currentMatrix[coordinateX + (xScale*2)][coordinateY + (yScale*2)].equals("N")) { //mover una pared movible
                currentMatrix[coordinateX][coordinateY] = "N";
                currentMatrix[coordinateX + xScale][coordinateY+yScale] = "P"; 
                currentMatrix[coordinateX + (xScale*2)][coordinateY + (yScale*2)] = "M";
            }
            else if (currentMatrix[coordinateX + xScale][coordinateY + yScale].equals("N")) {//normal avanzar hacia la nada
                currentMatrix[coordinateX][coordinateY] = "N";
                currentMatrix[coordinateX + xScale][coordinateY + yScale] = "P"; 
            }
            else if (currentMatrix[coordinateX + xScale][coordinateY + yScale].equals("E")) {//Esta es una salida
                currentMatrix[coordinateX][coordinateY] = "N";
                currentMatrix[coordinateX + xScale][coordinateY + yScale] = "P"; 
                nextLevel(true);//permitir que se cargue el siguiente nivel.
            }
            else
               throw new StupidAssMove("Ass Hole hit wall!");   
            if(collected == totalDimonds)//si tenemos todos los diamantes dale al jugador la salida
            showWall();
            updatedMatrix = currentMatrix;  //devolveremos Matrix actualizada para la interfaz gráfica de usuario                     
        }//end method

    public void nextLevel(boolean isTheNextLevel) {//cierto, pasamos al siguiente nivel, falso, actualizamos los niveles actuales de la interfaz gráfica de usuario.
        level = isTheNextLevel;
    }
    
    public boolean getLevel() {//Nivel de retorno verdadero o falso
        return level;
    }
        
    public int getDimondsLeft() {
        return globalTotalDimonds - collected;//para GUI JLabel, muestra cuántos diamantes quedan por recolectar
    }
    
    public String[][] getUpdatedMatrix() {//devuelve la matriz actualizada para que la interfaz gráfica de usuario la muestre
        return updatedMatrix;    
    }
    
    private class StupidAssMove extends RuntimeException {
        
        public StupidAssMove(String event) {
            JFrame frameWarning = new JFrame("Warning");
            JOptionPane.showMessageDialog(frameWarning, "You Stupid Ass, Ran into something did you?");
        }
    }//fin de la clase interna
    
int foundPlayer = 0;
String[][] updatedMatrix;
int wallXCord;
int wallYCord;
int collected = 0;
boolean level;
int globalTotalDimonds = 0;
}//fin de la clase