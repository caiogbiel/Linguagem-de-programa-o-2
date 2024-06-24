package com.example.biblioteca.controlador;

import java.io.IOException;

import com.example.biblioteca.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class telaFuncoesController {
    @FXML
    private Button tAdd;

    @FXML
    private Button tDevolution;

    @FXML
    private Button tEmpre;

    @FXML
    private Button tListBooks;

    @FXML
    private Button tListEmpre;

    @FXML
    private Button tRemove;

    @FXML
    private Button tSearchBook;

    @FXML
    private Button tSearchUser;

    @FXML
    private Button tSair;

    @FXML
    private void fecharJanela(ActionEvent event) {
        Stage stage = (Stage) tSair.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void telaAdd() throws IOException {
        App.trocarLayout("tAddBook.fxml");
    }
}