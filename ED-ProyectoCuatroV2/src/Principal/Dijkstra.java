
package Principal;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Dijkstra {
    int[][] Matriz;
    int [] distancia;
    public Dijkstra( int [][] m)
    {
        this.Matriz = m;
        this.distancia = new int[m.length];
    }
    public void calc(int n,int origen)
     {
      int flag[] = new int[n+1];
      int i,minpos=1,k,c,minimo;
      //llenamos al vector distancia la primera fila de la  matriz
      for(i=0;i<=n;i++)
      {  
          flag[i]=0; 
          this.distancia[i]=this.Matriz[origen][i]; 
      }
      c=2;
      while(c<=n)
      {
        minimo=99;
        for(k=0;k<=n;k++)
        { 
           if(this.distancia[k]<minimo && flag[k]!=1)
           {
            minimo=this.distancia[i];
            minpos=k;
           }
        } 
        flag[minpos]=1;
        c++;
        // this.distancia [] y this.Matriz[][] se refiere basicamente a la distancia del objeto a
        for(k=0;k<=n;k++)
        {
             if(this.distancia[minpos]+this.Matriz[minpos][k] <  this.distancia[k] && flag[k]!=1 )this.distancia[k]=this.distancia[minpos]+this.Matriz[minpos][k];
        }   
      } 
     }
    
}
