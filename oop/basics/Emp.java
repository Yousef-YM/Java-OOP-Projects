/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.basics;


public class Emp {

    int empId;
    String empName;
    double empGrossSalary;
    String empJob;


    public Emp() {
    }
    
    
    public Emp(int empId, String empName, double empGrossSalary) {

        this.empId = empId;
        this.empName = empName;
        this.empGrossSalary = empGrossSalary;
      
    }

   
    public double getMonthlyNetSalary() {
        int tax = 10; 
        return empGrossSalary - empGrossSalary * tax / 100.0;
    }

    public double getAnnualNetSalary() {
        return getMonthlyNetSalary() * 12;
    }
}








































