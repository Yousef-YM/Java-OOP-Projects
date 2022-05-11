/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.exceptions;

import java.util.InputMismatchException;

/**
 *
 * @author CC-Student
 */
public class Emp {
    private int empId;
    private String empName;
    private double empSalary;

    public Emp(int empId, String empName, double empSalary) throws SalaryException {
        this.empId = empId;
        this.empName = empName;
       // this.empSalary = empSalary;
        setEmpSalary(empSalary);
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

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) throws SalaryException {
          if(empSalary < 500){
              throw new SalaryException(); 
          }
        
        this.empSalary = empSalary;
    }
    
    
}
