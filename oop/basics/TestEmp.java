/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.basics;

public class TestEmp {

    public static void main(String[] args) { 
        Emp emp_B1 = new Emp(); 
      
        emp_B1.empId = 101;
        emp_B1.empName = "B1";
        emp_B1.empGrossSalary = 7000;
      
        System.out.println("Name is : " + emp_B1.empName);

        double omarMonthly = emp_B1.getMonthlyNetSalary();

        double omarAnnual = emp_B1.getAnnualNetSalary();

        System.out.println("B1 Monthly = " + omarMonthly);
       
        System.out.println("B1 Annual = " + omarAnnual);
        
        System.out.println("---------------");
        Emp emp_B2 = new Emp(); 
        emp_B2.empId = 102;
        emp_B2.empName = "B2";
        emp_B2.empGrossSalary = 12000;
        emp_B2.empJob = "Java Developer";

       
System.out.println("B2 Monthly net = " + emp_B2.getMonthlyNetSalary());
System.out.println("B2 Annual net = " + emp_B2.getAnnualNetSalary());

        System.out.println("-------- Constructor --------------");
        
        Emp emp_B3 = new Emp(103, "B3", 5000); 
        
       
System.out.println("B3 monthly = " + emp_B3.getMonthlyNetSalary());
System.out.println("B3 Annual = " + emp_B3.getAnnualNetSalary());

    }

}






































