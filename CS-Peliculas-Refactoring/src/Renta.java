package Process;
import Process.Peliculas.Precio;

public class Renta {
	private Precio _pelicula;
	private int _diasRentado;
	
	public Renta(Precio pelicula, int diasRentado){
		_pelicula = pelicula;
		_diasRentado = diasRentado;
	}

	public Precio getPelicula() {
		return _pelicula;
	}

	public int getDiasRentado() {
		return _diasRentado;
	}

	public double getTotalPrecioDeRenta(){
		return _pelicula.calcularRenta(_diasRentado);
	}

	public int getPuntosFrecuentes(){
		return _pelicula.puntosFrecuentes(_diasRentado);
	}
        /*
        private Precio _pelicula;
	private int _diasRentado;
	
	public Renta(Precio pelicula, int diasRentado){
		_pelicula = pelicula;
		_diasRentado = diasRentado;
	}

	public Precio getPelicula() {
		return _pelicula;
	}

	public int getDiasRentado() {
		return _diasRentado;
	}

	public double getTotalPrecioDeRenta(){
		return _pelicula.calcularRenta(_diasRentado);
	}

	public int getPuntosFrecuentes(){
		return _pelicula.puntosFrecuentes(_diasRentado);
	}
        */
}
