
package Control;

import Datos.DatosABB;
import Datos.DatosAVL;
import Datos.DatosLista;
import Datos.Elemento;
import Vista.AccionRealizada;
import Vista.VistaPrincipal;
import Vista.tabla;
import abb.ArbolABB;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ControlVistaPrincipal implements ActionListener{
    
    private final VistaPrincipal vistaPrincipal;
    private tabla table;
    private String url;
    private AccionRealizada fail;
    private ArrayList<Elemento> datos = new ArrayList();
    private ArrayList<String> lines = new ArrayList<>();
    
    public ControlVistaPrincipal(VistaPrincipal vistaPrincipal){
        this.vistaPrincipal=vistaPrincipal;
        this.vistaPrincipal.getCargarDatos().addActionListener(this);
        this.vistaPrincipal.getBuscar().addActionListener(this);
        this.vistaPrincipal.getBuscar().setEnabled(false);
        this.table = new tabla();
        this.fail = new AccionRealizada();
        this.fail.getAceptarAccionRealizada().addActionListener(this);
        this.table.getjButton1().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(vistaPrincipal.getCargarDatos()== e.getSource()){
            BufferedReader reader = null;
            try {
                url = vistaPrincipal.getPathTextField().getText();
                vistaPrincipal.getBuscar().setEnabled(true);
                System.out.println(url);
                reader = new BufferedReader(new FileReader(this.url));
                
                String line = null;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
            } catch (FileNotFoundException ex) {
                fail.setVisible(true);
                
                
            } catch (IOException ex) {
                fail.setVisible(true);
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                   fail.setVisible(true);
                }
            }
        }
        
        if(vistaPrincipal.getBuscar()==e.getSource()){
            GroupButtonUtils button = new GroupButtonUtils();
            String busqueda = button.getSelectedButtonText(vistaPrincipal.getTipoBusqueda());
            boolean nom  = vistaPrincipal.getNombreCheckBox().isSelected();
            boolean prof = vistaPrincipal.getProfesionCheckBox().isSelected();
            boolean cal = vistaPrincipal.getCalificacionCheckBox().isSelected();
            
            String nombre = vistaPrincipal.getNombreTextField().getText();
            String calificacion = vistaPrincipal.getCalificacionTextField().getText();
            String profesion = vistaPrincipal.getProfesionTextField().getText();
            
            
            switch(busqueda){
                case "ABB":
            {
                try {
                    DatosABB busca = new DatosABB(url,nom,prof,cal);
                    datos = busca.Busqueda(nombre, profesion, calificacion);
                    this.setTable(table.getjTable1());
                } catch (IOException ex) {
                    Logger.getLogger(ControlVistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case "AVL":
            {
                try {
                    DatosAVL busca = new DatosAVL(url,nom,prof,cal);
                    datos = busca.Busqueda(nombre, profesion, calificacion);
                    this.setTable(table.getjTable1());
                } catch (IOException ex) {
                    Logger.getLogger(ControlVistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case "Lista":
            {
                try {
                    DatosLista busca = new DatosLista(url,nom,prof,cal);
                    datos = busca.Busqueda(nombre, profesion, calificacion);
                    this.setTable(table.getjTable1());
                } catch (IOException ex) {
                    Logger.getLogger(ControlVistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
            }
            
            
        }
        if(fail.getAceptarAccionRealizada()==e.getSource() ){
            fail.setVisible(false);
        }
        if(table.getjButton1()==e.getSource()){
            table.setVisible(false);
        }
    }
    public void setTable(JTable TablaLista) throws FileNotFoundException, IOException{
        table.setVisible(true);
        Object o[][] = new Object[datos.size()][3];
        
        System.out.println(datos.size());
        for (int i = 0; i <datos.size(); i++) {
            
        String CSV = lines.get(datos.get(i).getLinea()); 
        String[] values = CSV.split(",");
            o[i][0] = values[0];
            o[i][1] = values[1];
            o[i][2] = values[2];
        }


        Object Titulo[]=new Object[]{"Nombre","Profesion","Calificación"};

        DefaultTableModel d = new DefaultTableModel(o,Titulo);
        TablaLista.setModel(d);
        TablaLista.setRowHeight(30);

    }
    
}
