
package Algoritmos;

import Proceso.Proceso;
import java.util.ArrayList;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Calendarizador {
    private ArrayList<Proceso> lista;
    
    public Calendarizador(ArrayList<Proceso> lista) {
        this.lista = lista;
    }
    
    public void executeFCFS(){
        FCFS fcfs = new FCFS(lista);
        fcfs.execute();
    }
    
    public void executeSJF(){
        SJF sjf = new SJF(lista);
        sjf.execute();
    }
    
    public void executeSRTF(){
        SRTF srtf = new SRTF(lista);
        srtf.execute();
    }
    
    public void executeRR(){
        RoundRobin rr = new RoundRobin(lista, 8);
        rr.execute();
    }
    
    public void executePrioridad(){
        Prioridad prio = new Prioridad(lista);
        prio.execute();
        
    }
}
