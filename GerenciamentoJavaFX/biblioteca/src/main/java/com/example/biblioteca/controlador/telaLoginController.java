package com.example.biblioteca.controlador;

import com.example.biblioteca.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class telaLoginController {

        @FXML
        private Button tClose;

        @FXML
        private Button tEnter;

        @FXML
        private PasswordField tSenha;

        @FXML
        private TextField tUser;

    @FXML
    private void trocarTela() throws IOException {
        if(tUser.getText().equalsIgnoreCase("admin") && tSenha.getText().equalsIgnoreCase("admin123")) {
            App.trocarLayout("tFunctions.fxml");
        }
    }
}