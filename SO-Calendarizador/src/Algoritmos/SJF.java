
package Algoritmos;

import Proceso.Proceso;
import java.util.ArrayList;
import java.util.Stack;
/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class SJF {
    private ArrayList<Proceso> processesList;
    private boolean isCPURunning;
    private Stack readyStack;
    private Stack finishedStack;
    private Proceso currentProcess;
    private int listSize;
    private int timer;
    
    public SJF(ArrayList<Proceso> processesList) {
        this.processesList = processesList;
        this.isCPURunning = false;
        this.readyStack = new Stack();
        this.finishedStack = new Stack();
        this.currentProcess = null;
        this.listSize = this.processesList.size();
        this.timer = 0;
    }
    
    public void execute(){
        
        while(this.finishedStack.size() != this.listSize){
            addNewProcess();
            runCPU();
        }
        
        printFinishedStack();
        printTimer();
        printTEP();
        printTTP();
    }
    
    
    //Valida procesos entrantes y los agrega a la pila de listos si no son nulos.
    private void addNewProcess(){
        Proceso process = getProcessComing();
        
        if(process!=null){
            this.readyStack.push(process);
        }
    }
    
    private void runCPU(){
        if(!this.isCPURunning){
            sortReadyStack();
            this.currentProcess = (Proceso)this.readyStack.firstElement();
            this.currentProcess.setTiempoEspera(this.timer - this.currentProcess.getTiempoLlegada());
            this.readyStack.remove(0);
            this.isCPURunning = true;
        }else{
            this.currentProcess.setTiempoTotal(this.timer - this.currentProcess.getTiempoLlegada());
            
            double dinamicRafaja = (this.currentProcess.getTiempoTotal() - this.currentProcess.getTiempoEspera());
        
            if(this.currentProcess.getRafaga() == dinamicRafaja){
                this.finishedStack.push(this.currentProcess);
                this.isCPURunning = false;
                this.timer--;
            }
            
            
            this.timer++;
            
            
        }
        
    }
    
    
    //Verifica si ha llegado un nuevo proceso.
    private Proceso getProcessComing(){
        Proceso process = null;
        for(int i=0;i<this.processesList.size();i++){
            if(this.processesList.get(i).getTiempoLlegada() == this.timer){
                process = this.processesList.get(i);
                this.processesList.remove(i);
                break;
            }
        }
        return process;
    }
    
    private void sortReadyStack(){
        
        Proceso buffer;
        int i,j;
        for(i = 0; i < readyStack.size(); i++){
            for(j = 0; j < i; j++){
                if(((Proceso)readyStack.get(i)).getRafaga()< ((Proceso)readyStack.get(j)).getRafaga())
                {
                    buffer = (Proceso)readyStack.get(j);
                    readyStack.set(j, readyStack.get(i));
                    readyStack.set(i, buffer);
                }
            }
        }     
    }
    
    private void printFinishedStack(){
        System.out.println("Pila de procesos finalizados\n");
        int limit = this.finishedStack.size();
        for(int i=0;i<limit;i++){
            Proceso proceso = (Proceso)this.finishedStack.get(i);
            System.out.println(proceso.toString());
        }
    }
    
    //Imprime tiempo espera promedio
    private void printTEP(){
        double time = 0;
        double average = 0;
        for(int i=0;i<this.finishedStack.size();i++){
            time = time + ((Proceso)this.finishedStack.get(i)).getTiempoEspera();
        }
        average = time/this.finishedStack.size();
        
        System.out.println("El tiempo de espera promedio es: " + average);
        
    }
    
    //Imprime tiempo total promedio
    private void printTTP(){
        double time = 0;
        double average = 0;
        for(int i=0;i<this.finishedStack.size();i++){
            time = time + ((Proceso)this.finishedStack.get(i)).getTiempoTotal();
        }
        average = time/this.finishedStack.size();
        
        System.out.println("El tiempo total promedio es: " + average);
    }
    
    private void printTimer(){
        System.out.println("El tiempo total de ejecución es: " + this.timer);
    }
}
