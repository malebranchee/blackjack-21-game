package com.example.oop_lab1.SocketConnections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;



public class Client implements Runnable{
    private static Socket socket;
    @Override
    public void run(){
        try {
            socket = new Socket("localhost", 8333);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            System.out.println("Connection...");
            while (socket.isConnected()) {
                System.out.println(socket.getTrafficClass());
                    System.out.println("Connected!");
                    out.println("hello server");
            }

            System.out.println(in.readLine());
        } catch (Exception e){
            e.printStackTrace();
        }
    }



}
