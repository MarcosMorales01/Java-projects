/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;

public class Racional {

    private int num;
    private int den;

    public Racional() {
        this.num = 0;
        this.den = 1;
    }

    public Racional(int num, int den) {
        this.num = num;
        if(den==0){
            den = 1;
        }
        this.den = den;
        simplificar();
    }

    public Racional(int num) {
        this.num = num;
        this.den = 1;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //sumar fracciones
    public Racional sumar(Racional f) {
        Racional aux = new Racional();
        aux.num = this.num * f.den + this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //restar fracciones
    public Racional restar(Racional f) {
        Racional aux = new Racional();
        aux.num = this.num * f.den - this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //multiplicar fracciones
    public Racional multiplicar(Racional f) {
        Racional aux = new Racional();
        aux.num = this.num * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }

    //dividir fracciones
    public Racional dividir(Racional f) {
        Racional aux = new Racional();
        aux.num = this.num * f.den;
        aux.den = this.den * f.num;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //Cálculo del máximo común divisor por el algoritmo de Euclides
    private int mcd() {
        int u = Math.abs(num); //valor absoluto del numerador
        int v = Math.abs(den); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    //método para simplificar fracciones
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        num = num / n;
        den = den / n;
    }

    @Override
    public String toString() {
        simplificar();
        return num + "/" + den;
    }  
    
    public static void main(String[] args) {
        Racional racional1 = new Racional(1,2);
        Racional racional2 = new Racional(1,4);
        
        Racional suma = racional1.sumar(racional2);
        Racional resta = racional1.restar(racional2);
        Racional producto = racional1.multiplicar(racional2);
        Racional cociente = racional1.dividir(racional2);
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(cociente);
    }
} //Fin de la clase Fraccion
