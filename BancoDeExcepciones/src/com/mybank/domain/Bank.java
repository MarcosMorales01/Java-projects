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
public class Bank {
    
    private Customer[]  customers;
    private int numOfCustomers;
    
    public Bank(){
        customers = new Customer[10];
        numOfCustomers = 0;
    }
    
    public void addCustomer(String f, String l){
        customers[numOfCustomers] = new Customer(f,l);
        numOfCustomers++;
    }

    public int getNumOfCustomers() {
        return numOfCustomers;
    }
    
    public Customer getCustomer(int index){
        return customers[index];
    }

}
