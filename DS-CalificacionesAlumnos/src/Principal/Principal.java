
package Principal;

import Dominio.Alumno;
import Dominio.Archivo;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Principal {
    
    public static void main(String[] args) throws IOException, CsvValidationException {
        Archivo a = new Archivo();
        //a.leerArchivoOrdenador();
        //a.imprimirDatosDelArchivoOrdenador();
        //a.interpretarDatosDelArchivoOrdenador();
        a.leerArchivo();
        //a.imprimirDatosDelArchivo();
        
        Alumno alum = new Alumno(a.getInformacion());
        
        //alum.calificarAlumno();
        //alum.imprimirInfoAlumnos();
        
        //a.generarArchivo(alum.getCalificaciones());
        
    }
    
}
