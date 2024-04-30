package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class WinReturnMainMenu {

    private Stage stage;


    public WinReturnMainMenu(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {

        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20.0, 20.0, 20.0, 20.0));
        vBox.setAlignment(Pos.CENTER);

        Button youWinButton = new Button("You Win!!!");
        youWinButton.setPrefSize(350,100);
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
