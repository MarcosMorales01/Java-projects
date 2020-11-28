
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class EmpleadoAsalariado extends Empleado {
    private int salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, int numSeguroSocial, int salarioSemanal) {
        super(primerNombre, apellidoPaterno, numSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }
    
    public int getSalarioSemanal() {
        return salarioSemanal;
    }
    
    
}
