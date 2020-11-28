
package Dominio;

import java.util.Random;

/**
 *
 * @author marcos
 */
public class JuegoFermi {
    
    private int numPrimeraPos;
    private int numSegundaPos;
    private int numTerceraPos;
    private int intentos;

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getNumPrimeraPos() {
        return numPrimeraPos;
    }

    public void setNumPrimeraPos(int numPrimeraPos) {
        this.numPrimeraPos = numPrimeraPos;
    }

    public int getNumSegundaPos() {
        return numSegundaPos;
    }

    public void setNumSegundaPos(int numSegundaPos) {
        this.numSegundaPos = numSegundaPos;
    }

    public int getNumTerceraPos() {
        return numTerceraPos;
    }

    public void setNumTerceraPos(int numTerceraPos) {
        this.numTerceraPos = numTerceraPos;
    }

    public JuegoFermi() {
        
        iniciarValoresJuego();
    }
    
    public void iniciarValoresJuego(){
        
        int cont = 0;
            
        Random aleatorio = new Random(System.currentTimeMillis());
        
        int num1 = aleatorio.nextInt(9);
        int num2 = aleatorio.nextInt(9);
        
        while(true){
            
            if( num1 == num2 ){
                num2 = aleatorio.nextInt(9);
            } else{
                break;
            }
        }
        
        int num3 = aleatorio.nextInt(9);
        
        while(true){
            if( num3 == num2 ){
                num3 = aleatorio.nextInt(9);
            }
            
            if( num3 == num1 ){
                num3 = aleatorio.nextInt(9);
            } 
            
            if( num1 != num2 && num1 != num3 && num2 != num3 ){
                break;
            }
        }
        
        numPrimeraPos = num1;
        numSegundaPos = num2;
        numTerceraPos = num3;
        /*
        System.out.println(numPrimeraPos);
        System.out.println(numSegundaPos);
        System.out.println(numTerceraPos);
        */
    }
    
    public String obtenerPista( int entrada1, int entrada2, int entrada3 ){
        
        int pos0 = 0, pos1 = 1, pos2 = 2;
        
        int e1 = entrada1;
        int e2 = entrada2;
        int e3 = entrada3;
        
        int[] vector = new int[3];
        
        vector[0] = e1;
        vector[1] = e2;
        vector[2] = e3;
        
        String texto0 = "Nano", texto1 = "Nano", texto2 = "Nano", textoFinal;
        
        /*
        Si el numero a adivinar esta en la posicion correcta es fermi
        Simel numero esta en otra posicion es pico
        Si el numero no esta en ninguna de las tres posiciones es nano
        */
        
        for( int i = 0; i < 3; i++ ){
            
            if( vector[i] == numPrimeraPos ){
                
                if( pos0 == i ){
                    
                    texto0 = "Fermi";
                    
                } else if( i == 1 ){
                    
                    texto1 = "Pico";
                    
                } else if( i == 2 ){
                    
                    texto2 = "Pico";
                }
            } else if( vector[i] == numSegundaPos ){
                
                if( pos1 == i ){
                    
                    texto1 = "Fermi";
                    
                } else if( i == 0 ){
                    
                    texto0 = "Pico";
                    
                } else if( i == 2 ){
                    
                    texto2 = "Pico";
                }
                
            } else if( vector[i] == numTerceraPos ){
                
                if( pos2 == i ){
                    
                    texto2 = "Fermi";
                    
                } else if( i == 0 ){
                    
                    texto0 = "Pico";
                    
                } else if( i == 1 ){
                    
                    texto1 = "Pico";
                }
                
            } 
        }
        
        textoFinal = texto0 + texto1 + texto2;
        
        return textoFinal;
    }
}
