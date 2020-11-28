/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.test;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.Customer;

/**
 *
 * @author marco
 */
public class TestBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank banco = new Bank();
        banco.addCustomer("Juan", "Rulfo");
        banco.addCustomer("Juana", "Iris");
        banco.addCustomer("Pedro", "PÃ¡ramo");
        
        
        banco.getCustomer(0).setAccount(new Account(2000));
        banco.getCustomer(0).getAccount().deposit(500);
        
        banco.getCustomer(1).setAccount(new Account(5000));
        banco.getCustomer(1).getAccount().withdraw(300);
        
        banco.getCustomer(2).setAccount(new Account(2500));
        banco.getCustomer(2).getAccount().withdraw(120);
        
        Customer cliente = banco.getCustomer(0);
        System.out.println(cliente.getNombreCompleto() + " "+cliente.getAccount().getBalance());
        
        
        

    }
    
}
