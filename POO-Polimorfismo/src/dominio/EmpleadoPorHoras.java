
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class EmpleadoPorHoras extends Empleado {
    private int sueldoPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, int numSeguroSocial, int sueldoPorHora, int horasTrabajadas) {
        super(primerNombre, apellidoPaterno, numSeguroSocial);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    public int getSueldoPorHora() {
        return sueldoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public double calcularSueldo() {  
        double sueldoTotal = 0;
        if (horasTrabajadas <= 40) {
            sueldoTotal = horasTrabajadas*sueldoPorHora;
        } else if (horasTrabajadas > 40) {
            sueldoTotal = (40*sueldoPorHora) + (horasTrabajadas - 40)*(sueldoPorHora + 1.5);
        } 
        return sueldoTotal;
    }
}
