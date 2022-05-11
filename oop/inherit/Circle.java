/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.inherit;

/**
 *
 * @author alman
 */
public class Circle extends GeometricObject{
    
    private double radius;
    
    public Circle(){
        
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
     
    public double getArea(){
        return Math.PI * Math.pow(radius, 2); // pi * radius * radius
    }
    
    
}
