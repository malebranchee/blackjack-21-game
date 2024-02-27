package com.example.oop_lab1.SocketConnections;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;




public class Server {
    private  ServerSocket server;
    private  Socket clientSocket;


    public void start() throws Exception{
            server = new ServerSocket(8080);
            clientSocket = server.accept();
            System.out.println("Connected");

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String greeting = in.readLine();

            if ("hello server".equals(greeting)) {
                out.println("hello client");
            }
            else {
                out.println("unrecognised greeting");
            }

    }

    public static void main(String[] args) throws IOException{

    }
}
