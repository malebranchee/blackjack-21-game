package com.example.oop_lab1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayButtonController extends MainWindowController {

    @FXML
    protected void playButton() {
        try {
            Stage primaryWindow = new Stage();
            FXMLLoader loader = new FXMLLoader(PlayButtonController.class.getResource("PlayWindow.fxml"));
            Pane page = loader.load();
            primaryWindow.setTitle("Black Jack 21");
            primaryWindow.setScene(new Scene(page));
            primaryWindow.show();
            getMenuStage().close(); // Closing of main menu stage
        } catch (IOException e) {
            System.out.println("Got an exception: " + e.getMessage());
        }
    }

}