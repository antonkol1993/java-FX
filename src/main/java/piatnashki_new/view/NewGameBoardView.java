package piatnashki_new.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import piatnashki_new.controller.Controller;
import piatnashki_new.controller.service.GameBoardService;
import piatnashki_new.model.GameBoard.GameBoard;
import piatnashki_new.model.Model;

public class NewGameBoardView {
    private final Model model;
    private Stage stage;


    public NewGameBoardView(Model model) {
        this.model = model;
    }


    private VBox paintGameBoard(GameBoard gameBoard) {

        String labelName = "GameBoard " + gameBoard.getSizeHeight() + "x" + gameBoard.getSizeWidth();
        int Paddings = 20;
        Label label = new Label();
        label.setText(labelName);

        VBox vBox = new VBox();
        GridPane gridPane = new GridPane();

        vBox.getChildren().add(label);
        vBox.getChildren().add(gridPane);

        gridPane.setPrefSize(50,50);
        gridPane.setPadding(new Insets(Paddings, Paddings, Paddings, Paddings));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setBackground(Background.fill(Color.GOLD));

        for (int i = 0; i < gameBoard.getSizeHeight(); i++) {
            for (int j = 0; j < gameBoard.getSizeWidth(); j++) {
                Button button = new Button();
                Integer value = gameBoard.getBoard()[i][j];
                button.setText(String.valueOf(value));
                button.setPrefSize(50,50);
                if (value != 0) {
                    gridPane.add(button, j, i);
                } else {
                    button.setText("");
                    button.setStyle("-fx-border-color: #ff0000; -fx-border-width: 3px;");
                    gridPane.add(button, j, i);
                }
                button.setOnAction(e -> {
                    GameBoardService gbs = GameBoardService.getInstance();
                    gbs.move(gbs.getCurrentBoard(),value);
//                    new Controller(stage).showGameboard();
                });

            }


        }
        return vBox;
    }

    public Scene getScene(GameBoard gameBoard) {
        Scene scene = new Scene(paintGameBoard(gameBoard));
        return scene;
    }


}
