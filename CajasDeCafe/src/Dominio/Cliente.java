

package Dominio;
        

public class Cliente {
    
    private int numDeBolsas;
    private int costo;
    private int precioPorCajas;
    
    //Constructor
    public Cliente(int numDeBolsas, int costo, int precioPorCajas) {
        this.numDeBolsas = numDeBolsas;
        this.costo = costo;
        this.precioPorCajas = precioPorCajas;
    }
    
    public int getPrecioPorCajas() {
        return precioPorCajas;
    }

    public void setPrecioPorCajas(int precioPorCajas) {
        this.precioPorCajas = precioPorCajas;
    }

    public int getNumDeBolsas() {
        return numDeBolsas;
    }

    public int getCosto() {
        return costo;
    }

    public void setNumDeBolsas( int numDeBolsas ) {
        this.numDeBolsas = numDeBolsas;
    }

    public void setCosto( int costo ) {
        this.costo = costo;
    }

    
    public void recibirPedido( int bolsas ){
        numDeBolsas = bolsas;
        costo = numDeBolsas * 250;
    }
    
    
    public int pagoPorCajas( int cjGrande, int cjMediana, int cjChica ){
        
        int CG = cjGrande;
        int CM = cjMediana;
        int CC = cjChica;
        
        CG = CG * 10;
        CM = CM * 5;
        CC = CC * 3;
        
        precioPorCajas = CG + CM + CC;
        return precioPorCajas;
    }
    
    public int pagoPorEspacios( int cjGrande, int cjMediana, int cjChica ){
        
        int CG = cjGrande;
        int CM = cjMediana;
        int CC = cjChica;
        
        CG = CG * 10;
        CM = CM * 5;
        CC = CC * 3;
        
        precioPorCajas = CG + CM + CC;
        return precioPorCajas;
    }
    
    public void imprimirTicket(){
        
       System.out.println(" ________________________________________");
       System.out.print("|Numero de bolsas ordenadas: " + numDeBolsas);
       System.out.println(" - $ " + costo + "|");
       
    }
    
}
