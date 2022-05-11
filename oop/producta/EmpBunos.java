/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.producta;

/**
 *
 * @author alman
 */
public class EmpBunos {
    
    private int empId;
    private String empName;
    private double empGrossSalary;
    //private String emoJob;
    
    public EmpBunos(){
        
    }

    public EmpBunos(int empId, String empName, double empGrossSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empGrossSalary = empGrossSalary;
        //this.emoJob = emoJob;
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
        this.empGrossSalary = empGrossSalary;
    }

   
    
    /*
    public double empBunosPlus(int bunos){
        
      return empGrossSalary = empGrossSalary + bunos;
    }
    */
    
    
}
