/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

//import Dominio.Calculadora;
import Dominio.Matriz;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class MainCalculadora {

    
    public static void main(String[] args) {
        
        Matriz matriz;
        matriz = new Matriz();
        int opcion = matriz.menu();
        switch(opcion){
            case 1:
                matriz.sumarMatrices();
                break;
            case 2:
                matriz.multiplicarMatrizPorEscalar();
                break;
            case 3:
                matriz.multiplicarMatrices();
                break;
            case 4:
                matriz.obtenerTranspuestaDeMatriz();
                break;
            case 5:
                matriz.obtenerInversaDeMatriz();
                break;
            default:
                System.out.println("Error, no digito algun numero valido. ");
                break;
        }
        
    }
    
}
