/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

/**
 *
 * @author marcos
 */
public class SavingAccount extends Account {
    
    protected double interestRate;

    public SavingAccount( double initBalance, double interestRate ) {
        super(initBalance);
    }
    
}
