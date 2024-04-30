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

    public GameBoardView(Stage stage, int size, GameBoardService gameBoardService, GameBoard gameBoard) {
        this.stage = stage;
        this.size = size;
        this.gameBoardService = gameBoardService;
        this.gameBoard = gameBoard;
    }


    public void show() {

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setAlignment(Pos.CENTER);



//        List<Integer> integers = List.of(5, 13, 11, 9,
//                4, 8, 1, 10,
//                15, 0, 12, 2,
//                14, 6, 7, 3);
        //Board board = service.getNewBoard(int size)

        //todo view board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Button button = new Button();
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
                button.setOnAction(e -> {

                    gameBoardService.move(gameBoard,value);
                    show();
                        } );
            }
        }
        //todo check for victory
//        if (gameBoardService.win(gameBoard)) {
////            GridPane pane1 = new GridPane();
////            pane1.setPadding(new Insets(10, 10, 10, 10));
////            pane1.setAlignment(Pos.CENTER);
////            Button button1 = new Button();
////            button1.setText("YOU WIN");
////
////
////            button1.setPrefSize(400, 500);
////            button1.setStyle("-fx-border-color: #ff0000; -fx-border-width: 3px;");
////            Scene scene = new Scene(pane1, Constants.WIDTH, Constants.HEIGHT);
////            stage.setScene(scene);
////            button1.setOnAction(t -> {
////            System.out.println("GAME ENDED");
////            System.exit(0);
////        });
//
//            Scene scene = new MainMenuView(stage).getScene();
//            stage.setScene(scene);
//            stage.show();
//
//
//        }


        Scene scene = new Scene(pane, Constants.WIDTH, Constants.HEIGHT);
        stage.setScene(scene);

        if (gameBoardService.win(gameBoard)) {
            scene = new WinReturnMainMenu(stage).getScene();
            stage.setScene(scene);
            stage.show();
        }
    }


}
