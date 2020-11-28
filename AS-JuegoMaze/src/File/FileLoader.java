package File;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;



public class FileLoader
{
    private int exitXCord = 0;
    private int exitYCord = 0;;
    private String[][] GameMatrix;
    private int column;
    private int row;
    
    public void loadFile(String fileName)
            
    {  
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(fileName));            
            String x;
            int lineNum = 0;
            
            while (( x = in.readLine()) != null) 
            { 
                MatrixLoader(x,lineNum);//pasar al método Matrix loader en la línea y el número de línea para el análisis.
                lineNum++;//Usaremos el número de línea más adelante en esta clase.
            }
         }//fin try
        catch (IOException e) 
        {  
            JFrame frame = new JFrame("Alert");
            JOptionPane.showMessageDialog(frame, "Ooops IOException error, i did it again!" + e.getMessage());
        }//fin catch
     }//fin del metodo load file
     
     public void MatrixLoader(String fileTextLine, int lineNum)throws gameFileError
     {
        // exitCount=0;//debemos restablecer sus variables a cero para el siguiente nivel.             
        
         int sum = 0;
         char textVar;
         
         if(lineNum == 0)//es la primera línea del archivo de laberinto, cree The Matrix basándose en la primera línea del archivo de laberinto
         { 
             for(int i = 0; i < fileTextLine.length(); i++)
             {
                 if(fileTextLine.charAt(i) == ' ')//encontrar un área en blanco en el número de la primera línea
                 sum += 1;//cuántos espacios en blanco entre el tamaño de la matriz, también conocido como 4 6 o 5 7
             } 
             int locationOfSpace = fileTextLine.indexOf(" ");//todavía manejando ese posible espacio en blanco en el tamaño de la matriz en el archivo
             String c1 = fileTextLine.substring(0,locationOfSpace);//ver arriba 
             String r1 = fileTextLine.substring(locationOfSpace+sum,fileTextLine.length());//ver arriba
             column = Integer.parseInt(c1);
             row = Integer.parseInt(r1);
             GameMatrix = new String[row][column];//crear una nueva matriz basada en el tamaño del archivo       
          }//final if 
          else
             for(int i = 0; i < fileTextLine.length(); i++)//no es la primera línea del archivo de laberinto
             {
                 textVar = fileTextLine.charAt(i); //coge los caracteres individuales de la cadena.
                 if(textVar == '.')//cambio . a N, por lo que no tenemos ningún problema tonto del sistema de archivos
                    textVar = 'N';
                 String textVar1 = "" + textVar;
                 if(textVar == 'E')//registrar la posición de la salida para su uso posterior
                 {
                  
                     exitXCord = lineNum - 1;
                     exitYCord = i;
                    // textVar='W';
                     textVar1= "" + textVar;//convierte la salida en una pared
                 }
                      GameMatrix[lineNum-1][i] = textVar1; //cargar la matriz con valores, aka N,W, D, H, etc
               }//fin del ciclo for
               
        
     }//fin del metodo matrixLoader 
     
     public String[][] getGameMatrix()
     { int exitCount = 0;
         int i1 = 0;
         int j1 = 0;
          //  playerCount=0;//debemos restablecer nuestras variables a cero para el siguiente nivel.
          //antes de devolver la matriz, haremos rápidamente una comprobación de errores
                       int playerCount = 0;
        for (int i = 0; i < GameMatrix.length; i++) {
            for (int j = 0; j < GameMatrix[i].length; j++) {
                if(GameMatrix[i][j].equals("P"))
                {                   playerCount += 1;
                  
                }
                else if(GameMatrix[i][j].equals("E"))
                {
                  exitCount += 1;   
                  i1 = i;
                  j1 = j;
                }
     System.out.println(playerCount + "playerCount");
        System.out.println(exitCount + "playerCount");

          }}//fin del doble ciclo
             if(playerCount > 1 || exitCount > 1)
             {
                // playerCount=0;//debemos restablecer nuestras variables a cero para el siguiente nivel.
                // exitCount=0;//debemos restablecer nuestras variables a cero para el siguiente nivel.
                 throw new gameFileError();
             }
             else
             GameMatrix[i1][j1] = "W";
             

         
         return GameMatrix;
     }//final del metodo getGameMatrix
     
     public int getMatrixSizeColumn()//regresa la matrixsize-column
     {
         return column;
     }
     
     public int getMatrixSizeRow()//regresa la matrix size-row
     {
         return row;
         
     }
     
   public int ExitXCord() //regresa las coordenadas X para la salida (Exit)
   {
      return exitXCord;
   }
   
   public int ExitYCord()//regresa las coordenadas Y para el Exit
   {
      return exitYCord; 
   }
   
   public int dimondCount()
   {
       int totalDimonds=0;
        for (int i = 0; i < GameMatrix.length; i++){
            for(int j = 0; j < GameMatrix[i].length; j++){
            if(GameMatrix[i][j].equals("D") || GameMatrix[i][j].equals("H"))
                totalDimonds += 1;
        }}//fin del doble ciclo
     return totalDimonds;//devuelve el número total de diamantes en el nivel
    }
    
    private class gameFileError extends RuntimeException //si un nivel está cargado con dos jugadores o dos salidas a través de este
    {
        public gameFileError()
        {
            JFrame frame = new JFrame("Alert");
            JOptionPane.showMessageDialog(frame, "Your maze file ether had more than one player, or more than one exit.");
         }
    }//fin de la clase interna
    

}//fin de la clase