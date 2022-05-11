/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.collections;

import java.util.TreeSet;

/**
 *
 * @author CC-Student
 */
public class TestTreeSet {
    public static void main(String[] args) {
        // ordering data  ||   remove duplicate
        TreeSet ts = new TreeSet();
        ts.add(6);
        ts.add(15);
        ts.add(8);
        ts.add(7);
        ts.add(8);
        ts.add(8);
        System.out.println(ts);
                
        
        
    }
}
