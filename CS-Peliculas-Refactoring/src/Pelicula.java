package Process.Peliculas;

public class Pelicula {
    private String _titulo;
    private String _anio;
    private String _director;
    private String _resumem;
    private Precio _precio;

    public Pelicula(String _titulo, String _anio, String _director, String _resumem, Precio _precio) {
        this._titulo = _titulo;
        this._anio = _anio;
        this._director = _director;
        this._resumem = _resumem;
        this._precio = _precio;
    }
    
}
