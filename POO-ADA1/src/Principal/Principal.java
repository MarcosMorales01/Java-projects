
package Principal;

import Dominio.Departamento;
import Dominio.Empleado;
import Dominio.Fecha;
import Dominio.Horario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = null;
        ArrayList<Empleado> listaDeEmpleados = new ArrayList<>();
        int clave;
        String nombreEmpleado;
        String apellidoPaterno;
        String apellidoMaterno;
        int dia;
        int mes;
        int anio;
        
        int diaIngreso;
        int mesIngreso;
        int anioIngreso;
        
        int diasDeTrabajo;
        int horaInicio;
        int minutosInicio;
        int horaFinal;
        int minutosFinal;
        
        int horaInicioSabado = 0;
        int minutosInicioSabado = 0;
        int horaFinalSabado = 0;
        int minutosFinalSabado = 0;
        int horaInicioDomingo = 0;
        int minutosInicioDomingo = 0;
        int horaFinalDomingo = 0;
        int minutosFinalDomingo = 0;
        
        Fecha fechaDeIngreso;
        Fecha fechaDeNacimiento;
        Departamento departamento = null;
        Horario horarioEntreSemana = null;
        Horario horarioSabado = null;
        Horario horarioDomingo = null;
        String respuestaHorario = "";
        Scanner teclado = new Scanner(System.in);
        int respuestaEmpleado = -1;
        while(true) {
            System.out.println("_______________________________________________________");
            System.out.println("|                Sistemas de Recursos Humanos:        |");
            System.out.println("|                                                     |");
            
            System.out.print  ("| Clave empleado: "); 
            clave = teclado.nextInt();
            
            System.out.print  ("| Nombre del Empleado: "); 
            nombreEmpleado = teclado.next();
            
            System.out.print  ("| Apellido Paterno: "); 
            apellidoPaterno = teclado.next();
            
            System.out.print  ("| Apellido Materno: "); 
            apellidoMaterno = teclado.next();
            
            System.out.println("|                                                     |");
            System.out.println("| Fecha de Nacimineto                                 |");
            System.out.print  ("|        Dia (dos digitos si este lo requiere): ");
            dia = teclado.nextInt();
            
            System.out.print  ("|        Mes (dos digitos si este lo requiere): " );
            mes = teclado.nextInt();
            
            System.out.print  ("|        Año (cuatro digitos): ");
            anio = teclado.nextInt();
            
            empleado.validarFecha(dia, mes, anio);
            
            System.out.println("|                                                     |");
            System.out.println("| Fecha de Ingreso                                    |");
            System.out.print  ("|        Dia (dos digitos): ");
            diaIngreso = teclado.nextInt();
            
            System.out.print  ("|        Mes (dos digitos): ");
            mesIngreso = teclado.nextInt();
            
            System.out.print  ("|        Año (cuatro digitos): ");
            anioIngreso = teclado.nextInt();
            empleado.validarFecha(diaIngreso, mesIngreso, anioIngreso);
            System.out.println("|                                                     |");
            System.out.println("| Departamento                                        |");
            System.out.print  ("|     Clave departamento: ");
            String claveDepartamento = teclado.next();
            
            System.out.print  ("| Nombre del departamento: ");
            String nombreDepartamento = teclado.next();
            departamento.validarDepa(claveDepartamento, nombreDepartamento);
            System.out.println("|                                                     |");
            System.out.println("| Horario                                             |");
            System.out.print  ("|   Dias: ");
            diasDeTrabajo = teclado.nextInt();
            
            System.out.println("| Inicio                                              |");
            System.out.print  ("|   Hora: ");
            horaInicio = teclado.nextInt();
            System.out.print  ("|   Minutos: ");
            minutosInicio = teclado.nextInt();
            System.out.println("| Termina                                             |");
            System.out.print  ("|   Hora: ");
            horaFinal = teclado.nextInt();
            System.out.print  ("|   Minutos: ");
            minutosFinal = teclado.nextInt();
            horarioEntreSemana.validarHora(horaInicio, minutosInicio, horaFinal, minutosFinal);
            System.out.print  ("| ¿Desea capturar otro horario (S-Si, N-No)?      ");
            respuestaHorario = teclado.next();
            
            System.out.println("|                                                     |");
            if("S".equals(respuestaHorario) || "s".equals(respuestaHorario)) {
                String respuesta = "";
                System.out.print  ("| ¿Trabaja sábado? s=SI, n=NO   ");
                respuesta = teclado.next();
                if("s".equals(respuesta) || "S".equals(respuesta)) {
                   System.out.println("| Inicio                                              |");
                    System.out.print  ("|   Hora: ");
                    horaInicioSabado = teclado.nextInt();
                    System.out.print  ("|   Minutos: ");
                    minutosInicioSabado = teclado.nextInt();
            
                    System.out.println("| Termina                                             |");
                    System.out.print  ("|   Hora: ");
                    horaFinalSabado = teclado.nextInt();
                    System.out.print  ("|   Minutos: ");
                    minutosFinalSabado = teclado.nextInt();
                    respuesta = "";
                    horarioSabado.validarHora(horaInicioSabado, minutosInicioSabado, horaFinalSabado, minutosFinalSabado);
                }
                
                System.out.print  ("| ¿Trabaja domingo? s=SI, n=NO ");
                respuesta = teclado.next();
                if("s".equals(respuesta) || "S".equals(respuesta)) {
                   System.out.println("| Inicio                                              |");
                    System.out.print  ("|   Hora: ");
                    horaInicioDomingo = teclado.nextInt();
                    System.out.print  ("|   Minutos: ");
                    minutosInicioDomingo = teclado.nextInt();
            
                    System.out.println("| Termina                                             |");
                    System.out.print  ("|   Hora: ");
                    horaFinalDomingo = teclado.nextInt();
                    System.out.print  ("|   Minutos: ");
                    minutosFinalDomingo = teclado.nextInt();
                    respuesta = "";
                    horarioDomingo.validarHora(horaInicioDomingo, minutosInicioDomingo, horaFinalDomingo, minutosFinalDomingo);
                }     
            } else {
                horaInicioSabado = 0;
                minutosInicioSabado = 0;
                horaFinalSabado = 0;
                minutosFinalSabado = 0;
                
                horaInicioDomingo = 0;
                minutosInicioDomingo = 0;
                horaFinalDomingo = 0;
                minutosFinalDomingo = 0;
            }
            System.out.print  ("| ¿Desea capturar otro empleado (0 para terminar)?     ");
            respuestaEmpleado = teclado.nextInt();
            departamento = new Departamento(claveDepartamento, nombreDepartamento);
            horarioEntreSemana = new Horario(horaInicio, minutosInicio, horaFinal, minutosFinal);
            horarioSabado = new Horario(horaInicioSabado, minutosInicioSabado, horaFinalSabado, minutosFinalSabado);
            horarioDomingo = new Horario(horaInicioDomingo, minutosInicioDomingo, horaFinalDomingo, minutosFinalDomingo);
            fechaDeIngreso = new Fecha(diaIngreso, mesIngreso, anioIngreso);
            fechaDeNacimiento = new Fecha(dia, mes, anio);
            empleado = new Empleado(clave, nombreEmpleado, apellidoPaterno, 
                    apellidoMaterno, departamento, diasDeTrabajo, horarioEntreSemana, horarioSabado, 
                    horarioDomingo, fechaDeIngreso, fechaDeNacimiento);
            listaDeEmpleados.add(empleado);
            
            if(respuestaEmpleado == 0) {
                System.out.println("|                                                       |");
                System.out.println("|           Listado de empleados registrado             |");
                for(int i = 0; i < listaDeEmpleados.size(); i++) {
                    System.out.println("| "+listaDeEmpleados.get(i).toString());
                    System.out.println("\n");
                }
                System.out.println("|                                                       |");
                break;
            }
        }
    }   
}
