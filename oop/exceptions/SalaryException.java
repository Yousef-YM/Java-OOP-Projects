/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.exceptions;

/**
 *
 * @author CC-Student
 */
public class SalaryException extends Exception{
     public SalaryException(){
         super("Salary cannot be less than 500");
     }
}
