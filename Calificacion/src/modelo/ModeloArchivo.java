/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author julio-cabrera
 */
public class ModeloArchivo {

    public List<CSVRecord> obtenerRegistros(String ruta) throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(ruta));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .withIgnoreHeaderCase()
                .withTrim());
        return csvParser.getRecords();
    }

    public void generar(String ruta, List<Calificacion> alumnos) {
        try {
            BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(ruta), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            CSVPrinter csvPrinter = new CSVPrinter(bufferedWriter, CSVFormat.EXCEL);
            List<Object[]> convertidos = convertirRegistros(alumnos);
            csvPrinter.printRecords(convertidos);
            csvPrinter.flush();
            bufferedWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ModeloArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Object[]> convertirRegistros(List<Calificacion> alumnos) {
        List<Object[]> registros = alumnos
                .stream()
                .map(alumno -> new Object[]{alumno.getMatricula(), alumno.getAsignatura(), alumno.getCalificacion()})
                .collect(Collectors.toList());
        return registros;
    }
}
