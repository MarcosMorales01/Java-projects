
package test;

import controller.ControlRAM;
import model.Proceso;

/**
 *
 * @author Jorge Guerrero, Javier Fernando Chi
 */
public class Main {
    public static void main(String[] args) {
        ControlRAM controller = new ControlRAM();
        //controller.setFirstOrder();
        controller.setmejorAjuste();
        //controller.setWorstOrder();
        controller.procesoEntrante(new Proceso("P1", 78, Proceso.ASSIGNED));
        controller.procesoEntrante(new Proceso("P2", 82, Proceso.ASSIGNED));
        controller.procesoEntrante(new Proceso("P3", 60, Proceso.ASSIGNED));
        controller.procesoEntrante(new Proceso("P4", 94, Proceso.ASSIGNED));
        controller.procesoEntrante(new Proceso("P5", 74, Proceso.ASSIGNED));
        controller.procesoFinalizado("P3");
        controller.procesoEntrante(new Proceso("P6", 96, Proceso.ASSIGNED));
        controller.procesoFinalizado("P2");
        controller.procesoEntrante(new Proceso("P7", 74, Proceso.ASSIGNED));
        controller.procesoFinalizado("P5");
        controller.procesoFinalizado("P1");
        controller.procesoEntrante(new Proceso("P8", 44, Proceso.ASSIGNED));
        controller.procesoEntrante(new Proceso("P9", 28, Proceso.ASSIGNED));
    }
}
