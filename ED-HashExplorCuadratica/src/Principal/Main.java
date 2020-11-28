
package Principal;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TablaDispersa td = new TablaDispersa();
        
        CasaRural cr = new CasaRural();
        //cr.muestra();
        td.insertar(cr);
        td.buscar(cr.elCodigo());
        cr.muestra();
        
        CasaRural cr1 = new CasaRural();
        td.insertar(cr1);
        td.buscar(cr1.elCodigo());
        cr1.muestra();
    }
    
}
