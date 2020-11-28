
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public abstract class EmpleadoPorComision extends Empleado{
    protected int ventasBrutas;
    protected int tarifaDeComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, int numSeguroSocial, int ventasBrutas, int tarifaDeComision) {
        super(primerNombre, apellidoPaterno, numSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaDeComision = tarifaDeComision;
    }

    public int getVentasBrutas() {
        return ventasBrutas;
    }

    public int getTarifaDeComision() {
        return tarifaDeComision;
    }
    
    public double salarioTotal() {
        return ventasBrutas*tarifaDeComision;
    }
    
}
