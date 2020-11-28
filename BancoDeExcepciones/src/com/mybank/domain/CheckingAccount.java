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
public class CheckingAccount extends Account {
    private double overDraftAmount;
    
    public CheckingAccount( double balance, double overDraftAccount){
        super(balance);
        this.overDraftAmount = overDraftAmount;
        
    }
    
    public CheckingAccount(double balance){
        super(balance);
        this.overDraftAmount = 0.0;
    }
    
    
}
