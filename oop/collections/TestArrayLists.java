/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.collections;

import java.util.ArrayList;

/**
 *
 * @author CC-Student
 */
public class TestArrayLists {
    public static void main(String[] args) {
        // int[] myrray = new int[5];
        ArrayList myList = new ArrayList();
        myList.add(100);
        myList.add(55.4);
        myList.add("Yousef");
        myList.add(77);
        
        System.out.println("MyList :\n"+myList);
        
        System.out.println("--------- add item on index -----------");
        
        myList.add(2, "Sameh");
        
        System.out.println("MyList :\n"+myList);
        
        System.out.println("------- get item using index -----------");
        
        System.out.println(myList.get(2));
        System.out.println("------------- find index of item --------------------");
        
        System.out.println(myList.indexOf(77));
        
        System.out.println("---------------- List Size -------------------");
        
        System.out.println(myList.size());
        
        System.out.println("--------------- search for item -------------------");
        
        System.out.println(myList.contains("Yousef"));
        
        System.out.println("------------------ remove item using index -------------------");
        
        System.out.println(myList.remove(1));
        
        System.out.println(myList);
        
        System.out.println("------------- loop using for i loop ----------------");
        
        for(int i = 0 ; i < myList.size() ; i ++){
            System.out.println(myList.get(i));
        }
        
        System.out.println("--------------- loop using for each loop ---------------");
        
        for(Object item : myList){
            
            System.out.println(item);
            
        }
        
    }
}
