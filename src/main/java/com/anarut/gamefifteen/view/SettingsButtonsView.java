package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SettingsButtonsView {
    private Stage stage;

    public SettingsButtonsView(Stage stage) {
        this.stage = stage;
    }

    public void show() {

        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20.0, 20.0, 20.0, 20.0));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.BROWN));


        Button smallButton = new GameMenuButton();
        smallButton.setText("SMALL");
        smallButton.setPrefWidth(240);
        smallButton.setOnAction(e -> {
            new GameMenuButton(GameMenuButton.SMALL_SCREEN);
            new SettingsButtonsView(stage).show();
        });
        vBox.getChildren().add(smallButton);


        Button mediumButton = new GameMenuButton();
        smallButton.setText("MEDIUM");
        smallButton.setPrefWidth(240);
        smallButton.setOnAction(e -> {
            new GameMenuButton(GameMenuButton.MEDIUM_SCREEN);
            new SettingsButtonsView(stage).show();
        });
        vBox.getChildren().add(mediumButton);


        Button largeButton = new GameMenuButton();
        smallButton.setText("LARGE");
        smallButton.setPrefWidth(240);
        smallButton.setOnAction(e -> {
            new GameMenuButton(GameMenuButton.LARGE_SCREEN);
            new SettingsButtonsView(stage).show();

        });
        vBox.getChildren().add(largeButton);


        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        stage.setScene(scene);
    }
}
