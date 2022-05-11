 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.exceptions;

import java.util.Scanner;

/**
 *
 * @author CC-Student
 */
public class NewClassException {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("PLz enter first no");
        int firstNo = input.nextInt();
        System.out.println("PLz enter second no");
        int secoundNo = input.nextInt();
        
        int result = firstNo + secoundNo;
        System.out.println("Result = "+result);
        
    }
    
}
