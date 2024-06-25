package com.example.biblioteca.controlador;

import java.io.IOException;

import com.example.biblioteca.App;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class telaAddController {
    
    @FXML
    private TextField addAssunto;

    @FXML
    private TextField addAutor;

    @FXML
    private DatePicker addDataLancamento;

    @FXML
    private TextField addEstoque;

    @FXML
    private TextField addTitutlo;

    @FXML
    private Button confirmarButton;

    @FXML
    private void voltar() throws IOException {
        App.trocarLayout("tFunctions.fxml"); // Voltar para a tela de funções
    }
}
