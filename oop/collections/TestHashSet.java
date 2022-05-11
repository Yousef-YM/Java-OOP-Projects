/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.collections;

import java.util.HashSet;

/**
 *
 * @author CC-Student
 */
public class TestHashSet {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("B");
        hs.add("B");
        System.out.println(hs);
    }
}
