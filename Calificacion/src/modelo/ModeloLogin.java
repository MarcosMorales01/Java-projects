/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author julio-cabrera
 */
public class ModeloLogin {

    public boolean verificar(String ruta,String usuario,String contrasena) throws Exception {
        Reader reader = Files.newBufferedReader(Paths.get(ruta));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .withIgnoreHeaderCase()
                .withTrim());
        List<CSVRecord> usuarios = csvParser.getRecords();
        Encriptamiento encrip = new Encriptamiento();
        String descifrada = encrip.descifrar(contrasena);
        for (CSVRecord user : usuarios) {
            if(user.get("usuario").equals(usuario) && user.get("contrasena").equals(descifrada)){
                return true;
            }
        }
        
        return false;
    }

}
