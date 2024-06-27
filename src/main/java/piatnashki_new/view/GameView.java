package piatnashki_new.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import piatnashki_new.model.GameModel;
import piatnashki_new.model.gameBoard.GameBoard;

public class GameView implements View {

    private GameModel model;
    private final GridPane gridPane = new GridPane();

    public GameView(GameModel model) {
        this.model = model;
    }

    @Override
    public Parent getView() {
        GameBoard gameBoard = model.getGameBoard();

        String labelName = "GameBoard " + gameBoard.getSizeHeight() + "x" + gameBoard.getSizeWidth();
        int paddings = 20;
        Label label = new Label();
        label.setText(labelName);

        VBox vBox = new VBox();

        vBox.getChildren().add(label);
        vBox.getChildren().add(gridPane);

        gridPane.setPrefSize(50, 50);
        gridPane.setPadding(new Insets(paddings, paddings, paddings, paddings));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setBackground(Background.fill(Color.GOLD));

        buildGameField();
        return vBox;
    }

    @Override
    public void refresh() {
        buildGameField();
    }


    private void buildGameField() {
        GameBoard gameBoard = model.getGameBoard();
        for (int i = 0; i < gameBoard.getSizeHeight(); i++) {
            for (int j = 0; j < gameBoard.getSizeWidth(); j++) {
                //todo uncorrect born instance
                Button button = new Button();
                Integer value = gameBoard.getBoard()[i][j];
                button.setText(String.valueOf(value));
                button.setPrefSize(50, 50);
                if (value != 0) {
                    gridPane.add(button, j, i);
                } else {
                    button.setText("");
                    button.setStyle("-fx-border-color: #ff0000; -fx-border-width: 3px;");
                    gridPane.add(button, j, i);
                }
                button.setOnAction(model.getOnMoveAction());
//                button.setOnAction(model.getOnMoveActionProvider().apply(value));
            }
        }
    }
}
