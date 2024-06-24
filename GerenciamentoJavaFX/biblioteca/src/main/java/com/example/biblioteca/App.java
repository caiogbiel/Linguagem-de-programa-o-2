package com.example.biblioteca;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tLogin.fxml"));
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void trocarLayout(String tela2) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource(tela2));
        scene.setRoot(root);
    }

    public static void main(String[] args) {
        launch();
    }
}