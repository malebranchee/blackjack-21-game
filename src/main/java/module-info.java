module com.example.oop_lab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_lab1 to javafx.fxml;
    exports com.example.oop_lab1;
}