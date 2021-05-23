package TipCalculator;

        import javafx.beans.value.ChangeListener;
        import javafx.beans.value.ObservableValue;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.Slider;
        import javafx.scene.control.TextField;

        import java.math.BigDecimal;
        import java.math.RoundingMode;
        import java.text.NumberFormat;


public class TipCalculatorController {
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentage = NumberFormat.getPercentInstance();
    private BigDecimal tipPercentValue = new BigDecimal ("0.15");

    @FXML private Label tipPercentageLabel;
    @FXML private TextField amountTextField;
    @FXML private TextField tipTextField;
    @FXML private TextField totalTextField;
    @FXML private Slider tipPercentageSlider;
    @FXML private Button calculateButton;

    @FXML
    void CalculateButtonPressed(ActionEvent event) {
        try{
            BigDecimal amount = new BigDecimal(amountTextField.getText());
            BigDecimal tip = amount.multiply(tipPercentValue);
            BigDecimal total = amount.add(tip);

            tipTextField.setText(currency.format(tip));
            totalTextField.setText(currency.format(total));
        }
        catch (NumberFormatException ex){
            amountTextField.setText("Enter Amount");
            amountTextField.selectAll();
            amountTextField.requestFocus();
        }
    }

    public void initialize(){
        currency.setRoundingMode(RoundingMode.HALF_UP);

        tipPercentageSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                        tipPercentValue = BigDecimal.valueOf(newValue.intValue()/100.0);
                        tipPercentageLabel.setText(percentage.format(tipPercentValue));
                    }
                }
        );
    }

}
