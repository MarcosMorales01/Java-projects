import java.util.ArrayList;

public class Memento {
	
	private ArrayList<candidato> estado;
	
	public Memento(ArrayList<candidato> estado) {
		this.estado = estado;
	}
	
	
	public ArrayList<candidato> getEstado() {
		return estado;
	}
	

}
