
package dominio;

/**
 *
 * @author marco
 */
public class Mensaje {
    
    private String textoMensaje;
    
    public String darMensaje(){
        return textoMensaje;
    }
    
    public void recibirMensaje( String mensaje ){
        
        textoMensaje = mensaje;
    }
}
