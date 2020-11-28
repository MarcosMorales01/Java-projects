/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author julio-cabrera
 */
public class Pdf {

    public void crear(ArrayList<Formato> calificaciones) throws FileNotFoundException, DocumentException {
        
        Document documento = new Document();

        FileOutputStream ficheroPdf = new FileOutputStream("/home/julio-cabrera/Documentos/calificaciones.pdf");

        PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(30);

        documento.open();

        try {
            Image foto = Image.getInstance("/home/julio-cabrera/Documentos/uady.png");
            foto.scaleToFit(160, 120);
            foto.setAlignment(Chunk.ALIGN_LEFT);
            documento.add(foto);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        documento.add(new Paragraph("Universidad Autonoma de Yucatan",
                FontFactory.getFont("arial", // fuente
                        12, // tamaño
                        Font.ITALIC, BaseColor.BLACK)));  
        
        documento.add(new Paragraph("Facultad de Matematicas",
                FontFactory.getFont("arial", // fuente
                        12, // tamaño
                        Font.ITALIC, BaseColor.BLACK)));  
        documento.add(new Paragraph("Diseño de Software",
                FontFactory.getFont("arial", // fuente
                        12, // tamaño
                        Font.ITALIC, BaseColor.BLACK)));  
        PdfPTable tabla = new PdfPTable(2);
        tabla.setSpacingBefore(20);
        tabla.setWidthPercentage(100);
        tabla.addCell("Nombre");
        tabla.addCell("Calificacion");
        for(Formato alumno:calificaciones){
            tabla.addCell(alumno.getNombre());
            tabla.addCell(alumno.getCalificacion());
        }
        documento.add(tabla);
        documento.close();
    }

}
