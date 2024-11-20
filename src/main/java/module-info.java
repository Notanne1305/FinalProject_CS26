module org.example.softy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.softy to javafx.fxml;
    exports org.example.softy;
}