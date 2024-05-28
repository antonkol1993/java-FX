package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.button.settings.ButtonsSizes;
import com.anarut.gamefifteen.button.settings.GameMenuButton;
import com.anarut.gamefifteen.gameboard.back.end.GameBoard;
import com.anarut.gamefifteen.gameboard.back.end.GameBoardService;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GameBoardView {

    private Stage stage;
    private int size;

    private GameBoardService gameBoardService;
    private GameBoard gameBoard;

    public GameBoardView(Stage stage, int size, GameBoardService gameBoardService, GameBoard gameBoard) {
        this.stage = stage;
        this.size = size;
        this.gameBoard = gameBoard;
        this.gameBoardService = gameBoardService;
    }

    private void save(ActionEvent t) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save game");
        File saveFile = fileChooser.showSaveDialog(stage);

        try (FileWriter writer = new FileWriter(saveFile)) {
            StringBuilder array = new StringBuilder();
            for (int i = 0; i < gameBoard.getArrayLength(); i++) {
                array.append(gameBoard.getBoard()[i]);
                array.append(",");
            }
//            System.out.println(array);

            writer.write(array.toString());

        } catch (IOException ex) {
            System.out.println("An error occurred while writing to the file.");
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    private void load(ActionEvent t) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Game File");
        File file = fileChooser.showOpenDialog(stage);
        gameBoard = gameBoardService.loadGame(file);
        new GameBoardView(stage, gameBoard.getSize(), gameBoardService, gameBoard).show();
    }


    public void show() {
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        VBox vBoxToBottomLeft = new VBox();
        vBoxToBottomLeft.setSpacing(45);
        VBox vBoxToBottomRight = new VBox();

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
                button.setPrefSize((double) (45 * ButtonsSizes.getInstance().getSizeButton()) /
                        15, (double) (45 * ButtonsSizes.getInstance().getSizeButton()) / 15);

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
        vBoxToBottomLeft.setAlignment(Pos.BOTTOM_LEFT);
        vBoxToBottomLeft.getChildren().add(loadButton);
        //todo uncorrected temporarily
        loadButton.setOnAction(this::load);

        //todo добавление кнопки 'save'
        Button saveButton = new GameMenuButton();
        saveButton.setText("Save");
//        saveButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);

        vBoxToBottomLeft.setAlignment(Pos.BOTTOM_LEFT);
        vBoxToBottomLeft.getChildren().add(saveButton);
        //todo corrected
        saveButton.setOnAction(this::save);


        //todo добавление кнопки 'back'
        Button backButton = new GameMenuButton();
        backButton.setText("Back");

        vBoxToBottomRight.setAlignment(Pos.BOTTOM_RIGHT);
        vBoxToBottomRight.getChildren().add(backButton);

        backButton.setOnAction(e -> {
            Scene scene = new MainMenuView(stage).getScene();
            stage.setScene(scene);
            stage.show();

        });

        hBox.getChildren().add(vBoxToBottomLeft);
        hBox.getChildren().add(vBoxToBottomRight);
        hBox.setSpacing(150 * ((double) ButtonsSizes.getInstance().getSizeButton() / 10));

        vBox.getChildren().addFirst(pane);
        vBox.getChildren().add(hBox);
        vBox.setSpacing(100);


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
