package ni.edu.uam.practicaapikey;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("clientes-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Consulta de clientes - API REST (Supabase)");
        stage.setScene(scene);
        stage.show();
    }
}
