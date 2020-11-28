package dominio;
import java.util.ArrayList;

public class Originator {
    private ArrayList<candidato> estado;
    public void setEstado(ArrayList<candidato> candidatos) {
	this.estado = candidatos;
    }
	
    public ArrayList<candidato> getEstado() {
	return estado;
    }
        
    public Memento guardar() {
	return new Memento(estado);
    }
	
    public void restaurar(Memento m) {
	this.estado = m.getEstado();	 
    }
}
