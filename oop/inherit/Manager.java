/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.inherit;

/**
 *
 * @author alman
 */
public class Manager extends Person {

    private int profitPercentage;//10%

    public Manager(int personId, String personName, double personGrossSalary, String personJob, int profitPercentage) {
        super(personId, personName, personGrossSalary, personJob);
        this.profitPercentage = profitPercentage;
    }

    public int getProfitPercentage() {
        return profitPercentage;
    }

    public void setProfitPercentage(int profitPercentage) {
        this.profitPercentage = profitPercentage;
    }

    public double getMonthlyNetSalary() {
        int tax = 10;
        return getPersonGrossSalary() - getPersonGrossSalary() * tax / 100.0;
    }

    public double getAnnualNetSalary() {
        return getMonthlyNetSalary() * 12;
    }

    // overloading method
    public double getAnnualNetSalary(double companyProfit) {
        return getAnnualNetSalary() + companyProfit * profitPercentage / 100.0;
    }

    @Override
    public int calcLeaveDays() {

        return 20;
    }

}
