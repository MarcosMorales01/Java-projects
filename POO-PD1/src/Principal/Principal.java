
package Principal;

import Dominio.Normal;
import Dominio.Oficial;
import Dominio.Pensionado;
import Dominio.Vehiculo;
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
        ArrayList<Normal> listaVehiculoNormal = new ArrayList<>();
        ArrayList<Oficial> listaVehiculoOficial = new ArrayList<>();
        ArrayList<Pensionado> listaVehiculoPensionado = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String placa;
        int horaDeEntrada;
        int horaDeSalida;
        int minutosAcumulados;
        int opcion;
        int salir;
        System.out.println(" Registro de vehiculos \n");
        while (true) {
            System.out.println(" Elija el tipo de vehiculo correspondiente");
            System.out.println(" (1) Vehiculo normal");
            System.out.println(" (2) Vehiuclo pensionado");
            System.out.println(" (3) Vehiculo oficial");
            System.out.print  ("\n Digite el numero:  ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print (" Digite su placa: ");
                    placa = teclado.next();
                    System.out.print (" Digite su hora entrada: ");
                    horaDeEntrada = teclado.nextInt();
                    System.out.print (" Digite su hora de salida: ");
                    horaDeSalida = teclado.nextInt();
                    Vehiculo vehiculoNormal = new Normal(placa, horaDeEntrada, horaDeSalida);
                    listaVehiculoNormal.add((Normal) vehiculoNormal);
                    break;
                case 2:
                    System.out.print (" Digite su placa: ");
                    placa = teclado.next();
                    System.out.print (" Digite su hora entrada: ");
                    horaDeEntrada = teclado.nextInt();
                    System.out.print (" Digite su hora de salida: ");
                    horaDeSalida = teclado.nextInt();
                    System.out.print (" Digite sus minutos acumulados: ");
                    minutosAcumulados = teclado.nextInt();
                    Vehiculo vehiculoPensionado = new Pensionado(placa, horaDeEntrada, horaDeSalida, minutosAcumulados);
                    listaVehiculoPensionado.add((Pensionado) vehiculoPensionado);
                    break;
                case 3:
                    System.out.print (" Digite su placa: ");
                    placa = teclado.next();
                    System.out.print (" Digite su hora entrada: ");
                    horaDeEntrada = teclado.nextInt();
                    System.out.print (" Digite su hora de salida: ");
                    horaDeSalida = teclado.nextInt();
                    Vehiculo vehiculoOficial = new Oficial(placa, horaDeEntrada, horaDeSalida);
                    listaVehiculoOficial.add((Oficial) vehiculoOficial);
                    break;
                default:
                    System.out.println("Elija una opción correcta. ");
                    break;
            }
            
            System.out.print (" Digite 0 pero terminar, otro número para seguir:  ");
            salir = teclado.nextInt();
            if(salir == 0) {
                System.out.println("\n LISTA DE VEHICULOS REGISTRADOS \n");
                System.out.println("\n 1. Vehiculos normales registrados");
                for(int i = 0; i < listaVehiculoNormal.size(); i++) {
                    System.out.println(listaVehiculoNormal.get(i).toString()+"\n");
                }
                System.out.println("\n 2. Vehiculos pensionados registrados");
                for(int i = 0; i < listaVehiculoPensionado.size(); i++) {
                    System.out.println(listaVehiculoPensionado.get(i).toString()+"\n");
                }
                System.out.println("\n 3. Vehiculos oficiales registrados");
                for(int i = 0; i < listaVehiculoOficial.size(); i++) {
                    System.out.println(listaVehiculoOficial.get(i).toString()+"\n");
                }
                break;
            } else {
                System.out.println("\n Registrando otro vehiculo ");
            }
        }
    }
}
