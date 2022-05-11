/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class TimeClass implements Runnable {

    public void prinTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        while (true) {
            try {
                Date d = new Date();
                System.out.println(sdf.format(d));
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                Logger.getLogger(TimeClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {
        prinTime();
    }

}
