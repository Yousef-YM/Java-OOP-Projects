/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.inherit;

import java.util.Date;

/**
 *
 * @author CC-Student
 */
public class TestInherit3 {
    
    public static void main(String[] args) {
           Employee emp_B1 = new Employee();

        emp_B1.setOverTimeHours(10);
        emp_B1.setOverTimeRate(25.0);
        emp_B1.setPersonGrossSalary(5000);
        emp_B1.setPersonId(101);
        emp_B1.setPersonName("B1");
        emp_B1.setPersonJob("Web Developer");

        System.out.println("Monthly Net = " + emp_B1.getMonthlyNetSalary());
        System.out.println("Annual Net = " + emp_B1.getAnnualNetSalary());
        System.out.println
        ("---- Create Employee object using Constructor -----------");

        Employee emp_B2 = new Employee
        (102, "B2", 6000, "Java dev", 10, 25.0);
        
        System.out.println("Monthly Net = " + emp_B2.getMonthlyNetSalary());
        System.out.println("Annual Net = " + emp_B2.getAnnualNetSalary());

        System.out.println("-------------------");

        Manager mg_B3 = new Manager(105, "B3", 7000, "Mangar", 10);

        System.out.println("Monthly = " + mg_B3.getMonthlyNetSalary());

        System.out.println("Annuai = " + mg_B3.getAnnualNetSalary());
        
        double companyProfit = 1_000_000.00; // get value from db method
        System.out.println
        ("Annual with profit = " + mg_B3.getAnnualNetSalary(companyProfit));

        System.out.println("++++++++ Overriding ++++++++++");
        emp_B1.printPersonDetails();
        
        System.out.println("-----------------------");
        mg_B3.printPersonDetails();
        
        System.out.println("------------- toString() method in Object class --------------------");
        System.out.println("Object ahmed data = "+emp_B1);
        Date today = new Date();
        System.out.println(today);
        
        System.out.println("+++++++++++++++ polymorphism ++++++++++++++");
            printData(emp_B1);
            printData(mg_B3);
                 
           System.out.println("----------------  Test Abstract class  ------------------"); 
    
            System.out.println("+++++++++++ Test abstract method +++++++++++");
            System.out.println("emp leave days = "+emp_B1.calcLeaveDays());
            System.out.println("mgr leave days = "+mg_B3.calcLeaveDays());
            
            
            System.out.println("++++++++++++  Test interface ++++++++++++++++++");

            Consultant c1 = new Consultant();
         System.out.println("Acommodation cost = "+c1.calcAccomodationCost(7));
            
    }//main method 
    public static void printData(Person per){
            System.out.println("name = "+per.getPersonName());
            if(per instanceof Employee){
                   
                  System.out.println("Monthly net Salary = "+ ( (Employee) per).getMonthlyNetSalary());
            }else if(per instanceof Manager){
               
                  System.out.println("Monthly net Salary = "+ ( (Manager) per).getMonthlyNetSalary());
            }
       
    }
    
}
