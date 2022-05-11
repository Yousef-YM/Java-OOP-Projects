/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.threads;

/**
 *
 * @author CC-Student
 */
public class TestThreads {

    public static void main(String[] args) {
        NumClass nth = new NumClass();
        TimeClass tth = new TimeClass();

        Thread numberThread = new Thread(nth);
        Thread timeThread = new Thread(tth);

        numberThread.start();
        timeThread.start();

    }
}
