
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public abstract class Vehiculo {
    protected String placa;
    protected int horaDeEntrada;

    public Vehiculo(String placa, int horaDeEntrada) {
        this.placa = placa;
        this.horaDeEntrada = horaDeEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(int horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }
    
}
