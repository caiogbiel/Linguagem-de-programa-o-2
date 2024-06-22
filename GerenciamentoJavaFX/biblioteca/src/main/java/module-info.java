module com.example.biblioteca {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.biblioteca to javafx.fxml;
    exports com.example.biblioteca;
    exports com.example.biblioteca.controlador;
    opens com.example.biblioteca.controlador to javafx.fxml;
}