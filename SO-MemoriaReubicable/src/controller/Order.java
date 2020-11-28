
package controller;

import model.Proceso;

/**
 *
 * @author Jorge Guerrero, Javier Fernancdo Chi
 */
public abstract class Order {
    public void commingProcess() { }
    public void endProcess() { }
    public abstract TAL getTal();
    public abstract TP getTp();
    public abstract boolean getPrint();
    public void setTal(TAL tal) { }
    public void setTp(TP tp) { }
    public void setProcess(Proceso process) { }
}
