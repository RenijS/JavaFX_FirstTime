package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    int count = 0;

    @Override
    public void start(Stage primaryStage){


        Label label = new Label("Button pressed: 0");

        Button button = new Button("Press the button");

        button.setOnAction(e -> {
            count++;
            label.setText("Button pressed: " + count);
        });

        VBox root = new VBox(label,button);
        Scene scene = new Scene(root, 600, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle(getClass().getName());
        primaryStage.show();

        label.setStyle("-fx-font-size: 24; -fx-text-fill: blue");
        button.setStyle("-fx-font-size: 30;");
        root.setStyle("-fx-alignment: center; -fx-spacing: 20;");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
