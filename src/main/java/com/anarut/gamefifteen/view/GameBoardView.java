package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.button.settings.ButtonsSizes;
import com.anarut.gamefifteen.button.settings.GameMenuButton;
import com.anarut.gamefifteen.gameboard.back.end.GameBoard;
import com.anarut.gamefifteen.gameboard.back.end.GameBoardService;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GameBoardView {

    private Stage stage;
    private int size;

    private GameBoardService gameBoardService;
    private GameBoard gameBoard;
    private ButtonsSizes buttonsSizes;

    public GameBoardView(Stage stage, int size) {
        this.stage = stage;
        this.size = size;
    }

    public GameBoardView(Stage stage, int size, GameBoardService gameBoardService, GameBoard gameBoard) {
        this.stage = stage;
        this.size = size;
        this.gameBoardService = gameBoardService;
        this.gameBoard = gameBoard;
    }


    public void show() {
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setAlignment(Pos.CENTER);
        pane.setBackground(Background.fill(Color.GOLD));


        //todo view board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Button button = new GameMenuButton();
                Integer value = gameBoard.getBoard()[i * size + j];
                button.setText(String.valueOf(value));
                if (buttonsSizes == null) {
                    buttonsSizes = new ButtonsSizes();
                }
                button.setMinWidth((double) (45 * buttonsSizes.getDefaultSize()) / 15);
                button.setMinHeight((double) (45 * buttonsSizes.getDefaultSize()) / 15);

                if (value != 0) {
                    pane.add(button, j, i);

                } else {
                    button.setText("");
                    button.setStyle("-fx-border-color: #ff0000; -fx-border-width: 3px;");
                    pane.add(button, j, i);
                }
                button.setOnAction(e -> {

                    gameBoardService.superMove(gameBoard, value);
                    show();
                });



            }
        }


        //todo добавление кнопки 'load'
        Button loadButton = new GameMenuButton();
        loadButton.setText("load");
//        backButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        hBox.setAlignment(Pos.BOTTOM_LEFT);
        hBox.getChildren().add(loadButton);
        //todo uncorrected temporarily
        loadButton.setOnAction(e -> {
            Scene scene = new MainMenuView(stage).getScene();
            stage.setScene(scene);
            stage.show();

        });

        //todo добавление кнопки 'save'
        Button saveButton = new GameMenuButton();
        saveButton.setText("Save");
//        saveButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);

        hBox.setAlignment(Pos.BOTTOM_LEFT);
        hBox.getChildren().add(saveButton);
        //todo uncorrected temporarily
        saveButton.setOnAction(e -> {
            Scene scene = new MainMenuView(stage).getScene();
            stage.setScene(scene);
            stage.show();

        });

        //todo добавление кнопки 'back'
        Button backButton = new GameMenuButton();
        backButton.setText("Back");
        backButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);

        hBox.setAlignment(Pos.BOTTOM_CENTER);
        hBox.getChildren().add(backButton);

        backButton.setOnAction(e -> {
            Scene scene = new MainMenuView(stage).getScene();
            stage.setScene(scene);
            stage.show();

        });


        vBox.getChildren().addFirst(pane);
        vBox.getChildren().add(hBox);



        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        stage.setScene(scene);

        //todo check for victory
        if (gameBoardService.win(gameBoard)) {
            scene = new WinReturnToMainMenuView(stage).getScene();
            stage.setScene(scene);
            stage.show();
        }
    }


}
