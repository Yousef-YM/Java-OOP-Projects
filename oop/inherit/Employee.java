/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.inherit;

/**
 *
 * @author alman
 *///      
public class Employee extends Person {

    private int overTimeHours;
    private double overTimeRate;

    public Employee() {

    }

    public Employee(int personId, String personName, double personGrossSalary, String personJob,
            int overTimeHours, double overTimeRate) {

        super(personId, personName, personGrossSalary, personJob);
        this.overTimeHours = overTimeHours;
        this.overTimeRate = overTimeRate;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }

    public double getMonthlyNetSalary() {
        int tax = 10;
        return getPersonGrossSalary() - getPersonGrossSalary() * tax / 100.0
                + overTimeHours * overTimeRate;
    }

    public double getAnnualNetSalary() {
        return getMonthlyNetSalary() * 12;
    }

    @Override
    public void printPersonDetails() {

        super.printPersonDetails();
        System.out.println("Mnnthy net = " + getMonthlyNetSalary());
        System.out.println("Annual net = " + getAnnualNetSalary());
    }

    @Override
    public String toString() {
        return "this is employee object, id = " + getPersonId() + ", name = " + getPersonName();
    }

    @Override
    public int calcLeaveDays() {
        return 10;
    }

}
