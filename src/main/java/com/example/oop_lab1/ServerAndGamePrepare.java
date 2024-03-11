package com.example.oop_lab1;


import com.example.oop_lab1.SocketConnections.Client;
import com.example.oop_lab1.SocketConnections.Server;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ServerAndGamePrepare extends MainWindowController{


    private static Server server = new Server();
    protected Server getCurrentServer() { return server; }

    protected Client getCurrentClient() { return client; }

    private static Client client = new Client();

    private static GameWindow gameWindow = new GameWindow();

    private static RulesWindow rulesWindow = new RulesWindow();


    private static IntegerProperty user_coins = new SimpleIntegerProperty(30);

    private static Thread serverThread = new Thread(server);

    private static Thread clientThread = new Thread(client);

    private static Thread gameWindowThread = new Thread(gameWindow);

    private static Thread rulesWindowThread = new Thread(rulesWindow);


    public static Thread getServerThread(){ return serverThread; }

    public static Thread getClientThread(){ return clientThread; }

    public static Thread getGameWindowThread() { return gameWindowThread; }

    public static Thread getRulesWindowThread() { return rulesWindowThread; }

private static class GameWindow  implements Runnable {
        @FXML
    @Override
    public void run() {
        try {
            // Main playing scene
            Game.gameWindow = new Stage();
            FXMLLoader loader = new FXMLLoader(ServerAndGamePrepare.class.getResource("PlayWindow.fxml"));
            Pane page = loader.load();
            Game.gameWindow.setTitle("Black Jack 21");
            Game.gameWindow.setScene(new Scene(page));
            Game.gameWindow.show();
            Game.mainMenuWindow.close();
        } catch (Exception e) {
            e.printStackTrace();
            }
        }
    }

    private static class RulesWindow implements Runnable{
        @FXML
        @Override
        public void run(){
            try {
                // Game confirming window
                FXMLLoader loader = new FXMLLoader(ServerAndGamePrepare.class.getResource("GameConfirm.fxml"));
                Scene gameConfirming = new Scene(loader.load());
                Game.gameConfirmingWindow = new Stage();
                Game.gameConfirmingWindow.setScene(gameConfirming);
                Game.gameConfirmingWindow.show();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}