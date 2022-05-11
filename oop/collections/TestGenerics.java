/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.collections;

import java.util.ArrayList;
import javase.oop.inherit.Employee;

/**
 *
 * @author CC-Student
 */
public class TestGenerics {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "B1", 7000, "Java Dev", 10, 20.0);
        Employee emp2 = new Employee(102, "B2", 5000, "Java Dev", 10, 20.0);
        Employee emp3 = new Employee(103, "B3", 5000, "Java Dev", 10, 20.0);
        ArrayList<Employee> empsList = new ArrayList();
        empsList.add(emp1);  empsList.add(emp2);  empsList.add(emp3);    
          
                
        System.out.println("++++++ Loop on arrayList to print emps names using foreach loop ++++++++");
        
        for(Employee item : empsList){
            
            System.out.println( item.getPersonName());            
        }
        
        System.out.println("-------------loop using for i loop -------");
            for(int i = 0; i < empsList.size(); i++){
                System.out.println(empsList.get(i).getPersonName()  );
            }
        
    }
}
