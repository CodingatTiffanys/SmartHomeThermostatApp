import javafx.fxml.FXML;

import java.awt.*;

public class Gui {

    @FXML
    private double currentSettingTemp;


    @FXML
    private TextField currentTempTextArea;

    @FXML
    private TextField currentInsideRelativeHumidityTextArea;

    @FXML
    private TextField currentSettingTempTextArea;

    @FXML
    private double currentInsideTemperature=72.0;


    @FXML
    private double currentInsideRelativeHumidity=80.0;

    public Gui(double currentSettingTemp) {
        this.currentSettingTemp = currentSettingTemp;
    }


    public double getCurrentSettingTemp() {
        return currentSettingTemp;
    }

    public void setCurrentSettingTemp(double currentSettingTemp) {
        this.currentSettingTemp = currentSettingTemp;
    }

    public double getCurrentInsideTemperature() {
        return currentInsideTemperature;
    }

    public void setCurrentInsideTemperature(double currentInsideTemperature) {
        this.currentInsideTemperature = currentInsideTemperature;
    }

    public double getCurrentInsideRelativeHumidity() {
        return currentInsideRelativeHumidity;
    }

    public void setCurrentInsideRelativeHumidity(double currentInsideRelativeHumidity) {
        this.currentInsideRelativeHumidity = currentInsideRelativeHumidity;
    }


// GuiController temp = new GuiController();

//        private double defaultTemp=0.0;
//
//        public double getTempInFarenheit(double celcius);
//        public double getTempInCelcius(double farenheit);
//        public double getCurrentTemp();
//        public double setDefaultTemp(double defaultCelcius);
//
//
//    @Override
//    public double getTempInFarenheit(double celcius) {
//        return ((double)(9/5)*(celcius+32.0));
//    }
//
//
//    @Override
//    public double getTempInCelcius(double farenheit) {
//        return ((double)5/9*(farenheit-32.0));
//    }
//
//
//    @Override
//    public double getCurrentTemp() {
//        return currentTemp;
//    }
//
//    @Override
//    public double setDefaultTemp(double defaultCelcius){
//        return this.defaultTemp = defaultCelcius;
//    }
//
//    private double currentTemp;
//    private static int MAX = 90;
//    private static int MIN = 50;
//
//
//    public int limit(int a) {
//        return (a > MAX) ? MAX : (a < MIN ? MIN : a);
//    }
//
//
//    public static void main(String[] args) {
//
//
//
//    }}

}