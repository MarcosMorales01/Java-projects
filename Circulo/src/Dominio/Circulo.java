
package Dominio;

/**
 *
 * @author marcos
 */
public class Circulo {
    
    private double radio;
    private final static double PI = 3.141592;
    private double area;
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double obtenerArea(){
        
        return area;
    }
    
    public double obtenerCircunferencia( double radio ){
        
        area = PI * radio * radio;
        return area;
    } 
    
    //Constructores
    public Circulo(){
        this(5);
    }
    
    public Circulo(double radio){
        this.radio =  radio;
        obtenerCircunferencia(radio);
    }
}
