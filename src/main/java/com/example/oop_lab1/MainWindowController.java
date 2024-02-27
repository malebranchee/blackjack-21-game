package com.example.oop_lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MainWindowController extends Application {
    private static Stage MainMenu;

    public Stage getMenuStage()
    {
        return this.MainMenu;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainWindowController.class.getResource("MainWindow.fxml"));
        Scene scene = new Scene(loader.load());
        this.MainMenu = primaryStage;
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}