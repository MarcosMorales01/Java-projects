
package Datos;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * José Marcos Morales Gómez
 */
public abstract class Datos {
    
    public int fHash(String cadena) {
        int x = 0;
        for (int i = 0; i < cadena.length(); i++) {
            x = x + (int) (cadena.charAt(i));
        }
        return x;
    }
    
    public ArrayList RecuperarDatos(){
        return new ArrayList();
    }
    
    public abstract void leer() throws IOException;
    public abstract ArrayList BusquedaNombre(int indice);
    public abstract ArrayList BusquedaProfesion(int indice);
    public abstract ArrayList BusquedaCalificacion(int indice);
    public abstract ArrayList Busqueda(String n, String p, String c);
}
