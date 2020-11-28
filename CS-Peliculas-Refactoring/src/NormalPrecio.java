package Process.Peliculas;

public class NormalPrecio extends Precio {

  public NormalPrecio(String titulo) {
    super(titulo);
  }

  @Override
  public double calcularRenta(int dias) {
    double monto = 2;
    if(dias > 2)
      monto += (dias - 2) * 1.5;

    return monto;
  }

  @Override
  public int puntosFrecuentes(int diasDeRenta) {
    return 1;
  }
  
}
