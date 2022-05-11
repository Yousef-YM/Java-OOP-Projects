/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.basics;

import javase.oop.basics.Emp2;

/**
 *
 * @author alman
 */
public class TestEmp2 {
    public static void main(String[] args) {
         
           Emp2 emp_B1 = new Emp2();   
      
        emp_B1.setEmpId(101);
        
        emp_B1.setEmpName("B1");
        emp_B1.setEmpGrossSalary(7000); 
       
           System.out.println("id is : "+emp_B1.getEmpId());
           System.out.println("Salary is : "+emp_B1.getEmpGrossSalary());
        System.out.println("Name is : " + emp_B1.getEmpName());

        double omarMonthly = emp_B1.getMonthlyNetSalary();
        double omarAnnual = emp_B1.getAnnualNetSalary();
                                                  
        System.out.println("B1 Monthly = " + omarMonthly);
        System.out.println("B1 Annual = " + omarAnnual);
        
        System.out.println("---------------");
        Emp2 emp_B2 = new Emp2();
        emp_B2.setEmpId(102);
        emp_B2.setEmpName("B2");
        emp_B2.setEmpGrossSalary(-12000);
        
        
        
        
       

System.out.println("B2 Monthly net = " + emp_B2.getMonthlyNetSalary());
System.out.println("B2 Annual net = " + emp_B2.getAnnualNetSalary());

        System.out.println("-------- Constructor --------------");                
        Emp2 emp_B4 = new Emp2(103, "B4", 5000); 
        System.out.println("B4 monthly = " + emp_B4.getMonthlyNetSalary());
System.out.println("B4 Annual = " + emp_B4.getAnnualNetSalary());

    }
}






























