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
public class TestEmp3 {

    public static void main(String[] args) {

        Emp3 emp_B1 = new Emp3();

        emp_B1.setEmpId(101);

        emp_B1.setEmpName("B1");
        emp_B1.setEmpGrossSalary(7000);

        System.out.println("id is : " + emp_B1.getEmpId());
        System.out.println("Salary is : " + emp_B1.getEmpGrossSalary());
        System.out.println("Name is : " + emp_B1.getEmpName());

        double emp_B1Monthly = emp_B1.getMonthlyNetSalary();
        double emp_B1Annual = emp_B1.getAnnualNetSalary();

        System.out.println("B1 = " + emp_B1Monthly);
        System.out.println("B1 = " + emp_B1Annual);

        System.out.println("---------------");
        Emp3 emp_B2 = new Emp3();
        emp_B2.setEmpId(102);
        emp_B2.setEmpName("B2");
        emp_B2.setEmpGrossSalary(12000);

        System.out.println("B2 Monthly net = " + emp_B2.getMonthlyNetSalary());
        System.out.println("B2 Annual net = " + emp_B2.getAnnualNetSalary());

        System.out.println("-------- Constructor --------------");
        // parameters constroctur
        Emp3 emp_B3 = new Emp3(103, "B3", 5000);

        System.out.println("B3 monthly = " + emp_B3.getMonthlyNetSalary());
        System.out.println("B3 Annual = " + emp_B3.getAnnualNetSalary());

        Emp3 emp_B4 = new Emp3(104, "B4", 6500);

        System.out.println("B4 monthly = " + emp_B4.getMonthlyNetSalary());
        System.out.println("B4 Annual = " + emp_B4.getAnnualNetSalary());

        System.out.println("----------------- Array of Objects ----------------");

        Emp3[] empsArray = new Emp3[5];

        empsArray[0] = emp_B1;
        empsArray[1] = emp_B2;
        empsArray[2] = emp_B3;
        empsArray[3] = emp_B4;
        empsArray[4] = new Emp3(105, "B5", 7000);

        System.out.println(emp_B1.getEmpName());

        System.out.println(empsArray[0].getEmpName());
        System.out.println(empsArray[4].getEmpName());

        double sum = 0;
        for (int i = 0; i < empsArray.length; i++) {

            System.out.println("name = " + empsArray[i].getEmpName()
                    + ", Gross Salary = " + empsArray[i].getEmpGrossSalary());

            sum = sum + empsArray[i].getEmpGrossSalary();
        }
        System.out.println("Sum Gross Salary = " + sum);

        System.out.println(" \n ");

        sum = 0;
        double sum1 = 0;
        for (Emp3 item : empsArray) {
            System.out.println("name = " + item.getEmpName()
                    + ", Gross Salary = " + item.getEmpGrossSalary()
                    + ", empId : " + item.getEmpId()
                    + ", Annual Net Salary = " + item.getAnnualNetSalary());
            sum = sum + item.getEmpGrossSalary();
            sum1 = sum1 + item.getAnnualNetSalary();
        }
        System.out.println("Sum Gross Salary = " + sum);
        System.out.println("Sum Annual Net Salarry = " + sum1);

    }
}
