package com.example.biblioteca.controlador;

import java.io.IOException;

import com.example.biblioteca.App;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
        else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro de Login");
            alert.setHeaderText("Usuário ou senha incorretos");
            alert.setContentText("Por favor, verifique seu usuário e senha e tente novamente.");

            alert.showAndWait();
        }
    }
}