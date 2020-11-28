/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author julio-cabrera
 */
public class ModeloRegistro {

    private List<Calificacion> alumnosCalificados;
    private ModeloArchivo archivo;
    private String rutaRegistrados;

    public ModeloRegistro(String ruta) {
        this.alumnosCalificados = new ArrayList<>();
        this.archivo = new ModeloArchivo();
        rutaRegistrados = ruta;
    }

    public void mostrarAlumnos() throws Exception {
        mostrar(archivo.obtenerRegistros(this.rutaRegistrados));
    }

    public void guardarArchivoCalificados(String ruta) throws Exception {
        if (alumnosCalificados.size() == archivo.obtenerRegistros(rutaRegistrados).size()) {
            archivo.generar(ruta, alumnosCalificados);
            System.out.println("Se generó el archivo de calificaciones");
        } else {
            System.out.println("No se puede generar el archivo");
        }
    }

    public void guardarCalificacion(Calificacion calificacion) {
        alumnosCalificados.add(calificacion);
    }

    public void mostrar(List<CSVRecord> alumnos) {
        alumnos.forEach(x -> {
            System.out.println("------------------------");
            System.out.println("Matricula:" + x.get("matricula"));
            System.out.println("Primer Apellido:" + x.get("primerApellido"));
            System.out.println("Segundo Apellido:" + x.get("segundoApellido"));
            System.out.println("Nombres:" + x.get("nombres"));
        });
    }

    public void guardarCalificados() throws FileNotFoundException, DocumentException, IOException {
        Pdf pdf = new Pdf();
        List<CSVRecord> alumnos = archivo.obtenerRegistros(rutaRegistrados);
        ArrayList<Formato> calificados = new ArrayList<>();
        for (CSVRecord alumno : alumnos) {
            for (Calificacion cal : alumnosCalificados) {
                if (alumno.get("matricula").equals(cal.getMatricula())) {
                    calificados.add(new Formato(alumno.get("primerApellido") + " " + alumno.get("segundoApellido") + " " + alumno.get("nombres"), String.valueOf(cal.getCalificacion())));
                } else {
                    calificados.add(new Formato(alumno.get("primerApellido") + " " + alumno.get("segundoApellido") + " " + alumno.get("nombres"), "S/C"));
                }
            }
        }
        
        if (calificados.size() == 0) {
            for (CSVRecord alumno : alumnos) {
                calificados.add(new Formato(alumno.get("primerApellido") + " " + alumno.get("segundoApellido") + " " + alumno.get("nombres"), "S/C"));
            }
            pdf.crear(calificados);
        } else {
            pdf.crear(calificados);
        }
    }

    public void obtenerNoCalificados() {
        try {
            List<String> registrados = archivo
                    .obtenerRegistros(rutaRegistrados)
                    .stream()
                    .map(registrado -> registrado.get("matricula"))
                    .collect(Collectors.toList());
            List<String> calificados = alumnosCalificados
                    .stream()
                    .map(registrado -> registrado.getMatricula())
                    .collect(Collectors.toList());
            List<String> noCalificados = registrados
                    .stream()
                    .filter(registrado -> !calificados.contains(registrado))
                    .collect(Collectors.toList());
            System.out.println("Matriculas de No calificados");
            noCalificados.forEach(System.out::println);
        } catch (IOException ex) {
            Logger.getLogger(ModeloRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
