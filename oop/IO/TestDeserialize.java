/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.IO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class TestDeserialize {
    public static void main(String[] args) {
        
        try {
            // FileInputStream    ;   ObjectInputStream
            FileInputStream fis = new FileInputStream("C:\\my_files\\emps.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                
              Emp e =   (Emp) ois.readObject();
                 while( e != null ){
                     System.out.println("emp id = "+e.getEmpId()+", name = "+e.getEmpName());
                     e =   (Emp) ois.readObject();
                 }
             
              
        } catch ( EOFException ex)  {
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestDeserialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestDeserialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestDeserialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
