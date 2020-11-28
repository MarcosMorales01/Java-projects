
package Prueba;

import Dominio.Cliente;
import Dominio.Caja;

public class MainCafe {

    public static void main(String[] args) {
        
        Cliente persona1;
        int bolsas = 56;
        persona1 = new Cliente(bolsas,0,0);
        Caja pedido1 = new Caja();
        pedido1.obtenerCajaGrande(bolsas);
        persona1.recibirPedido(bolsas);
        
        System.out.println("POR NUMERO DE ESPACIOS");
        persona1.imprimirTicket();
        pedido1.impresionPorEspacios();
        
        System.out.println("POR NUMERO DE CAJAS");
        persona1.imprimirTicket();
        pedido1.obtenerCjGr(bolsas);
        pedido1.impresionPorCaja();
    }
    
}
