/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.basics;

/**
 *
 * @author alman
 */
public class Emp4 {
    
    private int empId;  
    private  String empName; 
    private double empGrossSalary;
    private String empJob;
    
  
    private static double totalBonus = 100_000;
    
    private double wallet;
   

    // constructors
    public Emp4() {

    }

    public Emp4(int empId, String empName, double empGrossSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empGrossSalary = empGrossSalary;

    }

    public Emp4(int empId, String empName, double empGrossSalary, String empJob) {
        this.empId = empId;
        this.empName = empName;
        this.empGrossSalary = empGrossSalary;
        this.empJob = empJob;
    }
    
    
    
    public static double getTotalBonus() {
        return totalBonus;
    }

    public double getWallet() {
        return wallet;
    }
    
    
    
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpGrossSalary() {
        return empGrossSalary;
    }

    public void setEmpGrossSalary(double empGrossSalary) {
        if (empGrossSalary < 0) {
            System.out.println("Invalid salary");
            System.exit(0);
        }else{
            this.empGrossSalary = empGrossSalary;
        }
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }

    
    
    
    /// other methods
    public double getMonthlyNetSalary() {
        int tax = 10;
        return empGrossSalary - empGrossSalary * tax / 100.0;
    }

    public double getAnnualNetSalary() {
        return getMonthlyNetSalary() * 12;
    }
    
 
    public void takeBonus(double bonusAmount){
         totalBonus = totalBonus - bonusAmount;
         wallet = wallet + bonusAmount;
    }

}
































