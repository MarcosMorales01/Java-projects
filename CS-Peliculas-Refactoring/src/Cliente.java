package Process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import Process.Peliculas.*;


public class Cliente {
	private String _nombre;
	private ArrayList<Renta> _rentas = new ArrayList<Renta>();
	
	public Cliente (String nombre){
		_nombre = nombre;
	}
	
	public void addRenta(Renta renta){
		_rentas.add(renta);
	}
	
	public String getNombre(){
		return _nombre;
	}
	public String realizarRenta(){
		double montoTotal = 0;
		int puntosRentaFrecuente = 0;
		Enumeration<Renta> rentas = (Enumeration<Renta>) Collections.enumeration(_rentas);
		String resultado = " Registro de rentas de " + getNombre() + "\n";

		while(rentas.hasMoreElements()){
			double monto =  0;
			Renta cadaRenta = rentas.nextElement();
			
			monto = cadaRenta.getTotalPrecioDeRenta();

			puntosRentaFrecuente += cadaRenta.getPuntosFrecuentes();

			resultado += "\t" + cadaRenta.getPelicula().get_titulo()+ "\t" + String.valueOf(monto) + "\n";
			
			montoTotal += monto;
			
		}
		
		resultado += "Monto ganado es " + String.valueOf(montoTotal) + "\n";
		resultado += "Ganaste "+ String.valueOf(puntosRentaFrecuente) + " puntos";
		
		return resultado;
		
	}
	
	public static void main (String args[]) {
		//Creamos cliente
		Cliente cliente = new Cliente("Juan");

		//Creamos las peliculas
		Precio pelicula = new NormalPrecio("Matrix");
		Precio pelicula2 = new EstrenoPrecio("Matrix 2");
		Precio pelicula3 = new TerrorPeliculas("La masacre de texas");

		//Los añadimos a la lista de rentas
		cliente.addRenta(new Renta(pelicula, 2));
		cliente.addRenta(new Renta(pelicula2, 2));
		cliente.addRenta(new Renta(pelicula3, 4));

		//Generamos la renta
		System.out.println(cliente.realizarRenta());
	}
	
}
