package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.button.settings.GameMenuButton;
import com.anarut.gamefifteen.gameboard.back.end.GameBoard;
import com.anarut.gamefifteen.gameboard.back.end.GameBoardService;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class GameBoardSettingsView {

    //    private final GameBoardService gameBoardService;
    private Stage stage;

    public GameBoardSettingsView(Stage stage) {
        this.stage = stage;
    }

    public void show() {


        VBox vBox1 = new VBox();
        vBox1.setSpacing(20);
        vBox1.setPadding(new Insets(20.0, 20.0, 20.0, 20.0));
        vBox1.setAlignment(Pos.CENTER);
        vBox1.setBackground(Background.fill(Color.ALICEBLUE));

        VBox vBox2 = new VBox();
        vBox2.setSpacing(20);
        vBox2.setPadding(new Insets(20.0, 20.0, 20.0, 20.0));
        vBox2.setAlignment(Pos.CENTER);
        vBox2.setBackground(Background.fill(Color.ALICEBLUE));

        List<Integer> boardSizes = List.of(2, 3, 4, 5, 6, 7);

        for (int i = 0; i < boardSizes.size(); i++) {
            int size = boardSizes.get(i);

            GameMenuButton startGameButton = new GameMenuButton();
            startGameButton.setText("%d x %d".formatted(size, size));
            startGameButton.setOnAction(e -> {
                GameBoard gameBoard = GameBoardService.getInstance().newGame(size);
                //todo for check to "WIN" method
//                GameBoard gameBoard = gameBoardService.newGameNotRandom(size);
                new GameBoardView(stage, size, GameBoardService.getInstance(), gameBoard).show();
            });

            VBox vBox = boardSizes.size() > i * 2 ? vBox1 : vBox2;
            vBox.getChildren().add(startGameButton);

        }

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(vBox1);
        hBox.getChildren().add(vBox2);
        hBox.setBackground(Background.fill(Color.ALICEBLUE));


        GameMenuButton backButton = new GameMenuButton();
        backButton.setText("Back");
        backButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        backButton.setOnAction(e -> {
            Scene scene = new MainMenuView(stage).getScene();
            stage.setScene(scene);
            stage.show();

        });

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(backButton);
        vBox.setBackground(Background.fill(Color.ALICEBLUE));


        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        stage.setScene(scene);
    }
}
