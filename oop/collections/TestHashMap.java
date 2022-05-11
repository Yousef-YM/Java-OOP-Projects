/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.collections;

import java.util.HashMap;

/**
 *
 * @author CC-Student
 */
public class TestHashMap {
    public static void main(String[] args) {
        
        HashMap<String, Object> hm = new HashMap();
        hm.put("IP", "192.168.1.2");
        hm.put("db-port", 1521);
        hm.put("Lang", "EN");
        
        System.out.println(hm.get("IP"));
         hm.put("IP", "192.168.1.3");
         System.out.println(hm.get("IP"));
    }
}
