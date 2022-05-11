/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class TestIOStream {

    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            // FileInputStream ,  BufferedInputStream
            // FileOutputStream ,  BufferedOutputStream

            fis = new FileInputStream("C:\\my_files\\fii.jpeg");
            bis = new BufferedInputStream(fis);

            fos = new FileOutputStream("C:\\my_files\\fii2.jpeg");
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024]; 
            int i = bis.read(buffer);

            while (i != -1) {
                System.out.println("in a loop, i = " + i);
                bos.write(buffer, 0, i);
                i = bis.read(buffer);

            }
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestIOStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestIOStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bis.close();
                bos.close();
                fis.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(TestIOStream.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
