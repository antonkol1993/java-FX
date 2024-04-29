package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.GameboardBackEnd.GameBoard;
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

public class MainMenuView {

    private Stage stage;


    public MainMenuView(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20.0, 20.0, 20.0, 20.0));
        vBox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label();
        titleLabel.setText("Game 15");
        vBox.getChildren().add(titleLabel);


        Button newGameButton = new Button();
        newGameButton.setText("New Game");
        newGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        newGameButton.setOnAction(actionEvent -> new GameBoardSettingsView(stage).show());
        vBox.getChildren().add(newGameButton);

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Game File");

        Button loadGameButton = new Button();
        loadGameButton.setDisable(true);
        loadGameButton.setText("Load Game");
        loadGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        loadGameButton.setOnAction(actionEvent -> {
            File file = fileChooser.showOpenDialog(stage);
            System.out.println(file.getAbsolutePath());
            System.exit(0);
        });

        vBox.getChildren().add(loadGameButton);

        Button exitGameButton = new Button();
        exitGameButton.setText("Exit Game");
        exitGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        exitGameButton.setOnAction(actionEvent -> Platform.exit());
        vBox.getChildren().add(exitGameButton);

        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        return scene;
    }
}
