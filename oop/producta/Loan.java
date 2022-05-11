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
public class Loan {
    
    private double annualInteresRate;
  //  private double monthlyInteresRate;
    private int numberOfYears;
    private double loanAmunt;
    private Date loanDate = new Date(121, 4, 21);
    
    public Loan(){
        
    }

    public Loan(double annualInteresRate, int numberOfYears, double loanAmunt) {
        this.annualInteresRate = annualInteresRate;
        this.numberOfYears = numberOfYears;
        this.loanAmunt = loanAmunt;
    }

  
    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

   

    

    public double getAnnualInteresRate() {
        return annualInteresRate;
    }

    public void setAnnualInteresRate(double annualInteresRate) {
        this.annualInteresRate = annualInteresRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmunt() {
        return loanAmunt;
    }

    public void setLoanAmunt(double loanAmunt) {
        this.loanAmunt = loanAmunt;
    }
    
    
    
    public double getMonthlyPayment(){
        double monthlyInteresRate = annualInteresRate / 12.0;
        double part1 = loanAmunt * monthlyInteresRate;
        double part2 = 1 - 1 / (Math.pow(1 + monthlyInteresRate, numberOfYears * 12));
        double part3 = part1 / part2;
        return Math.round(100 * part3) / 100.0;
    }
    
    public double getTotalPayment(){
        return getMonthlyPayment()*numberOfYears*12;
    }
    
}
