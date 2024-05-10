package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.button.settings.ButtonSettings;
import com.anarut.gamefifteen.button.settings.GameMenuButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SettingsView {
    private Stage stage;
     private GameMenuButton screenSize;
    private ButtonSettings buttonSettings;
    public SettingsView(Stage stage) {
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
            ButtonSettings.size = 8;
            new GameMenuButton().setFont(Font.font(ButtonSettings.size));
                stage.setMinWidth(320 / 1.5);
                stage.setMinHeight(240/ 1.5);
                stage.setMaxWidth(640/ 1.5);
                stage.setMaxHeight(480 / 1.5);
                stage.setWidth(320 / 1.2);
                stage.setHeight(240 / 1.2);

                new SettingsView(stage).show();

        });
        vBox.getChildren().add(smallButton);


        Button mediumButton = new GameMenuButton();
        mediumButton.setText("MEDIUM");
        mediumButton.setPrefWidth(240);
        mediumButton.setOnAction(e -> {
            ButtonSettings.size = 16;
            new GameMenuButton().setFont(Font.font(ButtonSettings.size));
//            new GameMenuButton().setFont(Font.font(16));
                stage.setMinWidth(320);
                stage.setMinHeight(240);
                stage.setMaxWidth(640);
                stage.setMaxHeight(480);
            stage.setWidth(420 );
            stage.setHeight(340);

            new SettingsView(stage).show();
        });
        vBox.getChildren().add(mediumButton);


        Button largeButton = new GameMenuButton();
        largeButton.setText("LARGE");
        largeButton.setPrefWidth(240);
        largeButton.setOnAction(e -> {
            ButtonSettings.size = 24;
            new GameMenuButton().setFont(Font.font(ButtonSettings.size));
//            new GameMenuButton().setFont(Font.font(24));
                stage.setMinWidth(320 * 1.5);
                stage.setMinHeight(240 * 1.5);
                stage.setMaxWidth(640 * 1.5);
                stage.setMaxHeight(480 * 1.5);
                stage.setWidth(640 * 1.5);
                stage.setHeight(480 * 1.5);



            new SettingsView(stage).show();

        });
        vBox.getChildren().add(largeButton);

        Button backButton = new GameMenuButton();
        backButton.setText("BACK");
        backButton.setPrefWidth(240);
        backButton.setOnAction(e -> {
            Scene scene = new MainMenuView(stage).getScene();
            stage.setScene(scene);
            stage.show();
        });
        vBox.getChildren().add(backButton);

        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        stage.setScene(scene);

    }
}