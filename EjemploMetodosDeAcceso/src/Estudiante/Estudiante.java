
package Estudiante;

public class Estudiante {
    
    protected static int NUM_DE_EXAMENES;
    protected String nombre;
    protected double examen;
    protected double calificacionCurso;
    public int edad;
    private char sexo;
    
    public Estudiante(){
        
    }
    
    public String obtenerCalificacion(){
      
        return "20";
    }
    
    public String obtenerNombre(){
        
        return nombre;
    }
    
    /* PARA EL MAIN
crear estudiante gradudo, com datos
crear estudiante no graduado con datos

*/
}
