module org.example.caso2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.caso2 to javafx.fxml;
    exports org.example.caso2;
}