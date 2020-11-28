package primerRefactoring.Before;


public class Pelicula {
	public static final int NINIOS = 2;
	public static final int NORMALES = 0;
	public static final int ESTRENOS = 1;
	
	public String _titulo;
	public int _tipo;
	
	public Pelicula (String titulo, int tipo) {
		_titulo = titulo;
		_tipo = tipo;
	}

	public int get_tipo() {
		return _tipo;
	}

	public void set_tipo(int _tipo) {
		this._tipo = _tipo;
	}

	public String get_titulo() {
		return _titulo;
	}

}
