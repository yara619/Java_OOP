package TargetHeartRate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TarHeartRateController {

    @FXML private Label ageLabel;
    @FXML private Label maximumLabel;
    @FXML private Label targetHeartLabel;
    @FXML private Button calcButton;
    @FXML private TextField ageTextField;
    @FXML private TextField maximumTextField;
    @FXML private TextField targetTextField;

    @FXML
    void OnClick(ActionEvent event) {
        try {
            double age = Integer.parseInt(ageTextField.getText());
            double maxHeartRate = 220 - age;
            double upperRange = maxHeartRate * 0.85;
            double lowerRange = maxHeartRate * 0.5;

            String result = "";
            maximumTextField.setText(String.valueOf(maxHeartRate));
            targetTextField.setText(lowerRange+" - "+upperRange);
        }
        catch (NumberFormatException e){
            ageTextField.setText("Enter Age Correctly!");
        }

    }

}
