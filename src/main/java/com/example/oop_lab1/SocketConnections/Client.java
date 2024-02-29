package com.example.oop_lab1.SocketConnections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;



public class Client {
    private static Socket socket;

    public static void main(String[] args) throws Exception{
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            socket = new Socket("localhost", 8333);
            System.out.println("Connection...");
            if (socket.isConnected()){
                System.out.println("Connected!");
                out.println("hello server");
            }

            System.out.println(in.readLine());

    }
}
