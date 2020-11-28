
package Principal;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Nodo {
    
     String vertice ;
    int[] Distancia,Previo;
    boolean Visitado;
    int pos_d , pos_p;
    public Nodo(String a , int max)
    {
        this.vertice = a;
        this.Distancia = new int[max];
        this.Previo    = new int[max];
        this.Visitado = false;
        this.pos_d = 0;
        this.pos_p = 0;
    }
    public void D_agregar(int a)
    {
        if ( pos_d < Distancia.length)
        {
            Distancia[pos_d] = a;
            pos_d +=1;
        }
    }
     public void P_agregar(int a)
    {
        if ( pos_p < Previo.length)
        {
            Previo[pos_p] = a;
            pos_p +=1;
        }
    }  
}
