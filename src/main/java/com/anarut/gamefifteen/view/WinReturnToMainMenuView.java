package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.button.settings.GameMenuButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class WinReturnToMainMenuView {

    private Stage stage;


    public WinReturnToMainMenuView(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {

        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20.0, 20.0, 20.0, 20.0));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.AQUAMARINE));

        Button youWinButton = new GameMenuButton();
        youWinButton.setText("You Win!!!");
        youWinButton.setPrefSize(350, 100);
        vBox.getChildren().add(youWinButton);

        youWinButton.setOnAction(e -> {
            Scene scene = new MainMenuView(stage).getScene();
            stage.setScene(scene);
            stage.show();
            vBox.getChildren().remove(youWinButton);
        });
        return new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
    }

}
