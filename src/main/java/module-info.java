module org.example.devices {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.devices to javafx.fxml;
    exports org.example.devices;
}