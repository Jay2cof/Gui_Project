module com.example.guinewproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guinewproject to javafx.fxml;
    exports com.example.guinewproject;
}