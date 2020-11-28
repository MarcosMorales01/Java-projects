/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * José Marcos Morales Gómez
 */
public class Elemento {
    int Dato;
    int linea;

    public Elemento(int Dato, int linea) {
        this.Dato = Dato;
        this.linea = linea;
    }

    public int getDato() {
        return Dato;
    }

    public int getLinea() {
        return linea;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }
    
    
}
