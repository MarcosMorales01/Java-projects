package Process.Peliculas;

public abstract class Precio {
	public String _titulo;
	
	public Precio(String titulo) {
		_titulo = titulo;
	}

	public String get_titulo() {
		return _titulo;
	}

	public abstract double calcularRenta(int dias);

	public abstract int puntosFrecuentes(int diasDeRenta);

}
