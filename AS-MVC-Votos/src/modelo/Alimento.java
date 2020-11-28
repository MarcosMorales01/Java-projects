
package modelo;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Alimento {
    private int numDeVotos;
    private String fechaDeRegistro;
    
    public int getNumDeVotos() {
        return numDeVotos;
    }

    public void setNumDeVotos(int numDeVotos) {
        this.numDeVotos = numDeVotos;
    }

    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }
    
    public void contadorDeVotos() {
        this.numDeVotos++;
    }
}
