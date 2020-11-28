package Time;
public class TimeCalculator
{
int minutes = 0;
int seconds = 0;

    public void calcTimeforMaze(int totalDiamonds, int xSize, int ySize)//algún tipo de método que determina el tiempo que un jugador tiene para cada nivel según el tamaño del nivel y los diamantes.
    {
        if(xSize/ySize < 1)//este método debe cambiarse para proporcionar un sistema de tiempo más realista.
        {
            minutes += (ySize/xSize) * 1 + 1;
        }else{
            minutes += (ySize/xSize) * 1 + 1;
        }
        if(totalDiamonds > 6 && totalDiamonds*.10 + seconds <= 60)
            minutes += (ySize/xSize) * 1 + 1;
        else
        {
            minutes += 1;          
        }
        if(minutes == 0)
           minutes = 2;
     }//end method
    
    public int getMinutes()
    {
        return minutes;    
    }

    public int getSeconds()
    {
        return seconds;
    }
}//end class
