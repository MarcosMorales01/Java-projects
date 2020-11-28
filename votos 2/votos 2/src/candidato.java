
public class candidato {
	String nombre;
	int nvotos;

	public String getNombre() {
		
	
		return nombre;
	}
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	public int getNvotos() {
		return nvotos;
	}
	public void setNvotos(int nvotos) {
		this.nvotos = nvotos;
	}
	
	@Override
	public String toString() {
		return "Candidato "+ nombre +" " + nvotos;
	}

}