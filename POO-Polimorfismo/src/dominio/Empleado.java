
package dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public  abstract class Empleado {
    protected String primerNombre;
    protected String apellidoPaterno;
    protected int numSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, int numSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numSeguroSocial = numSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getNumSeguroSocial() {
        return numSeguroSocial;
    }

    public void setNumSeguroSocial(int numSeguroSocial) {
        this.numSeguroSocial = numSeguroSocial;
    }

    public String toStringEmpleado() {
        return "Nombre: " + primerNombre + "\nApellido: " + apellidoPaterno 
                + "\nNumero de seguro social: " + numSeguroSocial;
    }
    
}
