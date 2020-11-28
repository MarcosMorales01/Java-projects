/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Matriz implements Calculadora {

    public int menu(){
        System.out.println(" MENU ");
        System.out.println(" (1) Suma de matrices ");
        System.out.println(" (2) Multiplicacion de matrices por escalar ");
        System.out.println(" (3) Multipicacion de matrices ");
        System.out.println(" (4) Obtencion de la transpuesta de una matriz ");
        System.out.println(" (5) Obtencion de la inversa de una matriz ");
        System.out.print(" Opcion: ");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        return opcion;
    }
    
    @Override
    public void sumarMatrices() {
        int m;
        System.out.print("Digite la dimension de la matriz: ");
        Scanner teclado = new Scanner(System.in);
        m = teclado.nextInt(); 
        
        int matrizA[][], matrizB[][], matrizC[][];
        matrizA = new int[m][m];
        matrizB = new int[m][m];
        matrizC = new int[m][m];
        
        for( int i = 0; i < m; i++ ){
            for( int j = 0; j < m; j++ ){
                System.out.print("A[" + i + "][" + j + "] = ");
                matrizA[i][j] = teclado.nextInt();
                System.out.println("");
            }
        }
        
        for( int p = 0; p < m; p++ ){
            for( int q = 0; q < m; q++ ){
                System.out.print("B[" + p + "][" + q + "] = ");
                matrizB[p][q] = teclado.nextInt();
                System.out.println("");
            }
        }
        
        System.out.println("La suma de las matrices A y B es: ");
        for( int a = 0; a < m; a++ ){
            for( int b = 0; b < m; b++ ){
               matrizC[a][b] = matrizA[a][b] + matrizB[a][b];
                System.out.print("| " + matrizC[a][b] + " |");
            }
            System.out.println("");
        }
        
    }

    @Override
    public void multiplicarMatrizPorEscalar() {
        int m, c;
        
        System.out.print("Digite la dimension de la matriz: ");
        Scanner teclado = new Scanner(System.in);
        m = teclado.nextInt(); 
        
        System.out.print("Digite el escalar a multiplicar: ");
        c = teclado.nextInt();
        
        int matrizA[][];
        matrizA = new int[m][m];
       
        for( int i = 0; i < m; i++ ){
            for( int j = 0; j < m; j++ ){
                System.out.print("A[" + i + "][" + j + "] = ");
                matrizA[i][j] = teclado.nextInt();
                System.out.println("");
            }
        }
        
        for( int a = 0; a < m; a++ ){
            for( int b = 0; b < m; b++ ){
               matrizA[a][b] = c * matrizA[a][b];
            }
            
        }
        
        System.out.println("La matriz multiplicada por un escalar es: ");
        for( int p = 0; p < m; p++ ){
            for( int q = 0; q < m; q++ ){
                System.out.print("| " + matrizA[p][q] + " |");
            }
            System.out.println("");
        }
        
    }
    
    @Override
    public void multiplicarMatrices() {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite la dimension de la matriz A: ");
        int m = teclado.nextInt();
        int n = teclado.nextInt();
        System.out.println("");
        System.out.print("Digite la dimension de la matriz B: ");
        int p = teclado.nextInt();
        int q = teclado.nextInt();
        
        int matrizA[][], matrizB[][], matrizC[][] = null;
        
        if( n == p ){
            matrizA = new int[m][n];
            matrizB = new int[p][q];
            matrizC = new int[m][q];
            
            System.out.println("Digite los elementos de la matriz A: ");
            
            for( int i = 0; i < m; i++ ){
                for( int j = 0; j < n; j++ ){
                    System.out.print("A[" + i + "][" + j + "] = ");
                    matrizA[i][j] = teclado.nextInt();
                    System.out.println("");
                }
            }
            
            System.out.println("Digite los elementos de la matriz B: ");
            for( int i = 0; i < p; i++ ){
                for( int j = 0; j < q; j++ ){
                    System.out.print("B[" + i + "][" + j + "] = ");
                    matrizB[i][j] = teclado.nextInt();
                    System.out.println("");
                }
            }
            
            for (int i = 0; i < m ; i++ ){

                for (int j = 0; j < q ; j++ ){

                    int a = 0;
                    for( int k = 0; k < n; k++ ){
                        a = a + ( matrizA[i][k] * matrizB[k][j]);
                      }
                   matrizC[i][j] = a;     
                }

            }
            
            System.out.println("La matriz multiplicada por un escalar es: ");
            for( int x = 0; x < m; x++ ){
                for( int y = 0; y < q; y++ ){
                System.out.print("| " + matrizC[x][y] + " |");
            }
            System.out.println("");
        }
            
            
        } else {
            System.out.println("Las medidas de las matrices estan mal");
            System.out.println("Se debe respetar A = M x N y B = N x P ");
        }
        
        
    }

    
    @Override
    public void obtenerTranspuestaDeMatriz() {
        int matrizA[][], matrizAI[][];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite las dimensiones de la matriz: ");
        int m = teclado.nextInt();
        int n = teclado.nextInt();
        matrizA = new int[m][n];
        matrizAI = new int[n][m];
        
        for( int i = 0; i < m; i++ ){
            for( int j = 0; j < n; j++ ){
                System.out.print("A[" + i + "][" + j + "] = ");
                matrizA[i][j] = teclado.nextInt();
                System.out.println("");
            }
        }
        //int aux;
        for( int i = 0; i < n; i++ ){
            for( int j = 0; j < m; j++ ){
                //aux = matrizAI[j][i];
                matrizAI[i][j] = matrizA[j][i]; 
                //matrizA[i][j] = aux;
            }
        }
        
        System.out.println("La matriz normal: ");
            for( int x = 0; x < m; x++ ){
                for( int y = 0; y < n; y++ ){
                System.out.print("| " + matrizA[x][y] + " |");
            }
            System.out.println("");
        }
            
        System.out.println("La matriz transpuesta: ");
            for( int x = 0; x < n; x++ ){
                for( int y = 0; y < m; y++ ){
                System.out.print("| " + matrizAI[x][y] + " |");
            }
            System.out.println("");
        }
    }

    
    @Override
    public void obtenerInversaDeMatriz() {
       
        
    }

    
}
