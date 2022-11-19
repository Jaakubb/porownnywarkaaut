module com.example.poraut {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.poraut to javafx.fxml;
    exports com.example.poraut;
}