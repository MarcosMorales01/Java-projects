
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Oficial extends Vehiculo {
    private int horaDeSalida;

    public Oficial(String placa, int horaDeEntrada, int horaDeSalida) {
        super(placa, horaDeEntrada);
        this.horaDeSalida = horaDeSalida;
    }
    
    public String toString() {
        return "Placa: " + placa 
                + "\nHora de entrada: " + horaDeEntrada
                + "\nHora de Salida: " + horaDeSalida;
    }
}
