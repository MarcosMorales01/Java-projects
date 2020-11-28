
package dominio;

/**
 *
 * @author marco
 */
public class Fraccion{
    private int numerador;
    private int denominador;
    
    public Fraccion (int num, int denom){
        asignaNumerador(num);
        asignaDenominador(denom);
    }
    
    public int obtenDenominador(){
        return denominador;
    }
    
    public int obtenNumerador(){
        return numerador;
    }
    
    public void asignaDenominador(int denom){
        if (denom == 0){
        System.err.println("Error fatal");
        System.exit(1);
        
    }
        denominador=denom;
}
    
    public void asignaNumerador(int num){
    numerador= num;
    }
    public String aString(){
    return obtenNumerador() + "/" + obtenDenominador();
    }
    
    // ========================================================== //
    
    public int mcd(int m, int n){
        
        int r= n % m;
        
        while (r != 0){
            n=m;
            m=r;
            r=n % m;
    }
        
    return m;
}
    // Metodo que retorna un objeto
    public Fraccion Simplifica(){
    
        int num = obtenNumerador();
        int denom = obtenDenominador();
        int mcd = mcd(num, denom);
    
        Fraccion simp= new Fraccion(num/mcd,denom/mcd);
        return simp;
    }
    public Fraccion Suma(Fraccion frac){
        int a,b,c,d;
        Fraccion adiciona;
        a = this.obtenNumerador();
        b = this.obtenDenominador();
        c = frac.obtenNumerador();
        d = frac.obtenDenominador();
        adiciona = new Fraccion(a*d + b*c, b*d);
        return adiciona;
        
    }
    
    public Fraccion Resta( Fraccion frac ){
        int a, b, c, d;
        Fraccion adiciona;
        a = this.obtenNumerador();
        b = this.obtenDenominador();
        c = frac.obtenNumerador();
        d = frac.obtenDenominador();
        adiciona = new Fraccion(a*d - b*c, b*d);
        return adiciona;
    }
    
    public Fraccion Multiplicacion( Fraccion frac ){
        
        int a, b, c, d;
        Fraccion adiciona;
        a = this.obtenNumerador();
        b = this.obtenDenominador();
        c = frac.obtenNumerador();
        d = frac.obtenDenominador();
        adiciona = new Fraccion(a*c, b*d);
        return adiciona;
    }
    
    public Fraccion Division( Fraccion frac ){
        
         int a, b, c, d;
        Fraccion adiciona;
        a = this.obtenNumerador();
        b = this.obtenDenominador();
        c = frac.obtenNumerador();
        d = frac.obtenDenominador();
        adiciona = new Fraccion(a*d, b*c);
        return adiciona;
    }
}    