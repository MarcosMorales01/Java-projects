
package model;

import java.util.ArrayList;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public class RAM {
    private int totalTam;
    private int tamOS;
    private ArrayList<Particion> particiones;

    public RAM() {
    }

    public RAM(int totalTam, int tamOS) {
        this.totalTam = totalTam;
        this.tamOS = tamOS;
    }
    
    public RAM(int totalTam, int tamOS, ArrayList<Particion> particiones) {
        this.totalTam = totalTam;
        this.tamOS = tamOS;
        this.particiones = particiones;
    }
    
    
    public int getTotalTam() {
        return totalTam;
    }

    public void setTotalTam(int totalTam) {
        this.totalTam = totalTam;
    }

    public int getTamOS() {
        return tamOS;
    }

    public void setTamOS(int tamOS) {
        this.tamOS = tamOS;
    }

    public ArrayList<Particion> getParticiones() {
        return particiones;
    }

    public void setParticiones(ArrayList<Particion> particiones) {
        this.particiones = particiones;
    }

   
    
    
}
