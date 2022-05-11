/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class TestFiles {
    public static void main(String[] args) {
        String s = "";
        try {
            // FileReader   |   BufferedReader
            FileReader fr = new FileReader ("C:\\my_files\\read_data.txt");
            BufferedReader bfr = new BufferedReader(fr);
           String text =  bfr.readLine();
               
           while(  text != null){
               System.out.println(text);
               s = s + text+"\n";
               text =  bfr.readLine();
           }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestFiles.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("-------------------------");
        System.out.println(s);
                
        System.out.println("++++++++++++ writing to files +++++++++++++++");
        // FileWriter    |  BufferedWriter
        try {
            FileWriter fw = new FileWriter("C:\\my_files\\write_data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("This is Good");
            bw.newLine();
            bw.write("We are okay all");
            
           bw.flush();
            /// Console screen            
        } catch (IOException ex) {
            Logger.getLogger(TestFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
