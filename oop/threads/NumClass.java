/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
// extends Thread
public class NumClass implements Runnable {

    public void printNumbers() {
        for (int i = 1; i < 1000; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(NumClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {
        printNumbers();
    }

}
