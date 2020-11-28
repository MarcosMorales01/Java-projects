/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

/**
 *
 * @author marco
 */
public class Account {
    private double balance;
    
    public Account(double initBalance){
        this.balance = initBalance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public boolean deposit(double amount){
        if (amount > 0){
            balance= balance + amount;
            return true;
        }else{    
            System.out.println("Monto incorrecto");
            return false;
        }    
    }
    
    public boolean withdraw(double amount){
        if ( amount > 0 && amount <= balance){
            balance= balance - amount;
            return true;
        }else{    
            System.out.println("Retiro invÃ¡lido");
            return false;
        }    
    }
    

}
