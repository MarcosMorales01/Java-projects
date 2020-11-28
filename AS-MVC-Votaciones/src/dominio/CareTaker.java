package dominio;
import java.util.ArrayList;

public class CareTaker {
    
    private ArrayList<Memento> mementos= new ArrayList<>();
    
    public void addMemento(Memento m){
        mementos.add(m);
    }
    public Memento getMemento(int i){
       return mementos.get(i);
    }
}