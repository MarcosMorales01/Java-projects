package prueba;

import dominio.Fecha;

/**
 *
 * @author marco
 */
public class MainFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Fecha fechaPrueba;
        fechaPrueba = new Fecha();
        
        fechaPrueba.RecibirFecha(1, 5, 2019);
        System.out.println(fechaPrueba.DarFechaFormatoNumerico());
        System.out.println(fechaPrueba.DarFechaFormatoTexto());
        
    }
    
}
