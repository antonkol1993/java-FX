package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.GameboardBackEnd.GameBoard;
import com.anarut.gamefifteen.GameboardBackEnd.GameBoardService;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.List;

public class GameBoardView {

    private Stage stage;
    private int size;

    private GameBoardService gameBoardService;
    private GameBoard gameBoard ;

    public GameBoardView(Stage stage, int size) {
        this.stage = stage;
        this.size = size;
    }

    public void show() {
        gameBoard = gameBoardService.newGame(size);

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setAlignment(Pos.CENTER);


//        List<Integer> integers = List.of(5, 13, 11, 9,
//                4, 8, 1, 10,
//                15, 0, 12, 2,
//                14, 6, 7, 3);
        //Board board = service.getNewBoard(int size)


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Button button = new Button();
//                Integer value = integers.get(i * size + j);
                Integer value = gameBoard.getBoard()[i * size + j];
                button.setText(String.valueOf(value));
                button.setMinWidth(35);
                button.setMinHeight(35);

                if (value != 0) {
                    pane.add(button, j, i);
                } else if (value == 0) {
                    button.setText("");
                    button.setStyle("-fx-border-color: #ff0000; -fx-border-width: 3px;");
                    pane.add(button, j,i);
                }
            }
        }

        Scene scene = new Scene(pane, Constants.WIDTH, Constants.HEIGHT);
        stage.setScene(scene);
    }

}
