package Time;
public class TimeKeeper
{
    public void TimeKeeper(int min, int sec)//una clase para realizar un seguimiento del total de segundos y minutos que el jugador ha utilizado para llegar a un nivel
	{ 
	   if(sec + seconds <= 60)
	    {
	        minutes += min;
	        seconds = sec + seconds;
    	}
	   else
	   {
	       minutes += min;
	       minutes += 1 * ((sec+seconds) / 60);
	       seconds = (sec+seconds)%60;
	   }
	}//fin TimeKeeper
	
	public int getMinutes()
	{
	    return minutes;
	}
	
	public int getSeconds()
	{
	    return seconds;
	}
	
int minutes=0; 
int seconds=0;
}//fin de clase
