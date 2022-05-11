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
public class TestCalculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10, 5,"Sony" , "White");
        
        Calculator c2 = new Calculator(12, 4,"Samsung" , "Black");
        
        System.out.println(c1.add(4, 7));
        System.out.println(c2.add(4, 7));
        
        
        System.out.println(Calculator.add(4, 7));
        System.out.println(Math.pow(2, 3));
        
        
    }
}


















































