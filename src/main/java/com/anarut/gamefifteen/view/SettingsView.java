package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.button.settings.ButtonService;
import com.anarut.gamefifteen.button.settings.ButtonsSizes;
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
    private ButtonsSizes buttonsSizes;
    private ButtonService buttonService;

    public SettingsView(Stage stage) {
        this.stage = stage;
    }


    private void stageSizes() {
        stage.setMinWidth((double) (420 * (buttonsSizes.getDefaultSize()) / 10));
        stage.setMinHeight(340 * ((double) (buttonsSizes.getDefaultSize()) / 10));
        stage.setMaxWidth(840 * ((double) (buttonsSizes.getDefaultSize()) / 10));
        stage.setMaxHeight(680 * ((double) (buttonsSizes.getDefaultSize()) / 10));
        stage.setWidth(520 * ((double) (buttonsSizes.getDefaultSize()) / 10));
        stage.setHeight(440 * ((double) (buttonsSizes.getDefaultSize()) / 10));
    }

    public void show() {
        if (buttonsSizes == null) {
            buttonsSizes = new ButtonsSizes();
        }
        if (buttonService == null) {
            buttonService = new ButtonService();
        }

        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(30.0, 30.0, 30.0, 30.0));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.BROWN));


        GameMenuButton smallButton = new GameMenuButton();
        smallButton.setFont(Font.font(buttonsSizes.getDefaultSize()));
        smallButton.setText("SMALL");

        smallButton.setOnAction(e -> {
            buttonService.getButtonSmallSize();
            stageSizes();
            new SettingsView(stage).show();


        });
        vBox.getChildren().add(smallButton);


        GameMenuButton mediumButton = new GameMenuButton();
        mediumButton.setText("MEDIUM");

        mediumButton.setOnAction(e -> {
            buttonService.getButtonMediumSize();
            stageSizes();
            new SettingsView(stage).show();
        });
        vBox.getChildren().add(mediumButton);


        GameMenuButton largeButton = new GameMenuButton();
        largeButton.setText("LARGE");

        largeButton.setOnAction(e -> {
            buttonService.getButtonLargeSize();
            stageSizes();
            new SettingsView(stage).show();
        });
        vBox.getChildren().add(largeButton);

        Button backButton = new GameMenuButton();
        backButton.setText("BACK");
        backButton.setPrefWidth(backButton.getPrefWidth() / 1.5);

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
