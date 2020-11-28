
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Departamento {
    private String claveDelDepartamento;
    private String nombreDelDepartamento;

    @Override
    public String toString() {
        return nombreDelDepartamento;
    }

    public Departamento(String claveDelDepartamento, String nombreDelDepartamento) {
        this.claveDelDepartamento = claveDelDepartamento;
        this.nombreDelDepartamento = nombreDelDepartamento;
    }

    public String getClaveDelDepartamento() {
        return claveDelDepartamento;
    }

    public void setClaveDelDepartamento(String claveDelDepartamento) {
        this.claveDelDepartamento = claveDelDepartamento;
    }

    public String getNombreDelDepartamento() {
        return nombreDelDepartamento;
    }

    public void setNombreDelDepartamento(String nombreDelDepartamento) {
        this.nombreDelDepartamento = nombreDelDepartamento;
    }
    
    public void validarDepa(String claveD, String nomDepa) {
        if(claveD == "co" &&  nomDepa == "compras") {
            
        } else {
            System.out.println("Error en clave o nombre");
        }
        
        if(claveD == "al" &&  nomDepa == "almacen") {
            
        } else {
            System.out.println("Error en clave o nombre");
        }
        
        if(claveD == "fi" &&  nomDepa == "finanzas") {
            
        } else {
            System.out.println("Error en clave o nombre");
        }
        
        if(claveD == "rh" &&  nomDepa == "recursoshumanos") {
            
        } else {
            System.out.println("Error en clave o nombre");
        }
     
    }
}
