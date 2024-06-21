module teste.login {
    requires javafx.controls;
    requires javafx.fxml;

    opens teste.login to javafx.fxml;
    exports teste.login;
}
