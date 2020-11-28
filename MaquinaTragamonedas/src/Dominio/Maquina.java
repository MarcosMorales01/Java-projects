
package Dominio;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author marcos
 */
public class Maquina {
    
    private int saldoMonedas;
    private int monedasIniciales;
    private int monedasRestantes;
    private int gananciaActual;
    private int monedas;
    private int random;
    private int multiplicador = 0;
    private int apuesta;
    
    private String ranura1;
    private String ranura2;
    private String ranura3;
    
    final static double VALORMONEDA = .25;

    public int getSaldoMonedas() {
        return saldoMonedas;
    }

    public int getMonedasIniciales() {
        return monedasIniciales;
    }

    public int getMonedasRestantes() {
        return monedasRestantes;
    }

    public double getVALORMONEDA() {
        return VALORMONEDA;
    }

    public String getRanura1() {
        return ranura1;
    }

    public String getRanura2() {
        return ranura2;
    }

    public String getRanura3() {
        return ranura3;
    }
    
    public void setSaldoMonedas( int saldoMonedas ) {
        this.saldoMonedas = saldoMonedas;
    }

    public void setMonedasIniciales( int monedasIniciales ) {
        this.monedasIniciales = monedasIniciales;
    }

    public void setMonedasRestantes( int monedasRestantes ) {
        this.monedasRestantes = monedasRestantes;
    }

    public void setRanura1( String ranura1 ) {
        this.ranura1 = ranura1;
    }

    public void setRanura2( String ranura2 ) {
        this.ranura2 = ranura2;
    }

    public void setRanura3( String ranura3 ) {
        this.ranura3 = ranura3;
    }
    
    public void recibirMonedas()
    {
        Scanner entrada = new Scanner( System.in );
        
        System.out.print( "Ingrese la cantidad de monedas: " );
        monedas = entrada.nextInt();
        
        while( monedas <= 0 ){
            System.out.print( "Ingrese una cantidad de monedas valida: " );
            monedas = entrada.nextInt();
        }
        
        setMonedasIniciales( monedas );
        setSaldoMonedas( monedas );
    }
    
    public int solicitarApuestas(){
        Scanner entrada = new Scanner( System.in );
        
        System.out.print( "Monedas a apostar: " );
        apuesta = entrada.nextInt();
        
        while ( apuesta > 4 )
        {
            System.out.println( "Solo pueda apostar de 1 a 4 monedas. " );
            apuesta = entrada.nextInt();
        }
        this.saldoMonedas -= apuesta;
        
        return apuesta;    
    }
    
    public int generarTablero(){
        Random aleatorio = new Random(System.currentTimeMillis());      
        aleatorio.setSeed(System.currentTimeMillis());
        
            random = aleatorio.nextInt(27) + 1 ;
          
            switch(random){
                case 1:
                    setRanura1("CAMPANA");
                    setRanura2("CAMPANA");
                    setRanura3("CAMPANA");
                    multiplicador = 10;
                    break;
                case 2:
                    setRanura1("UVA");
                    setRanura2("UVA");
                    setRanura3("UVA");
                    multiplicador = 7;
                    break;
                case 3:
                    setRanura1("CEREZA");
                    setRanura2("CEREZA");
                    setRanura3("CEREZA");
                    multiplicador = 5;
                    break;
                case 4:
                    setRanura1("CEREZA");
                    setRanura2("CEREZA");
                    setRanura3("CAMPANA");
                    multiplicador = 3;
                    break;
                case 5:
                    setRanura1("CEREZA");
                    setRanura2("CEREZA");
                    setRanura3("UVA");
                    multiplicador = 3;
                    break;
                case 6:
                    setRanura1("CEREZA");
                    setRanura2("CAMPANA");
                    setRanura3("CEREZA");
                    multiplicador = 3;
                    break;
                case 7:
                    setRanura1("CEREZA");
                    setRanura2("UVA");
                    setRanura3("CEREZA");
                    multiplicador = 3;
                    break;
                case 8:
                    setRanura1("CAMPANA");
                    setRanura2("CEREZA");
                    setRanura3("CEREZA");
                    multiplicador = 3;
                    break;
                case 9:
                    setRanura1("UVA");
                    setRanura2("CEREZA");
                    setRanura3("CEREZA");
                    multiplicador = 3;
                    break;
                case 10:
                    setRanura1("CEREZA");
                    setRanura2("CAMPANA");
                    setRanura3("CAMPANA");
                    multiplicador = 1;
                    break;
                case 11:
                    setRanura1("CEREZA");
                    setRanura2("UVA");
                    setRanura3("UVA");
                    multiplicador = 1;
                    break;
                case 12:
                    setRanura1("CEREZA");
                    setRanura2("CAMPANA");
                    setRanura3("UVA");
                    multiplicador = 1;
                    break;
                case 13:
                    setRanura1("CEREZA");
                    setRanura2("UVA");
                    setRanura3("CAMPANA");
                    multiplicador = 1;
                    break;
                case 14:
                    setRanura1("CAMPANA");
                    setRanura2("CEREZA");
                    setRanura3("CAMPANA");
                    multiplicador = 1;
                    break;
                case 15:
                    setRanura1("UVA");
                    setRanura2("CEREZA");
                    setRanura3("UVA");
                    multiplicador = 1;
                    break;
                case 16:
                    setRanura1("UVA");
                    setRanura2("CEREZA");
                    setRanura3("CAMPANA");
                    multiplicador = 1;
                    break;
                case 17:
                    setRanura1("CAMPANA");
                    setRanura2("CEREZA");
                    setRanura3("UVA");
                    multiplicador = 1;
                    break;
                case 18:
                    setRanura1("CAMPANA");
                    setRanura2("CAMPANA");
                    setRanura3("CEREZA");
                    multiplicador = 1;
                    break;
                case 19:
                    setRanura1("UVA");
                    setRanura2("UVA");
                    setRanura3("CEREZA");
                    multiplicador = 1;
                    break;
                case 20:
                    setRanura1("UVA");
                    setRanura2("CAMPANA");
                    setRanura3("CEREZA");
                    multiplicador = 1;
                    break;
                case 21:
                    setRanura1("CAMPANA");
                    setRanura2("UVA");
                    setRanura3("CEREZA");
                    multiplicador = 1;
                    break;
                case 22:
                    setRanura1("CAMPANA");
                    setRanura2("CAMPANA");
                    setRanura3("UVA");
                    break;
                case 23:
                    setRanura1("CAMPANA");
                    setRanura2("UVA");
                    setRanura3("CAMPANA");
                    break;
                case 24:
                    setRanura1("CAMPANA");
                    setRanura2("CAMPANA");
                    setRanura3("UVA");
                    break;
                case 25:
                    setRanura1("UVA");
                    setRanura2("UVA");
                    setRanura3("CAMPANA");
                    break;
                case 26:
                    setRanura1("UVA");
                    setRanura2("CAMPANA");
                    setRanura3("UVA");
                    break;
                case 27:
                    setRanura1("CAMPANA");
                    setRanura2("UVA");
                    setRanura3("UVA");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
            return multiplicador;
    }
    
    public void imprimirTablero(int gananciaActual){
      
        System.out.println("Usted tiene " + this.saldoMonedas + " monedas");
        System.out.println( "| " + this.ranura1 + " | " + this.ranura2 + " | " + this.ranura3 + " |" );
        System.out.println( "Usted ha ganado " + gananciaActual + " monedas" );
    }
    
    public void calcularGanancia(){
        int monedasfinal;
        double ganancias;
        monedasfinal = this.saldoMonedas-this.monedasIniciales;
        ganancias = monedasfinal * Maquina.VALORMONEDA;   
        
        if( ganancias < 0 ){
           System.out.println( "Has perdido " + ganancias + " $" );
        } else{
            System.out.println( "Has ganado " + ganancias + " $" );
        }
    }
    
    public void iniciarJuego(){
        
        recibirMonedas();
        apuesta = solicitarApuestas();
        
        while( apuesta != 0 ){
            multiplicador = generarTablero();
            gananciaActual = apuesta * multiplicador;
            
            imprimirTablero( gananciaActual );            
            this.saldoMonedas += gananciaActual;
            
            if( this.saldoMonedas == 0 ) {
                break;
            }
            
            apuesta = solicitarApuestas();
        }
        
        calcularGanancia();
    }        
}


