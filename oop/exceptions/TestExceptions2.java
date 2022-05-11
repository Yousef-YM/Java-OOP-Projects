/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author CC-Student
 */
public class TestExceptions2 {
    public static void main(String[] args) {
        
      try{  
       String firstStr = JOptionPane.showInputDialog("PLz enter first no.");
            int firstNo = Integer.parseInt(firstStr);
            
       String secondStr = JOptionPane.showInputDialog("PLz enter second no.");
            int secondNo = Integer.parseInt(secondStr);
        int result = firstNo / secondNo;
        System.out.println("Result = "+result);
        
      }catch(NumberFormatException ex){
          System.out.println("plz enter only numbers");
      }finally{
          System.out.println("it must execute finally");
      }
        System.out.println("Continue the program ....");
    }
}
