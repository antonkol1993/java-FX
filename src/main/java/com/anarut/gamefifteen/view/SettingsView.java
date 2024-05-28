package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.button.settings.ButtonsSizes;
import com.anarut.gamefifteen.button.settings.GameMenuButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SettingsView {
    private Stage stage;

    public SettingsView(Stage stage) {
        this.stage = stage;
    }


    private void stageSizes() {
        stage.setMinWidth((double) (420 * (ButtonsSizes.getInstance().getSizeButton()) / 10));
        stage.setMinHeight(340 * ((double) (ButtonsSizes.getInstance().getSizeButton()) / 10));
        stage.setMaxWidth(840 * ((double) (ButtonsSizes.getInstance().getSizeButton()) / 10));
        stage.setMaxHeight(680 * ((double) (ButtonsSizes.getInstance().getSizeButton()) / 10));
        stage.setWidth(520 * ((double) (ButtonsSizes.getInstance().getSizeButton()) / 10));
        stage.setHeight(440 * ((double) (ButtonsSizes.getInstance().getSizeButton()) / 10));
    }

    public void show() {


        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(30.0, 30.0, 30.0, 30.0));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.BROWN));


        GameMenuButton smallButton = new GameMenuButton();
        smallButton.setText("SMALL");

        smallButton.setOnAction(e -> {
            ButtonsSizes.getInstance().getSmallButton();
            stageSizes();
            new SettingsView(stage).show();


        });
        vBox.getChildren().add(smallButton);


        GameMenuButton mediumButton = new GameMenuButton();
        mediumButton.setText("MEDIUM");

        mediumButton.setOnAction(e -> {
            ButtonsSizes.getInstance().getMediumButton();
            stageSizes();
            new SettingsView(stage).show();
        });
        vBox.getChildren().add(mediumButton);


        GameMenuButton largeButton = new GameMenuButton();
        largeButton.setText("LARGE");

        largeButton.setOnAction(e -> {
            ButtonsSizes.getInstance().getLargeButton();
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
