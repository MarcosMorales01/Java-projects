
package Dominio;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Archivo {
    private ArrayList<String[]> informacion;
    private String archivoOrdenadorCompleto; 
    private String rutaCsvAlumnos;
    private String rutaArchivoOrdenador;
    private int columnaMatricula;
    private int columnaNombres;
    private int columnaApellidoUno;
    private int columnaApellidoDos;
    
    public ArrayList<String[]> getInformacion() {
        return informacion;
    }

    public void setInformacion(ArrayList<String[]> informacion) {
        this.informacion = informacion;
    }
     
    
    public Archivo() {
        informacion = new ArrayList<>();
        rutaCsvAlumnos = "D:\\Equipo 2\\Morales\\Documents"
                 + "\\UADY\\4° Semestre\\Diseño de Software-Acomp\\alumnos.csv";
        rutaArchivoOrdenador = "D:\\Equipo 2\\Morales\\Documents"
                 + "\\UADY\\4° Semestre\\Diseño de Software-Acomp\\archivoOrdenador.txt";
        archivoOrdenadorCompleto = "";
    }
    
    public void leerArchivo() throws CsvValidationException, IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(rutaCsvAlumnos));
            String linea = br.readLine();
            String[] campos;
         
            while (null != linea) {
                campos = linea.split(",");
                informacion.add(campos);
                //System.out.println(Arrays.toString(campos));
                linea = br.readLine();
            }
        } catch (IOException e) {
        } finally {
            if (null != br) {
                br.close();
            }
      }
        
        /*
        CSVReader csvReader = new CSVReader(new FileReader(rutaCsvAlumnos));
        String[] fila = null;
        while((fila = csvReader.readNext()) != null) {
            System.out.println(fila[0]);
        }
        csvReader.close();
        */
    }
    
    public void imprimirDatosDelArchivo() {
        Iterator<String[]> i = informacion.iterator();
        while(i.hasNext()){
            String[] elemento = i.next();
            System.out.print(Arrays.toString(elemento) +"\n");
        }
    }
    
    public void imprimirDatosDelArchivoOrdenador() {
        System.out.println(archivoOrdenadorCompleto);
    }
    
    public void generarArchivo(ArrayList<String[]> calificaciones) throws IOException {
      CSVWriter escritor = new CSVWriter(new FileWriter("D:\\Equipo 2\\Morales\\Documents"
                 + "\\UADY\\4° Semestre\\Diseño de Software-Acomp\\calFinales.csv")); 
      for(int i = 0; i < informacion.size(); i++) {
          escritor.writeNext(informacion.get(i));
          escritor.writeNext(calificaciones.get(i));
        }
        escritor.close();
    }
    
    public void leerArchivoOrdenador() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(rutaArchivoOrdenador));
        String sCadena;
        while((sCadena = bf.readLine()) != null) {
            archivoOrdenadorCompleto = archivoOrdenadorCompleto + sCadena;
        }
    } 
    
    public void interpretarDatosDelArchivoOrdenador() {
        //System.out.println(archivoOrdenadorCompleto.length());
        int contDeNumEncontrados = 0;
        for(int i = 0; i < archivoOrdenadorCompleto.length(); i++) {
            if(Character.isDigit(archivoOrdenadorCompleto.charAt(i))) {
                contDeNumEncontrados++;
                System.out.println("cumple que es numero "+archivoOrdenadorCompleto.charAt(i));
                if(contDeNumEncontrados == 4 || contDeNumEncontrados == 6) {  
                } else {
                    asignadorDelOrdenDeColumnasCsv(contDeNumEncontrados, archivoOrdenadorCompleto.charAt(i));
                }
            } else {
                //System.out.println(archivoOrdenadorCompleto.charAt(i));
            }    
        }
    }
    
    public void asignadorDelOrdenDeColumnasCsv(int contDeNumerosEncontrados, char numDeOrden) {
        String numConvertido;
        switch(contDeNumerosEncontrados) {
            case 1:
                numConvertido = Character.toString(numDeOrden);
                columnaMatricula = Integer.parseInt(numConvertido);
                System.out.println(columnaMatricula);
                break;
            case 2:
                numConvertido = Character.toString(numDeOrden);
                columnaMatricula = Integer.parseInt(numConvertido);
                System.out.println(columnaMatricula);
                break;
            case 3:
                numConvertido = Character.toString(numDeOrden);
                columnaMatricula = Integer.parseInt(numConvertido);
                System.out.println(columnaMatricula);
                break;
            case 5:
                numConvertido = Character.toString(numDeOrden);
                columnaMatricula = Integer.parseInt(numConvertido);
                System.out.println(columnaMatricula);
                break;
            default:
                System.out.println("Hubo algún error....");
                break;
        }
    }
}
