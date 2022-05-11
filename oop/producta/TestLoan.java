/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.producta;

import java.util.Date;

/**
 *
 * @author alman
 */
public class TestLoan {
    public static void main(String[] args) {
        
        Loan loanAli = new Loan();
        
        System.out.println("Load date = "+loanAli.getLoanDate());
        loanAli.setNumberOfYears(7);
        loanAli.setLoanAmunt(100_000.0);
        loanAli.setAnnualInteresRate(0.12);
        
        double monthlyPay = loanAli.getMonthlyPayment();
        System.out.println(monthlyPay);
        
        double totalPayment = loanAli.getTotalPayment();
        System.out.println(totalPayment);
        
    }
    
}
