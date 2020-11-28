package dominio;
import java.util.ArrayList;

public class observado {
	
    private ArrayList<Observer> observadores = new ArrayList<Observer>();
    
    public void agregar(Observer observador) {
	observadores.add(observador);
    }
	
    public void eliminar(int i) {
	observadores.remove(i);
    }
	
    public void notificar(ArrayList<candidato> candidato) {
	for(int i=0;i<observadores.size();i++){		   
	    observadores.get(i).actualizar(candidato);   
	}
    }
}
