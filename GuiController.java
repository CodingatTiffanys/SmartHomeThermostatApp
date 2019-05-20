import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class GuiController implements Initializable{

    @FXML
    private String currentInsideTemperature = "72.0";
    @FXML
    private String currentInsideRelativeHumidity = "80.0";
    @FXML
    private String currentSettingTemp = "72.0";
    @FXML
    private TextField currentSetting;
    @FXML
    private Button upButtonClicked;
    @FXML
    private Button downButtonClicked;
    @FXML
    public TextField timeofDay;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initClock();
    }


//
//    public void currentInsideTemperature(){
//        this.currentInsideTemperature = currentInsideTemperature;
//    }
//
//    public void currentInsideRelativeHumidity(){
//        this.currentInsideRelativeHumidity = currentInsideRelativeHumidity;
//    }



//    public double fahrenheitRadioButtonChecked(){
//        return ((double)5/9*(currentSettingTemp-32.0));
//    }
//
//    public double celciusRadioButtonChecked(){
//        return ((double)(9/5)*(currentSettingTemp+32.0));
//    }


    public void fanButtonClicked(){
        System.out.println("Fan was turned on.");
        }

    public void autoButtonClicked(){
        System.out.println("Auto was turned on.");
    }

    public void systemButtonClicked(){
        System.out.println("System activated.");
    }

    public void coolButtonClicked(){
        System.out.println("Cool was turned on.");
    }
    //Open other fxml when the program button is clicked
    @FXML
    public void programButtonClicked(javafx.event.ActionEvent event) throws IOException{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();

            String fxmlDocPath = "/Users/tiffanypena/Desktop/ProgThermo/src/main/java/ProgramScreen.fxml";

            FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

            // Create the Pane and all Details
            AnchorPane root = (AnchorPane) fxmlLoader.load(fxmlStream);

            Stage stage = new Stage();

            // Create the Scene
            Scene scene = new Scene(root);
            // Set the Scene to the Stage
            stage.setScene(scene);

            // Display the Stage
            stage.show();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        }

        //create time in the current time text field
    @FXML
    private void initClock(){
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e ->{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
            timeofDay.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();

    }

     //method change the temp when up and down buttons are clicked
    public void changeTemp(javafx.event.ActionEvent event) {

        //change temp to double from string
        double temp = Double.parseDouble(currentSettingTemp);
        //if the up button is clicked and the temp is currently less than max increment the temp by 1
        //& set the text to the new temp
        if(event.getSource() == upButtonClicked && temp < 90) {
            temp++;
            currentSettingTemp = String.valueOf(temp);
            currentSetting.setText(currentSettingTemp);
        }
        //if the down button is clicked and the temp is currently more than min decrease the temp by 1
        //& set the text to the new temp
        else if (event.getSource() == downButtonClicked && temp > 50) {
            temp--;
            currentSettingTemp = String.valueOf(temp);
            currentSetting.setText(currentSettingTemp);
        }
    }
}





