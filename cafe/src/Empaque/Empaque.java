/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empaque;
import Dominio.Bolsa;
import Dominio.CajaG;
import Dominio.CajaM;
import Dominio.CajaC;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Empaque {
    private int bolsasEmpacadas;
    private int costoTotal;
    private int cajasG;
    private int cajasM;
    private int cajasC;
    //constructor
    public Empaque(){
        
    }
    //Metodos get
    public int getBolsasEmpacadas() {
        return bolsasEmpacadas;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public int getCajasG() {
        return cajasG;
    }

    public int getCajasM() {
        return cajasM;
    }

    public int getCajasC() {
        return cajasC;
    }   

    public void setBolsasEmpacadas(int bolsasEmpacadas) {
        this.bolsasEmpacadas = bolsasEmpacadas;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public void setCajasG(int cajasG) {
        this.cajasG = cajasG;
    }

    public void setCajasM(int cajasM) {
        this.cajasM = cajasM;
    }

    public void setCajasC(int cajasC) {
        this.cajasC = cajasC;
    }
    //Metodo que solicita un entero de "bolsas", estas serán repartidas en cajas
    public void solicitarBolsas(){
        Scanner read = new Scanner(System.in);
        int bolsas;
        
       System.out.println("Numero de bolsas: "); //Solicitamos el dato
       bolsas = read.nextInt();
       setBolsasEmpacadas(bolsas);     //Asignamos el valor al atributo de bolsas.   
    }
    
    public void repartirBolsasMinCajas(){
        Bolsa bolsaCafe = new Bolsa();
        CajaG cjG = new CajaG();
        CajaM cjM = new CajaM();
        CajaC cjC = new CajaC();
                
        int cajasGrandes=0;
        int cajasMedianas=0;
        int cajasChicas=0;
        int bolsas = this.getBolsasEmpacadas();
        
        while(bolsas > 0) //Bolsas deben ser mayor de 0
        {
//            System.out.println("\n"+bolsas);
            if(bolsas >= cjG.getCapacidad() || bolsas >= (cjM.getCapacidad() + cjC.getCapacidad()) ){ // Esta condicion verifica si es mayor o igual 20 ó mayor igual a 15
                bolsas -= cjG.getCapacidad();
                cajasGrandes+=1;
            }
            else if(bolsas >= cjM.getCapacidad() || bolsas >= cjC.getCapacidad()){//Esta condición verifica si es mayor o igual a 10 ó  mayor o igual a 5
                bolsas -= cjM.getCapacidad();
                cajasMedianas+=1;
            }
            else if(bolsas <= cjC.getCapacidad() || bolsas > cjC.getCapacidad()){//Esta condicion verifica que sea menor,igual o mayor que 5  
                bolsas -= cjC.getCapacidad();
                cajasChicas+=1;
            }
        }
        
        this.setCajasG(cajasGrandes);
        this.setCajasM(cajasMedianas);
        this.setCajasC(cajasChicas);
    }
    
   public void repartirBolsasMinEspacios(){
     Bolsa bolsaCafe = new Bolsa();
        CajaG cjG = new CajaG();
        CajaM cjM = new CajaM();
        CajaC cjC = new CajaC();
                
        int cajasGrandes=0;
        int cajasMedianas=0;
        int cajasChicas=0;
        int bolsas = this.getBolsasEmpacadas();
        
        while(bolsas > 0)
        {

            if(bolsas >= cjG.getCapacidad()){//Verifica que sea mayor o igual a 20
                bolsas -= cjG.getCapacidad();
                cajasGrandes+=1;
            }
            else if(bolsas >= cjM.getCapacidad()){//Verifica que sea mayor o igual a 10
                bolsas -= cjM.getCapacidad();
                cajasMedianas+=1;
            }
            else if(bolsas <= cjC.getCapacidad() || bolsas > cjC.getCapacidad() ){//Esta condicion verifica que sea menor,igual o mayor que 5
                bolsas -= cjC.getCapacidad();
                cajasChicas+=1;
            }
        }
        
        this.setCajasG(cajasGrandes);
        this.setCajasM(cajasMedianas);
        this.setCajasC(cajasChicas);
   }
    //Metodo que calcula el costo total
    public void calcularCosto(){
        
        CajaG cjG = new CajaG();
        CajaM cjM = new CajaM();
        CajaC cjC = new CajaC();
        
        int cantidadBolsas;
        int costoBolsas;
        int costoCajas;
        int costoTl;
        
        cantidadBolsas = getBolsasEmpacadas();
        costoBolsas = cantidadBolsas * Bolsa.getPRECIO();
        costoCajas = (this.cajasC * cjM.getPrecio()) + (this.cajasM * cjM.getPrecio()) + (this.cajasG * cjG.getPrecio());
        costoTl = costoBolsas + costoCajas;
        setCostoTotal(costoTl);
               
    }
    //Metodo que imprime el ticket
    public void imprimirTicket(){
        
        CajaG cjG = new CajaG();
        CajaM cjM = new CajaM();
        CajaC cjC = new CajaC();
        
        System.out.println("|-------------------------------------------|");
        System.out.println("|  Numero de bolsas ordenadas: "+this.getBolsasEmpacadas()+" - $"+this.getBolsasEmpacadas()*Bolsa.getPRECIO());
        System.out.println("|  Cajas usadas:");
        System.out.println("|  "+this.getCajasG()+" - grandes/s - $ "+this.getCajasG()*cjG.getPrecio());
        System.out.println("|  "+this.getCajasM()+"  - medianas/s - $ "+this.getCajasM()*cjM.getPrecio());
        System.out.println("|  "+this.getCajasC()+" - pequeña/s - $ "+this.getCajasC() * cjC.getPrecio());
        System.out.println("|                                      ");
        System.out.println("|  Su costo total es de: $ "+this.getCostoTotal());
        System.out.println("|-------------------------------------------|");        
    }
    //Metodo de empaque, llama a todos los metodos y adicionalmente imprime unos espacio para separar los tickets
    //Perdone profe me quede sin tiempo, quería hacerlo más decente.
    public void empacar(){
        solicitarBolsas();
        repartirBolsasMinCajas();
        calcularCosto();
        System.out.println("\n Ticket minimo de cajas \n\n");
        imprimirTicket();
        System.out.println("\n\n\n");
        repartirBolsasMinEspacios();
        calcularCosto();
        System.out.println("\n Ticket minimo de espacios \n\n");
        imprimirTicket();
    }
}
