import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.springframework.util.SocketUtils;

import java.net.URL;
import java.util.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;


public class ProgramScreen implements Initializable{



        @FXML
        private URL location;

        @FXML
        private ResourceBundle resources;

    @FXML
    private ComboBox timeofday;
    @FXML
    private ComboBox ampm;

    @FXML
        private void initialize(){

        }

        @FXML
        private TextField currentSetting;

        @FXML
        private String currentSettingTemp = "72.0";

        @FXML
        private Button upButtonClicked;

        @FXML
        private Button downButtonClicked;

        @FXML
        private DatePicker dayoftheWk;

        @FXML
        private Button saveButton;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timeofday.getItems().removeAll(timeofday.getItems());
        timeofday.getItems().addAll("1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00");
        timeofday.getSelectionModel().select("1:00");

        ampm.getItems().removeAll(ampm.getItems());
        ampm.getItems().addAll("AM", "PM");
        ampm.getSelectionModel().select("AM");
    }

        @FXML
        //method change the temp when up and down buttons are clicked
        public void changeTemp(ActionEvent event) {

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



        @FXML
        public void save(ActionEvent event){

        System.out.println(dayoftheWk.getValue());
        System.out.print(timeofday.getValue());
        System.out.println(ampm.getValue());
        System.out.println(currentSettingTemp);
    }


    }

