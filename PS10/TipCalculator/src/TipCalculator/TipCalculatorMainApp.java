package TipCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class TipCalculatorMainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TipCalculator.fxml")));
        Scene scene=new Scene(root);
        primaryStage.setTitle("Tip Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}