
package controller;

import java.util.ArrayList;
import model.AreaLibre;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public class TAL {
    private ArrayList<AreaLibre> AL;


    public TAL() {
        this.AL = new ArrayList<>();
    }

    public TAL(ArrayList<AreaLibre> AL) {
        this.AL = AL;
    }




    public ArrayList<AreaLibre> getAL() {
        return AL;
    }

    public void setAL(ArrayList<AreaLibre> AL) {
        this.AL = AL;
    }

    public void addAreaLibre(AreaLibre area){
        this.AL.add(area);
    }
}
