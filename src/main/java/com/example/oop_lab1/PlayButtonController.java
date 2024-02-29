package com.example.oop_lab1;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PlayButtonController extends MainWindowController{
    public static TextArea log = new TextArea();
    @FXML
    protected void playButton() throws Exception{
            Stage primaryWindow = new Stage();
            FXMLLoader loader = new FXMLLoader(PlayButtonController.class.getResource("PlayWindow.fxml"));
            Pane page = loader.load();

            primaryWindow.setTitle("Black Jack 21");
            primaryWindow.setScene(new Scene(page));
            primaryWindow.show();
            MainWindowController.closeMenuStage();

    }




}