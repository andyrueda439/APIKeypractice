module ni.edu.uam.practicaapikey {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;

    opens ni.edu.uam.practicaapikey to javafx.fxml;
    opens ni.edu.uam.practicaapikey.controller to javafx.fxml;
    opens ni.edu.uam.practicaapikey.model to javafx.base;

    exports ni.edu.uam.practicaapikey;
}