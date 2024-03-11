package com.example.oop_lab1;


import javafx.application.Platform;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;


// Game logics
public class Game {



    // dealer card field
    private ArrayList<Integer> dealerField = new ArrayList<>(1);

    // user card field
    private ArrayList<Integer> playerField = new ArrayList<>(1);

    // all deck
    private ArrayList<Integer> deck = new ArrayList<>(36);

    private final SimpleIntegerProperty user_coins = new SimpleIntegerProperty(30);

    protected static Stage gameConfirmingWindow;

    protected static Stage gameWindow;

    protected static Stage mainMenuWindow;



    @FXML
    public void playButton() throws IOException{
        ServerAndGamePrepare.getServerThread().start();
        ServerAndGamePrepare.getClientThread().start();
        Platform.runLater(ServerAndGamePrepare.getGameWindowThread());
        gameStart();

    }

    @FXML
    private void gameStart() throws IOException {

    }

    public void mainMenuExit(){
        gameConfirmingWindow.close();
        Game.gameWindow.close();
        Game.mainMenuWindow.show();
    }
}

