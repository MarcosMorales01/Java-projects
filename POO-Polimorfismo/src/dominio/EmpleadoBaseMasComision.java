
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private int salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, int numSeguroSocial, int ventasBrutas, int tarifaDeComision, int salarioBase) {
        super(primerNombre, apellidoPaterno, numSeguroSocial, ventasBrutas, tarifaDeComision);
        this.salarioBase = salarioBase;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public int getVentasBrutas() {
        return ventasBrutas;
    }

    public int getTarifaDeComision() {
        return tarifaDeComision;
    }
    
    public double calcularSalarioTotal() {
        double salarioNuevo = salarioBase + (salarioBase*.10);
        return salarioNuevo + (tarifaDeComision*ventasBrutas);
    }
    
}
