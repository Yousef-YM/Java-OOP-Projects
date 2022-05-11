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
public class Calculator {
     private int length;  
     private int width;
     private String model;
     private String color;
   

     // parametrs constructor
    public Calculator(int length, int width, String model, String color) {
        this.length = length;
        this.width = width;
        this.model = model;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     
     
     

     public static int add(int a, int b){
         
         return a + b;
     }
     
     public static int subtract(int a, int b){
         return a - b;
     }
     
     
}
