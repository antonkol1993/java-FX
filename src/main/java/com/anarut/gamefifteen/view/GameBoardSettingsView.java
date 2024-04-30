package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.Game15Application;
import com.anarut.gamefifteen.GameboardBackEnd.GameBoard;
import com.anarut.gamefifteen.GameboardBackEnd.GameBoardService;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class GameBoardSettingsView {

    private Stage stage;

    public GameBoardSettingsView(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20.0, 20.0, 20.0, 20.0));
        vBox.setAlignment(Pos.CENTER);

        List<Integer> boardSizes = List.of(2, 3, 4, 5, 6);


        for (int size : boardSizes) {

            Button startGameButton = new Button();
            startGameButton.setText("%d x %d".formatted(size, size));
            startGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
            startGameButton.setOnAction(e -> {
                GameBoardService gameBoardService = new GameBoardService();
                GameBoard gameBoard = gameBoardService.newGame(size);
                //todo for check to "WIN" method
//                GameBoard gameBoard = gameBoardService.newGameNotRandom(size);
                new GameBoardView(stage, size, gameBoardService, gameBoard).show();
            });
            vBox.getChildren().add(startGameButton);
        }

        Button backButton = new Button();
        backButton.setText("Back");
        backButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        vBox.getChildren().add(backButton);
        backButton.setOnAction(e -> {
            Scene scene = new MainMenuView(stage).getScene();
            stage.setScene(scene);
            stage.show();

        });

        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        stage.setScene(scene);
    }
}
