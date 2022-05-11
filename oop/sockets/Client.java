/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.sockets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class Client {

    public static void main(String[] args) {
        try {
            // 1-
            // Create a Connection to the Server
            Socket socket = new Socket("localhost", 7075);
            while (true) {
            // 2- 
                //Send the message to the server
                OutputStreamWriter writeToServer = new OutputStreamWriter(socket.getOutputStream());
                BufferedWriter bw = new BufferedWriter(writeToServer);

                Scanner input = new Scanner(System.in);

                String msg = input.nextLine();

                msg = msg + "\n";
                bw.write(msg);
                bw.flush();

            // 3- 
                //Get the return message from the server
                InputStreamReader readFromServer = new InputStreamReader(socket.getInputStream());
                BufferedReader br = new BufferedReader(readFromServer);
                String message = br.readLine();
                System.out.println("Server : " + message);
            }
                    // 4- 
            // Close Socket Connection
            //  socket.close();

        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
