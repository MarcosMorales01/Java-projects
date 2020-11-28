package Principal;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FileLoader {
    public void loadFile(String fileName) {  
        try {
                BufferedReader inTheFileName = new BufferedReader(new FileReader(fileName));            
                String x;
                int lineFileNum = 0;
                while ((x = inTheFileName.readLine()) != null) {
                    MatrixLoader(x,lineFileNum);//pasar al método 
                    //Matrix loader en la línea 
                    //y el número de línea para el análisis.
                    lineFileNum++;//Usaremos el número de línea más adelante en esta clase.
                }
            }//fin try
        catch (IOException e) { 
            JFrame frameError = new JFrame("Alert");
            JOptionPane.showMessageDialog(frameError, "Ooops IOException error, i did it again!" + e.getMessage());
        }//fin catch
    }//fin del metodo load columnFile
     
    public void MatrixLoader(String fileTextLine, int lineNum) throws gameFileError {
        int sumWhiteSpaces = 0;
        char textVar;
        if(lineNum == 0) {//indica la primera línea del archivo de laberinto, sea crea The Matrix basándose en la primera línea del archivo de laberinto 
            for(int i = 0; i < fileTextLine.length(); i++) {
                if(fileTextLine.charAt(i) == ' ') {//encontrar un área en blanco en el número de la primera línea
                    sumWhiteSpaces += 1;//numero de espacios en blanco entre el tamaño de la matriz, también llamado como 4 6 o 5 7
                }
            } 
            int locationOfSpace = fileTextLine.indexOf(" ");//todavía manejando ese posible espacio en blanco en el tamaño de la matriz en el archivo
            String columnLine = fileTextLine.substring(0, locationOfSpace);
            String rowLine = fileTextLine.substring(locationOfSpace + sumWhiteSpaces, fileTextLine.length());
            columnFile = Integer.parseInt(columnLine);
            rowFile = Integer.parseInt(rowLine);
            gameMatrix = new String[rowFile][columnFile];//crear una nueva matriz basada en el tamaño del archivo       
         }//final if 
          else
            for(int i = 0; i < fileTextLine.length(); i++) {//no es la primera línea del archivo de laberinto
                textVar = fileTextLine.charAt(i); //coge los caracteres individuales de la cadena.
                if(textVar == '.') {//cambio . a N, por lo que no tenemos ningún problema del sistema de archivos
                    textVar = 'N';
                }
                String textVar1 = "" + textVar;
                if(textVar == 'E') {//registrar la posición de la salida para su uso posterior
                    exitXCord = lineNum - 1;
                    exitYCord = i;
                    textVar1= "" + textVar;//convierte la salida en una pared
                }
                    gameMatrix[lineNum - 1][i] = textVar1; //cargar la matriz con valores, aka N,W, D, H, etc
            }//fin del ciclo for    
    }//fin del metodo matrixLoader 
     
    public String[][] getGameMatrix() {
        int exitCount = 0;
        int i1 = 0;
        int j1 = 0; 
        //antes de devolver la matriz, haremos rápidamente una comprobación de errores
        int playerCount = 0; //debemos restablecer nuestras variables a cero para el siguiente nivel.
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) {
                if(gameMatrix[i][j].equals("P")) {
                    playerCount += 1;
                }
                else if(gameMatrix[i][j].equals("E")) {
                    exitCount += 1;   
                    i1 = i;
                    j1 = j;
                }
                System.out.println(playerCount + "playerCount");
                System.out.println(exitCount + "playerCount");
            }
        }//fin del doble ciclo
            if(playerCount > 1 || exitCount > 1) {
                throw new gameFileError();
            } else
            gameMatrix[i1][j1] = "W"; 
        return gameMatrix;
    }//final del metodo getGameMatrix
     
    public int getMatrixSizeColumn() {
        return columnFile;
    }
     
    public int getMatrixSizeRow() {
        return rowFile; 
    }
     
    public int ExitXCord() {
        return exitXCord;
    }
   
   public int ExitYCord() {
        return exitYCord; 
    }
   
   public int dimondCount() {
        int totalDimonds = 0;
        for (int i = 0; i < gameMatrix.length; i++) {
            for(int j = 0; j < gameMatrix[i].length; j++) {
            if(gameMatrix[i][j].equals("D") || gameMatrix[i][j].equals("H"))
                totalDimonds += 1;
            }
        }//fin del doble ciclo
        return totalDimonds;
    }
    
    private class gameFileError extends RuntimeException { //si un nivel está cargado con dos jugadores o dos salidas a través de este
        
        public gameFileError() {
            JFrame frame = new JFrame("Alert");
            JOptionPane.showMessageDialog(frame, "Your maze file ether had more than one player, or more than one exit.");
        }
    }//fin de la clase interna   
private int exitXCord = 0;
private int exitYCord = 0;;
private String[][] gameMatrix;
private int columnFile;
private int rowFile;
}//fin de la clase