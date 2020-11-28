
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Normal extends Vehiculo {
    private int horaDeSalida;
    
    public Normal(String placa, int horaDeEntrada, int horaDeSalida) {
        super(placa, horaDeEntrada);
        this.horaDeSalida = horaDeSalida;
    }
    
    public double calculoDeIngreso() {
        double ingreso = 0;
        ingreso = (horaDeSalida - horaDeEntrada)*0.20;
        return ingreso;
    }

    @Override
    public String toString() {
        return "Placa: " + placa 
                + "\nHora de entrada: " + horaDeEntrada
                + "\nHora de Salida: " + horaDeSalida
                + "\nIngreso: " + calculoDeIngreso();
    }
    
    
}
