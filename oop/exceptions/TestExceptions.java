 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class TestExceptions {
    public static void main(String[] args) {
     
         Scanner input = new Scanner(System.in);
       try{  
         System.out.println("PLz enter first no.");
         int firstNo = input.nextInt();
         System.out.println("PLz enter second no.");
         int secondNo = input.nextInt();
         
         int result = firstNo / secondNo;
         System.out.println("Result = "+result);
         
       }catch(InputMismatchException ex){
           System.out.println("Plz enter only numbers");
          // System.exit(0);
       }catch(ArithmeticException ex){
           System.out.println("Cannot divide by Zero");
       }catch(Exception ex){
           System.out.println("Error happen - call admin");
       }
         
         System.out.println("Continue the program ...");
         
       
        try {  
            FileReader fr = new FileReader("employees.txt");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestExceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
}
