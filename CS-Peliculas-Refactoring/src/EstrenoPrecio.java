package Process.Peliculas;

public class EstrenoPrecio extends Precio {

  public EstrenoPrecio(String titulo) {
    super(titulo);
  }

  @Override
  public double calcularRenta(int dias) {
    return dias * 3;
  }

  @Override
  public int puntosFrecuentes(int diasDeRenta) {
    return diasDeRenta > 1 ? 2 : 1;
  }
  
}
