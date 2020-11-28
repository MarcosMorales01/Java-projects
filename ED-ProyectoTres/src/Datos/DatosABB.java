package Datos;

import abb.ArbolABB;
import abb.NodoBin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * José Marcos Morales Gómez
 */
public class DatosABB extends Datos{
    ArbolABB Nombre = null;
    ArbolABB Profesion = null;
    ArbolABB Calificacion = null; 
    String Path;
    
    boolean CampoNom;
    boolean CampoProf;
    boolean CampoCal;

    public DatosABB(String path, boolean nom, boolean prof, boolean cal) throws IOException {
        Path = path;
        CampoNom = nom; 
        CampoProf = prof;
        CampoCal = cal;
        leer();
    }
   
    
    
    
    @Override
    public void leer() throws IOException {
        String linea = "";
        String palabras[];
        String url = "D:\\Equipo 2\\Morales\\Documents\\UADY\\4° Semestre\\Estructura de Datos\\Egresados.csv";
        //cambia la url por el Path que recive en el Constructor
        
        if(CampoNom){
            Nombre = new ArbolABB();
        }
        if(CampoProf){
            Profesion = new ArbolABB();
        }
        if(CampoCal){
            Calificacion = new ArbolABB();
        }
        
        try {
            FileReader Lector = new FileReader(url);
            BufferedReader buffer = new BufferedReader(Lector);
            if(buffer.ready()){
                buffer.readLine();
            }
            
            int i = 1;
            while(buffer.ready()){
                if(!(linea = buffer.readLine()).equals("\0")){
                   palabras=linea.split(",");
                   
                   if(CampoNom){
                       if(Nombre.getRaiz().getDato()==null){
                           NodoBin aux = new NodoBin(new Elemento(fHash(palabras[0]), i));
                           Nombre.setRaiz(aux);
                       }else{
                           Nombre.insertar(new Elemento(fHash(palabras[0]), i));
                       } 
                   }
             
                    if (CampoProf) {
                        if (Profesion.getRaiz().getDato() == null) {
                            NodoBin aux = new NodoBin(new Elemento(fHash(palabras[1]), i));
                            Profesion.setRaiz(aux);
                            
                        } else {
                            Profesion.insertar(new Elemento(fHash(palabras[1]), i));
                           
                        }
                    }

                    if (CampoCal) {
                        if (Calificacion.getRaiz().getDato() == null) {
                            NodoBin aux = new NodoBin(new Elemento(fHash(palabras[2]), i));
                            Calificacion.setRaiz(aux);
                        } else {
                            Calificacion.insertar(new Elemento(fHash(palabras[2]), i));
                        }
                    }
                }
                i++;
            }
            Lector.close();
            buffer.close();

        }catch(java.io.FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"No se ha podido encontrar el archivo con los alumnos");
        }
    }

    @Override
    public ArrayList BusquedaNombre(int indice) {
        ArrayList ANombre = new ArrayList();
        if (Nombre.getRaiz() != null) {
            Nombre.getRaiz().Busqueda(indice, ANombre);
        }
       return ANombre; 
    }

    @Override
    public ArrayList BusquedaProfesion(int indice) {
        ArrayList AProfesion = new ArrayList();
        if (Profesion.getRaiz() != null) {
            Profesion.getRaiz().Busqueda(indice, AProfesion);
        }
       return AProfesion; 
    }

    @Override
    public ArrayList BusquedaCalificacion(int indice) {
        ArrayList ACalificacion = new ArrayList();
        if (Calificacion.getRaiz() != null) {
            Calificacion.getRaiz().Busqueda(indice, ACalificacion);
        }
       return ACalificacion; 
    }

    @Override
    public ArrayList Busqueda(String n, String p, String c) {
        ArrayList ANombre;
        ArrayList AProfesion;
        ArrayList ACalificacion;
        ArrayList temp = new ArrayList<>();
        
        if(Nombre != null && Profesion == null && Calificacion == null){
            ANombre = BusquedaNombre(fHash(n));
            return ANombre;
        }
        
        if(Nombre == null && Profesion != null && Calificacion == null){
            AProfesion = BusquedaProfesion(fHash(p));
            return AProfesion;
        }
        
        if (Nombre == null && Profesion == null && Calificacion != null) {
            ACalificacion = BusquedaCalificacion(fHash(c));
            return ACalificacion;
        }
    
                
        if (Nombre != null && Profesion != null && Calificacion == null) {
            ANombre = BusquedaNombre(fHash(n));
            AProfesion = BusquedaProfesion(fHash(p));

            for (int i = 0; i < ANombre.size(); i++) {
                for (int j = 0; j < AProfesion.size(); j++) {
                    boolean x =((Elemento)(ANombre.get(i))).getLinea()==((Elemento)(AProfesion.get(j))).getLinea();
                    if(x){
                        temp.add(ANombre.get(i));
                    }
                }
            }
            return temp;
        }

        if (Nombre != null && Profesion == null && Calificacion != null) {
            ANombre = BusquedaNombre(fHash(n));
            ACalificacion = BusquedaCalificacion(fHash(c));

            for (int i = 0; i < ANombre.size(); i++) {
                for (int j = 0; j < ACalificacion.size(); j++) {
                    boolean x =((Elemento)(ANombre.get(i))).getLinea()==((Elemento)(ACalificacion.get(j))).getLinea();
                    if(x){
                        temp.add(ANombre.get(i));
                    }
                }
            }
            return temp;
        }

        if (Nombre == null && Profesion != null && Calificacion != null) {
            ACalificacion = BusquedaCalificacion(fHash(c));
            AProfesion = BusquedaProfesion(fHash(p));

            for (int i = 0; i < ACalificacion.size(); i++) {
                for (int j = 0; j < AProfesion.size(); j++) {
                    boolean x = ((Elemento) (ACalificacion.get(i))).getLinea() == ((Elemento) (AProfesion.get(j))).getLinea();
                    if (x) {
                        temp.add(ACalificacion.get(i));
                    }
                }
            }
            return temp;
        }
              
        if (Nombre != null && Profesion != null && Calificacion != null) {
            ANombre = BusquedaNombre(fHash(n));
            AProfesion = BusquedaProfesion(fHash(p));
            ACalificacion = BusquedaCalificacion(fHash(c));
            
            for (int i = 0; i < ANombre.size(); i++) {
                for (int j = 0; j< AProfesion.size(); j++) {
                    for (int k = 0; k < ACalificacion.size(); k++) {
                        boolean x = ((Elemento) (ACalificacion.get(i))).getLinea() == ((Elemento) (AProfesion.get(j))).getLinea() 
                                && ((Elemento) (AProfesion.get(j))).getLinea() == ((Elemento) (ANombre.get(k))).getLinea();
                        if (x) {
                            temp.add(ACalificacion.get(i));
                        }
                    }
                }
            }
            return temp;
        }
        
        return temp;
    }
    
    /*
    public static void main(String[] arsg) throws IOException {
        DatosABB d = new DatosABB("hola", false, true, true);
        ArrayList a = d.Busqueda("", "Actuaria", "95");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(((Elemento) a.get(i)).getLinea());
        }

    }*/
    
}
