/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author marco
 */
public class Metodos {
    
    
    public void A(){
        try {
            B();
        }catch (Exception e){
            System.out.println("A");
        }
    }
    
    public void B(){
        try {
            C();
        }catch (Exception e){
            System.out.println("B");
        }
    }
     public void C() throws Exception{
         D();
     }
     
     public void D() throws Exception{
         if ( true ){
            throw new Exception();
        }
     }
}
