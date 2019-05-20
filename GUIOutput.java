import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class GUIOutput extends Application {



        @Override
        public void start(Stage stage) throws IOException
        {
            // Create the FXMLLoader
            FXMLLoader loader = new FXMLLoader();
            // Path to the FXML File
            String fxmlDocPath = "/Users/tiffanypena/Desktop/ProgThermo/src/main/java/Gui.fxml";
            FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

            // Create the Pane and all Details
            AnchorPane root = (AnchorPane) loader.load(fxmlStream);

            // Create the Scene
            Scene scene = new Scene(root);
            // Set the Scene to the Stage
            stage.setScene(scene);
            // Set the Title to the Stage
            stage.setTitle("A SceneBuilder Example");
            // Display the Stage
            stage.show();
        }
    public static void main(String[] args)
    {
        Application.launch(args);
    }
    }




