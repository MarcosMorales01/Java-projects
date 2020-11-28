package Score;
import java.util.*;
import java.io.*;
import java.beans.*; 

public class HighScore
{
    public void addHighScore(String name, int min, int sec,int level)
    {
        try{
               String outData = "PlayerName: " + name + " Total Time for Levels:" + min + ":" + sec + "(Minutes:Seconds)" + "Level Reached:*" + level;
               PrintWriter out = new PrintWriter(new FileOutputStream("scores.txt",true));
               
               out.println("");
               out.println(outData);
               out.close();
               
    }//imprime los datos de la puntuación más alta en scores.txt
        catch(Exception ex){
            System.out.println(ex);
       }//fin del catch
	    
    }//fin del addHighScore   
}//fin de la clase

