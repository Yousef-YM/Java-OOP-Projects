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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class Server {

    public static void main(String[] args) {
        try {
            // 1
            ServerSocket serverSocket = new ServerSocket(7075);
            System.out.println("Server Started and listening to the port 7075");

            //2 
            Socket socket = serverSocket.accept();
            while (true) {
                // 3
                InputStreamReader readFromClient = new InputStreamReader(socket.getInputStream());
                BufferedReader br = new BufferedReader(readFromClient);

                String message = br.readLine();
                System.out.println("Client : " + message);

                //4 
                OutputStreamWriter writeToClient = new OutputStreamWriter(socket.getOutputStream());
                BufferedWriter bw = new BufferedWriter(writeToClient);

                Scanner input = new Scanner(System.in);

                String returnMessage = input.nextLine();
                returnMessage = returnMessage + "\n";

                bw.write(returnMessage);
                // System.out.println("Server :  "+returnMessage);
                bw.flush();
            }
            // 5-
            //  socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
