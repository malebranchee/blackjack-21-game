package com.example.oop_lab1;


import com.example.oop_lab1.SocketConnections.Client;
import com.example.oop_lab1.SocketConnections.Server;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ServerAndGamePrepare extends MainWindowController{


    private static Server server = new Server();
    protected Server getCurrentServer() { return server; }
    protected Client getCurrentClient() { return client; }
    private static Client client = new Client();
    private static GameWindow window = new GameWindow();

    private Thread serverThread = new Thread(server);
    private Thread clientThread = new Thread(client);
    private Thread gameWindowThread = new Thread(window);
    @FXML
    protected void playButton() throws Exception{
        serverThread.start();
        clientThread.start();
        Platform.runLater(gameWindowThread);
    }




private static class GameWindow  implements Runnable {
        @FXML
    @Override
    public void run() {
        try {
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
}