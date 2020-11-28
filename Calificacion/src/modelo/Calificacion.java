/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author julio-cabrera
 */
public class Calificacion {
    private String matricula;
    private String asignatura;
    private int cal;

    public Calificacion(String matricula, String asignatura, int calificacion) {
        this.matricula = matricula;
        this.asignatura = asignatura;
        this.cal = calificacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getCalificacion() {
        return cal;
    }

    public void setCalificacion(int calificacion) {
        this.cal = calificacion;
    }
        
}
