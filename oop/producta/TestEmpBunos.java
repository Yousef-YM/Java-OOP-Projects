/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.producta;

import java.util.ArrayList;
import java.util.Arrays;
import javase.oop.basics.Calculator;

/**
 *
 * @author alman
 */
public class TestEmpBunos {

    public static void main(String[] args) {
        System.out.println("add result = " + Calculator.add(5, 6));

        EmpBunos emp_B1 = new EmpBunos(101, "B1", 9000);
        EmpBunos emp_B2 = new EmpBunos(102, "B2", 8500);
        EmpBunos emp_B3 = new EmpBunos(103, "B3", 9500);

        EmpBunos[] empArray = new EmpBunos[3];

        empArray[0] = emp_B1;
        empArray[1] = emp_B2;
        empArray[2] = emp_B3;

        int bonus = 1000;
        double before = 0;
        double after = 0;

        for (int i = 0; i < empArray.length; i++) {

            empArray[i].setEmpGrossSalary(empArray[i].getEmpGrossSalary() + bonus);

        }

        for (EmpBunos item : empArray) {
            System.out.println(item.getEmpGrossSalary());

        }
    }

}
