
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Pensionado extends Vehiculo {
    private int horaDeSalida;
    private int minutosAcumulados;

    public Pensionado(String placa, int horaDeEntrada, int horaDeSalida, int minutosAcumulados) {
        super(placa, horaDeEntrada);
        this.horaDeSalida = horaDeSalida;
        this.minutosAcumulados = minutosAcumulados;
    }
    
    public double calculoDeIngreso() {
        double ingreso = 0;
        ingreso = minutosAcumulados*0.02;
        return ingreso;
    }
    
    public String toString() {
        return "Placa: " + placa 
                + "\nHora de entrada: " + horaDeEntrada
                + "\nHora de Salida: " + horaDeSalida
                + "\nIngreso: " + calculoDeIngreso();
    }
    
}
