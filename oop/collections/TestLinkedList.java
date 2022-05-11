/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.collections;

import java.util.LinkedList;

/**
 *
 * @author CC-Student
 */
public class TestLinkedList {
    public static void main(String[] args) {
        
    LinkedList stack = new LinkedList();
    
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        System.out.println(stack);
        System.out.println("---------------------");
    
        LinkedList queue = new LinkedList();
        queue.add("A");
        queue.add("B");
        queue.add("C");
                
        System.out.println(queue);        
             System.out.println(queue.poll());   
             System.out.println(queue.poll());   
             System.out.println(queue.poll());   
            System.out.println(queue);    
                
        
        
        
        
    }
}
