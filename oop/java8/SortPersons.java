/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.java8;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author CC-Student
 */
public class SortPersons implements Comparator<Person>{

    @Override
    public int compare(Person per1, Person per2) {
            if(per1.getPersonAge() > per2.getPersonAge()){
                return 1;
            }else if(per1.getPersonAge() < per2.getPersonAge()){
                return -1;
            }else{
                return 0;
            }
    }

  
    
}
