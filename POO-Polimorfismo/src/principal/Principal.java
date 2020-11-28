
package principal;

import dominio.Empleado;
import dominio.EmpleadoAsalariado;
import dominio.EmpleadoBaseMasComision;
import dominio.EmpleadoPorComision;
import dominio.EmpleadoPorHoras;
import static java.lang.Integer.parseInt;
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
        ArrayList<EmpleadoAsalariado> listaEA = new ArrayList<>();
        ArrayList<EmpleadoBaseMasComision> listaEBC = new ArrayList<>();
        ArrayList<EmpleadoPorComision> listaEPC = new ArrayList<>();
        ArrayList<EmpleadoPorHoras> listaEPH = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String apellido;
        int numSeguro;
        
        while (true) {
            System.out.println(" Registro de empleados");
            System.out.print(" Nombre: ");
            nombre = teclado.next();
            System.out.print(" Apellido: ");
            apellido = teclado.next();
            System.out.print(" Numero de seguro: ");
            numSeguro = teclado.nextInt();
            System.out.println(" Eliga el tipo de empleado ");
            System.out.println(" 1. Empleado Asalariado");
            System.out.println(" 2. Empleado por Horas");
            System.out.println(" 3. Empleados por Comisión");
            System.out.println(" 4. Empleados Base más Comisión");
            int r;
            r = teclado.nextInt();
            switch (r) {
                case 1: //Empleado asalariado
                    System.out.print(" Digite su salario semanal:  ");
                    int salario = teclado.nextInt();
                    Empleado empleadoAsalariado = new EmpleadoAsalariado(nombre, apellido, numSeguro, salario);
                    listaEA.add((EmpleadoAsalariado) empleadoAsalariado);
                    break;
                case 2:// Empleado por horas
                    System.out.print(" Digite su sueldo por hora:  ");
                    int sueldo = teclado.nextInt();
                    System.out.print(" Digite la cantidad de horas de trabajo:  ");
                    int horas = teclado.nextInt();
                    Empleado empleadoPorHora = new EmpleadoPorHoras(nombre, apellido, numSeguro, sueldo, horas);
                    listaEPH.add((EmpleadoPorHoras) empleadoPorHora);
                    break;
                case 3: // Empleado por comision
                    System.out.print(" Digite su numero de ventas:  ");
                    int numVentas = teclado.nextInt();
                    System.out.print(" Digite su tarifa de comision:  ");
                    int tarifa = teclado.nextInt();
                    Empleado empleadoPorComision = new EmpleadoPorComision(nombre, apellido, numSeguro, numVentas, tarifa){};
                    listaEPC.add((EmpleadoPorComision) empleadoPorComision);
                    break;
                case 4: // Empleado por base más comision
                    System.out.print(" Digite su numero de ventas: ");
                    int ventas = teclado.nextInt();
                    System.out.print(" Digite su tarfia de comision: ");
                    int tarfiaComision = teclado.nextInt();
                    System.out.print(" Digite su salario base: ");
                    int salarioBase = teclado.nextInt();
                    Empleado empleadoBaseComision = new EmpleadoBaseMasComision(nombre, apellido, numSeguro, ventas, tarfiaComision, salarioBase);
                    listaEBC.add((EmpleadoBaseMasComision) empleadoBaseComision);
                    break;
                default:
                    System.out.println("Eliga una opción correcta.");
                    break;
            }
            
            System.out.println(" ¿Quiere agregar otro empleado? 0 para terminar.");
            int respuesta = teclado.nextInt();
            if(0 == respuesta) {
                for(int i = 0; i < listaEA.size(); i++) {
                    System.out.println(listaEA.get(i).toStringEmpleado());
                    System.out.println("Salario: " + listaEA.get(i).getSalarioSemanal());  
                }
                for(int i = 0; i < listaEPH.size(); i++) {
                    System.out.println(listaEPH.get(i).toStringEmpleado());
                    System.out.println("Sueldo por hora: " + listaEPH.get(i).getSueldoPorHora());
                    System.out.println("Horas trabajadas: " + listaEPH.get(i).getHorasTrabajadas());
                    System.out.println("Sueldo final: " + listaEPH.get(i).calcularSueldo());  
                }
                for(int i = 0; i < listaEPC.size(); i++) {
                    System.out.println(listaEPC.get(i).toStringEmpleado());
                    System.out.println("Tarifa de comision: " + listaEPC.get(i).getTarifaDeComision());
                    System.out.println("Numero de ventas: " + listaEPC.get(i).getVentasBrutas());
                    System.out.println("Salario:" + listaEPC.get(i).salarioTotal());
                }
                for(int i = 0; i < listaEBC.size(); i++) {
                    System.out.println(listaEBC.get(i).toStringEmpleado());
                    System.out.println("Tarifa de comision: " + listaEBC.get(i).getTarifaDeComision());
                    System.out.println("Numero de ventas: " + listaEBC.get(i).getVentasBrutas());
                    System.out.println("Salario base : " + listaEBC.get(i).getSalarioBase());
                    System.out.println("Salario total: " + listaEBC.get(i).calcularSalarioTotal());
                }
                break;
            }
        }
    }  
}
