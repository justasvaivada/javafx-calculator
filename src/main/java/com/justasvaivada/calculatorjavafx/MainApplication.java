package com.justasvaivada.calculatorjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        Initialise FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("calculator.fxml"));
//        Create new scene object
        Scene scene = new Scene(fxmlLoader.load(), 420, 600);
        stage.setTitle("Calculator-JavaFX");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

//    Start Application
    public static void main(String[] args) {
        launch();
    }
}