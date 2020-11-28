package Main;

import Algoritmos.Calendarizador;
import Proceso.Proceso;
import java.util.ArrayList;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Proceso> arrayList = new ArrayList<>();
        Calendarizador calend;
        /*
        public Proceso(String nombre, double tiempoLlegada, double rafaga, int prioridad, String estado)
         */
        arrayList.add(new Proceso("A", 0, 20, 6, "activo"));
        arrayList.add(new Proceso("B", 4, 26, 9, "activo"));
        arrayList.add(new Proceso("C", 8, 12, 3, "activo"));
        arrayList.add(new Proceso("D", 12, 14, 9, "activo"));
        arrayList.add(new Proceso("E", 20, 28, 1, "activo"));
        arrayList.add(new Proceso("F", 18, 22, 5, "activo"));
        //arrayList.add(new Proceso("proceso7", 20, 12, 4, "activo"));
        //arrayList.add(new Proceso("proceso8", 22, 18, 8, "activo"));

        calend = new Calendarizador(arrayList);
       // calend.executeSRTF();
//        calend.executeFCFS();
        //calend.executePrioridad();
        calend.executeRR();
        //calend.executeSJF();
    }

}
