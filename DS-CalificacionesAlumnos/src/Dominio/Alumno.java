
package Dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Alumno {
    
    private ArrayList<String[]> infoAlumno;
    private ArrayList<String[]> calificaciones;
    
    public Alumno(ArrayList<String[]> informacion) {
        infoAlumno = new ArrayList<>(informacion);
        calificaciones = new ArrayList<>();
        
    }
    
    public void imprimirInfoAlumnos() {
        Iterator<String[]> i = infoAlumno.iterator();
        
        while(i.hasNext()){
            String[] elemento = i.next();
            System.out.print(Arrays.toString(elemento) +"\n");
        }
    }
    public void calificarAlumno() {
        
        Iterator<String[]> i = infoAlumno.iterator();
        Scanner teclado = new Scanner(System.in);
        String[] cal;
        
        while(i.hasNext()) {
            String c;
            String[] elemento = i.next();
            System.out.print(Arrays.toString(elemento) +"\n");
            System.out.print("Calificacion = ");
            c = teclado.nextLine();
            cal = c.split(" ");
            calificaciones.add(cal);
        }
        
    }

    public ArrayList<String[]> getInfoAlumno() {
        return infoAlumno;
    }

    public void setInfoAlumno(ArrayList<String[]> infoAlumno) {
        this.infoAlumno = infoAlumno;
    }

    public ArrayList<String[]> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<String[]> calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    
    
}
