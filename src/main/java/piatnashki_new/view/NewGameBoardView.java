package piatnashki_new.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import piatnashki_new.model.GameBoard.GameBoard;
import piatnashki_new.model.Model;

public class NewGameBoardView {
    private final Model model;
    private Stage stage;


    public NewGameBoardView(Model model) {
        this.model = model;
    }


    private GridPane paintGameBoard(GameBoard gameBoard) {

        int Paddings = 20;
        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(30,30);
        gridPane.setPadding(new Insets(Paddings, Paddings, Paddings, Paddings));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setBackground(Background.fill(Color.GOLD));
        for (int i = 0; i < gameBoard.getSizeHeight(); i++) {
            for (int j = 0; j < gameBoard.getSizeWidth(); j++) {
                Button button = new Button();
                Integer value = gameBoard.getBoard()[i][j];
                button.setText(String.valueOf(value));
                button.setPrefSize(500,500);
                if (value != 0) {
                    gridPane.add(button, j, i);
                } else {
                    button.setText("");
                    button.setStyle("-fx-border-color: #ff0000; -fx-border-width: 3px;");
                    gridPane.add(button, j, i);
                }
                button.setOnAction(model.getOnNewGameAction());


            }
        }
        return gridPane;
    }

    public Scene getNewGameBoard(GameBoard gameBoard) {
        String labelName = "GameBoard " + gameBoard.getSizeHeight() + "x" + gameBoard.getSizeWidth();
        Label label = new Label();
        label.setText(labelName);
        paintGameBoard(gameBoard);

        VBox vBox = new VBox();

        vBox.getChildren().add(label);
        vBox.getChildren().add(paintGameBoard(gameBoard));
        Scene scene = new Scene(vBox);
        return scene;
    }


}
