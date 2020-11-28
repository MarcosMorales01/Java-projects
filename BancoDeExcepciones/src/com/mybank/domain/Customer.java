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
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    
    public Customer(String f, String l){
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public String getNombreCompleto(){
        return (this.firstName + " " + this.lastName);
    }
    

}
