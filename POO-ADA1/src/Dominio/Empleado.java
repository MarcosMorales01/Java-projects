
package Dominio;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Empleado {
    private int claveEmpleado;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int diasDeTrabajo;
    private Departamento departamentoEmpleado;
    private Horario horarioEntreSemana;
    private Horario horarioSabado;
    private Horario horarioDomingo;
    private Fecha fechaDeIngreso;
    private Fecha fechaDeNacimiento;

    public Empleado(int claveEmpleado, String nombre, String apellidoPaterno, 
            String apellidoMaterno, Departamento departamentoEmpleado, int diasDeTrabajo, 
            Horario horarioEntreSemana, Horario horarioSabado, Horario horarioDomingo, 
            Fecha fechaDeIngreso, Fecha fechaDeNacimiento) {
        this.claveEmpleado = claveEmpleado;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.departamentoEmpleado = departamentoEmpleado;
        this.diasDeTrabajo = diasDeTrabajo;
        this.horarioEntreSemana = horarioEntreSemana;
        this.horarioSabado = horarioSabado;
        this.horarioDomingo = horarioDomingo;
        this.fechaDeIngreso = fechaDeIngreso;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(int claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Departamento getDepartamentoEmpleado() {
        return departamentoEmpleado;
    }

    public void setDepartamentoEmpleado(Departamento departamentoEmpleado) {
        this.departamentoEmpleado = departamentoEmpleado;
    }

    public int getDiasDeTrabajo() {
        return diasDeTrabajo;
    }

    public void setDiasDeTrabajo(int diasDeTrabajo) {
        this.diasDeTrabajo = diasDeTrabajo;
    }

    public Horario getHorarioEntreSemana() {
        return horarioEntreSemana;
    }

    public void setHorarioEntreSemana(Horario horarioEntreSemana) {
        this.horarioEntreSemana = horarioEntreSemana;
    }

    public Horario getHorarioSabado() {
        return horarioSabado;
    }

    public void setHorarioSabado(Horario horarioSabado) {
        this.horarioSabado = horarioSabado;
    }

    public Horario getHorarioDomingo() {
        return horarioDomingo;
    }

    public void setHorarioDomingo(Horario horarioDomingo) {
        this.horarioDomingo = horarioDomingo;
    }

    public Fecha getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Fecha fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Empleado" + "clave=" + claveEmpleado + " nombre=" 
                + nombre + " apellidoPaterno=" + apellidoPaterno 
                + "\n apellidoMaterno=" + apellidoMaterno + "\nDepartamento=" + departamentoEmpleado 
                + " diasDeTrabajo=" + diasDeTrabajo + "\n horarioEntreSemana=" + horarioEntreSemana + " horarioSabado=" 
                + horarioSabado + "\n horarioDomingo=" + horarioDomingo + " fechaDeIngreso=" 
                + fechaDeIngreso + "\n fechaDeNacimiento=" + fechaDeNacimiento;
    }
    
    public void validarFecha(int dia, int mes, int anio) {
        
        int longitudD = Integer.toString(dia).length();
        int longitudM = Integer.toString(mes).length();
        int longitudA = Integer.toString(mes).length();
        if(longitudD > 2 || longitudM > 2 || longitudA > 4) {
            System.out.println("Error: no digito dos digitos, cierre el programa e intentelo de nuevo");
        }
        
        switch(mes) {
            case 1:
                if(dia > 31) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
                    if(dia > 29){
                        System.out.println("Error en dias");
                    }
                } else {
                    if(dia > 28){
                        System.out.println("Error en dias");
                    }
                }
                break;
            case 3:
                if(dia > 31) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 4:
                if(dia > 30) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 5:
                if(dia > 31) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 6:
                if(dia > 30) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 7: //julio
                if(dia > 31) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 8: //agosto
                if(dia > 31) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 9: //septiembre
                if(dia > 30) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 10: //octubre
                if(dia > 31) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 11:
                if(dia > 30) {
                    System.out.println("Error en numero de dias");
                }
                break;
            case 12:
                if(dia > 31) {
                    System.out.println("Error en numero de dias");
                }
                break;    
        }
    }
    
}
