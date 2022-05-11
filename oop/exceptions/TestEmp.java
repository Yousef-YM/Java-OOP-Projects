/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class TestEmp {
    public static void main(String[] args) {
        
        try {
        // salary < 500
        Emp e1 = new Emp(101, "B1", 400);
           
          System.out.println("emp salary = "+e1.getEmpSalary());
            e1.setEmpSalary(300);
        } catch (SalaryException ex) {
            System.out.println("salary must be > 500");
        }
        
      
        
    }
}
