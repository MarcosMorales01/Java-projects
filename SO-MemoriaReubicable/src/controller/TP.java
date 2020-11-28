
package controller;

import java.util.ArrayList;
import model.Particion;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public class TP {
    private ArrayList<Particion> particiones;

    
    
    public TP() {
        this.particiones = new ArrayList<>();
    }

    public TP(ArrayList<Particion> particiones) {
        this.particiones = particiones;
    }

    
    
    public ArrayList<Particion> getParticiones() {
        return particiones;
    }

    public void setParticiones(ArrayList<Particion> particiones) {
        this.particiones = particiones;
    }
    
    public void addProceso(Particion particion){
        this.particiones.add(particion);
    }
}
