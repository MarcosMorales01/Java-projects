
package Dominio;
/**
 *
 * @author marcos
 */
public class Caja {
    
    private int numCajasGrandes;
    private int numCajasChicas;
    private int numCajasMedianas;
    
    private int numCjGr;
    private int numCjMd;
    private int numCjCh;
    
    //Constructor
    public Caja(int numCajasGrandes, int numCajasMedianas, int numCjGr, int numCjMd, int numCjCh, int costo) {
        this.numCajasGrandes = numCajasGrandes;
        this.numCajasMedianas = numCajasMedianas;
        this.numCjGr = numCjGr;
        this.numCjMd = numCjMd;
        this.numCjCh = numCjCh;
        this.costo = costo;
    }
    
    private int costo;

    public Caja() {
    }
    
    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getNumCjGr() {
        return numCjGr;
    }

    public void setNumCjGr(int numCjGr) {
        this.numCjGr = numCjGr;
    }

    public int getNumCjMd() {
        return numCjMd;
    }

    public void setNumCjMd(int numCjMd) {
        this.numCjMd = numCjMd;
    }

    public int getNumCjCh() {
        return numCjCh;
    }

    public void setNumCjCh(int numCjCh) {
        this.numCjCh = numCjCh;
    }
    

    public int getNumCajasGrandes() {
        return numCajasGrandes;
    }

    public void setNumCajasGrandes(int numCajasGrandes) {
        this.numCajasGrandes = numCajasGrandes;
    }

    public int getNumCajasChicas() {
        return numCajasChicas;
    }

    public void setNumCajasChicas(int numCajasChicas) {
        this.numCajasChicas = numCajasChicas;
    }

    public int getNumCajasMedianas() {
        return numCajasMedianas;
    }

    public void setNumCajasMedianas(int numCajasMedianas) {
        this.numCajasMedianas = numCajasMedianas;
    }
    
    
    public void obtenerCajaGrande( int bolsas ){
        costo = bolsas * 250;
        while( bolsas >= 20 ){
            bolsas = bolsas - 20;
            numCajasGrandes++;
        }
        
        obtenerCajaMediana(bolsas);
    }
    
    public void obtenerCajaMediana( int bolsas ){
       
        while( bolsas >= 10 ){
            bolsas = bolsas - 10;
            numCajasMedianas++;
        }
        
        obtenerCajaChica(bolsas);
    }
    
    public void obtenerCajaChica( int bolsas ){
        
        while( bolsas > 0 ){
            bolsas = bolsas - 5;
            numCajasChicas++;
        }
        
    }
    
    
    public void impresionPorEspacios(){
        
        int cost1 = numCajasGrandes * 10;
        int cost2 = numCajasMedianas * 5;
        int cost3 = numCajasChicas * 3;
        
        System.out.println("|           Cajas usadas:                |");
        System.out.println("|            " + numCajasGrandes + " grande(s)  -$ " + cost1 + "          |");
        System.out.println("|            " + numCajasMedianas + " mediana(s) -$ " + cost2 + "           |");
        System.out.println("|            " + numCajasChicas + " chica(s)   -$ " + cost3 + "           |");
        System.out.println("|     Su costo total es de:$ " + (costo + cost1 + cost2 + cost3 ) + "       |");
        System.out.println("|________________________________________|");
        
    }
    
    public void obtenerCjGr( int numDeBolsas ){
        
        while(true){
            
            if( numDeBolsas >= 20 ){
                
                numCjGr++;
                numDeBolsas = numDeBolsas - 20;
                
            } else if( (20 - numDeBolsas > 0 && 20 - numDeBolsas < 5) && numDeBolsas > 0 ) {
                
                numCjGr++;
                numDeBolsas = numDeBolsas - 20;
                
            } else{
                break;
            }
        }
        
        obtenerCjMd( numDeBolsas );
        
    }
    
    public void obtenerCjMd( int numDeBolsas ){
        
        while(true){
            if( numDeBolsas >= 10 ){

                    numCjMd++;
                    numDeBolsas = numDeBolsas - 10;

                } else if( (10 - numDeBolsas > 0 && 10 - numDeBolsas < 5 ) && numDeBolsas > 0 ) {

                    numCjMd++;
                    numDeBolsas = numDeBolsas - 10;

                } else{
                    break;
                }
        }
        
        obtenerCjCh(numDeBolsas);
    }
    
    public void obtenerCjCh( int numDeBolsas ){
        
        while(true){
            if( numDeBolsas > 0 ){

                    numCjCh++;
                    numDeBolsas = numDeBolsas - 5;

                } else if( (5 - numDeBolsas > 0 && 5 - numDeBolsas < 5 ) && numDeBolsas > 0 ) {

                    numCjCh++;
                    numDeBolsas = numDeBolsas - 5;

                } else{
                    break;
                }
        }
        
    }
    
    public void impresionPorCaja(){
        
        int cst1 = numCjGr * 10;
        int cst2 = numCjMd * 5;
        int cst3 = numCjCh * 3;
        
        System.out.println("|           Cajas usadas:                |");
        System.out.println("|            " + numCjGr + " grande(s)  -$ " + cst1 + "          |");
        System.out.println("|            " + numCjMd + " mediana(s) -$ " + cst2 + "           |");
        System.out.println("|            " + numCjCh + " chica(s)   -$ " + cst3 + "           |");
        System.out.println("|     Su costo total es de:$ " + (costo + cst1 + cst2 + cst3 ) + "       |");
        System.out.println("|________________________________________|");
    }
}
