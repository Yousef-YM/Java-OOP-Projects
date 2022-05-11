/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.inherit;

import java.util.ArrayList;

/**
 *
 * @author alman
 */
public class TestInheit {

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
        System.out.println("---- Create Employee object using Constructor -----------");

        Employee emp_B2 = new Employee(102, "B2", 6000, "Java dev", 10, 25.0);

        System.out.println("Monthly Net = " + emp_B2.getMonthlyNetSalary());
        System.out.println("Annual Net = " + emp_B2.getAnnualNetSalary());

        System.out.println("-------------------");

        Manager mg_B3 = new Manager(105, "B3", 7000, "Mangar", 10);

        System.out.println("Monthly = " + mg_B3.getMonthlyNetSalary());

        System.out.println("Annuai = " + mg_B3.getAnnualNetSalary());
        double companyProfit = 1_000_000.00; // get value from db method
        System.out.println("Annual with profit = " + mg_B3.getAnnualNetSalary(companyProfit));

        System.out.println("++++++++ Overriding ++++++++++");
        emp_B1.printPersonDetails();
        System.out.println("-----------------------");
        mg_B3.printPersonDetails();
    }

}
