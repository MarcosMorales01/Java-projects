package Process.Peliculas;

public class NiniosPrecio extends Precio {

  public NiniosPrecio(String titulo) {
    super(titulo);
  }

  @Override
  public double calcularRenta(int dias) {
    double monto = 1.5;
    if(dias > 3)
      monto += (dias - 3) * 1.5;

    return monto;
  }

  @Override
  public int puntosFrecuentes(int diasDeRenta) {
    return 1;
  }
  
}
