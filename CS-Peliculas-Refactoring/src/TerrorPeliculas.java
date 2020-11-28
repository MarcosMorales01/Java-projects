package Process.Peliculas;

public class TerrorPeliculas extends Precio {
    public TerrorPeliculas(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularRenta(int dias) {
        return dias*0.5;
    }

    @Override
    public int puntosFrecuentes(int diasDeRenta){
        return diasDeRenta*3;
    }
}
