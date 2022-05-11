/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class TestSerialize {
    public static void main(String[] args) {
        Emp e1 = new Emp(101, "Name_e1", 5000);
        Emp e2 = new Emp(102, "Name_e2", 7000);
        Emp e3 = new Emp(103, "Name_e3", 6000);
        
        // FileOutputStream    ;   ObjectOutputStream
      
        try {
              FileOutputStream fos = new FileOutputStream("C:\\my_files\\emps.txt");
              ObjectOutputStream oos = new ObjectOutputStream(fos);
              oos.writeObject(e1);
              oos.writeObject(e2);
              oos.writeObject(e3);
        
              oos.flush();
              oos.close();
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestSerialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestSerialize.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
