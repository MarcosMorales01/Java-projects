
package Dominio;

/**
 *
 * @author marcos
 */
public class Cafeteria {
    
    private int tarjetaDeComida;

    public int getTarjetaDeComida() {
        return tarjetaDeComida;
    }

    public void setTarjetaDeComida(int tarjetaDeComida) {
        this.tarjetaDeComida = tarjetaDeComida;
    }
    
    public Cafeteria(int tarjetaDeComida) {
        
        this.tarjetaDeComida = tarjetaDeComida;
    }
    
    public void obtenerComida(){
        
    }
    
}
