package Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    Double temp = 0.0, sum = 0.0;
    boolean isOperatorPressed;
    String operatorPressed = "";

    @FXML
    TextField outputTF;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        outputTF.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*([\\.]\\d*)?")) {
                outputTF.setText(oldValue);
            }
        });
    }

    @FXML
    private void onNumberClick(ActionEvent event) {
        if(event.getSource() instanceof Button) {
            Button button = (Button)event.getSource();
            if(isOperatorPressed) {
                outputTF.setText(button.getText().trim());
            } else {
                outputTF.setText(outputTF.getText().trim() + button.getText().trim());
            }
            isOperatorPressed = false;
        }
    }

    @FXML
    private void onOperatorClick(ActionEvent event) {
        if(event.getSource() instanceof Button) {
            Button button = (Button)event.getSource();
            if (!outputTF.getText().isEmpty()) {
                temp = Double.valueOf(outputTF.getText());
                if (button.getText().equals("%")) {
                    temp = sum * temp / 100;
                }
                switch (operatorPressed) {
                    case "/":
                        sum /= temp;
                        break;
                    case "X":
                        sum *= temp;
                        break;
                    case "+":
                        sum += temp;
                        break;
                    case "-":
                        sum -= temp;
                        break;
                    default:
                        sum = temp;
                }
            }

            if (button.getText().equals("=") || button.getText().equals("%")) {
                outputTF.setText(String.valueOf(sum));
                operatorPressed = "";
            } else {
                outputTF.setText("");
                operatorPressed = button.getText().trim();
            }
            isOperatorPressed = true;
        }
    }

    @FXML
    private void onDELClick(ActionEvent event) {
        if(outputTF.getText().length() > 0) {
            outputTF.setText(outputTF.getText(0, outputTF.getText().length() - 1));
        }
    }

    @FXML
    private void onCEClick(ActionEvent event) {
        outputTF.setText("");
        temp = 0.0;
        sum = 0.0;
        isOperatorPressed = false;
        operatorPressed = "";
    }
}