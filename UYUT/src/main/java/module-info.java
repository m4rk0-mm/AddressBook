module com.example.uyut {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uyut to javafx.fxml;
    exports com.example.uyut;
}