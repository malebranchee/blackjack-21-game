package com.example.oop_lab1;

import com.example.oop_lab1.SocketConnections.Client;
import com.example.oop_lab1.SocketConnections.Server;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.SecureRandom;

public class GameController extends Thread {

    public void start(Stage stage) throws Exception{
    }

    public static void main(String[] args) throws IOException{
        (new GameController()).start();
    }
}

