package com.example.oop_lab1.SocketConnections;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;




public class Server implements Runnable {
    private static ServerSocket server;
    public static boolean isConnected = false;
    private static Socket clientSocket;


    @Override
    public void run() {
        try {
            server = new ServerSocket(8333);
            clientSocket = server.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));



                String greeting = in.readLine();

                if ("hello server".equals(greeting)) {
                    isConnected = true;
                    out.println("hello client");
                    System.out.println(greeting);
                } else {
                    out.println("unrecognised greeting");
                }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}