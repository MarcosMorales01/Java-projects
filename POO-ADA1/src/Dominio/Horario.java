
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Horario {
    
    private int horaDeInicio;
    private int minutosDeInicio;
    private int horaFinal;
    private int minutosFinal;
    

    @Override
    public String toString() {
        return horaDeInicio 
                + ":" + minutosDeInicio + "-" + horaFinal 
                + ":" + minutosFinal;
    }

    public Horario(int horaDeInicio, int minutosDeInicio, int horaFinal, int minutosFinal) {
        this.horaDeInicio = horaDeInicio;
        this.minutosDeInicio = minutosDeInicio;
        this.horaFinal = horaFinal;
        this.minutosFinal = minutosFinal;
    }

    public int getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(int horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public int getMinutosDeInicio() {
        return minutosDeInicio;
    }

    public void setMinutosDeInicio(int minutosDeInicio) {
        this.minutosDeInicio = minutosDeInicio;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getMinutosFinal() {
        return minutosFinal;
    }

    public void setMinutosFinal(int minutosFinal) {
        this.minutosFinal = minutosFinal;
    }
    
    public void validarHora(int horaI, int minutosI, int horaF, int minutosF) {
        
        if(horaI > 24 || horaF > 24) {
            System.out.println("Error en horas");
        }
         if(minutosI > 59 || minutosF > 59) {
            System.out.println("Error en minutos");
        }   
    }

}
