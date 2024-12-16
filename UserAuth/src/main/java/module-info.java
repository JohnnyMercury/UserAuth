module com.userauth {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.userauth to javafx.fxml;
    exports com.userauth;
}