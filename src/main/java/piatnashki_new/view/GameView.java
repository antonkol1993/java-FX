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
import javafx.scene.text.FontWeight;
import piatnashki_new.model.GameModel;
import piatnashki_new.model.gameBoard.GameBoard;
import piatnashki_new.service.SettingsService;


public class GameView implements View {

    private Button moveButton;
    private Button backButton;
    private GameModel model;
    private GridPane gridPane = new GridPane();
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

        gridPane.setPrefSize(500, 500);
        gridPane.setPadding(new Insets(paddings, paddings, paddings, paddings));
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setBackground(Background.fill(Color.GOLD));

        buildGameField();

        backButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Back").
                withOnAction(model.getOnBackAction())
                .build();
        backButton.setStyle("-fx-font: 22 arial; -fx-base: green");
        vBox.getChildren().add(backButton);
        backButton.setAlignment(Pos.BOTTOM_LEFT);
        return vBox;
    }

    @Override
    public void refresh() {

        int newSize = model.getSettings().getButtonType().getSize();
        FontWeight fontWeight = model.getSettings().getFontWeight();
        moveButton.setFont(Font.font(null, fontWeight,newSize));
        backButton.setFont(Font.font(null, fontWeight,newSize));
        buildGameField();
    }


    private void buildGameField() {
        GameBoard gameBoard = model.getGameBoard();
        for (int i = 0; i < gameBoard.getSizeHeight(); i++) {
            for (int j = 0; j < gameBoard.getSizeWidth(); j++) {
                //todo uncorrect born instance

                Integer value = gameBoard.getBoard()[i][j];
                String nameButton = String.valueOf(model.getGameBoard().getBoard()[i][j]);

                moveButton = ButtonBuilder.get().

                        withFontSize(model.getSettings().getButtonType().getSize()).
                        withFontWeight(model.getSettings().getFontWeight()).
                        withText(nameButton).
                        withOnAction(model.getOnMoveAction())
                        .build();
                moveButton.setPrefSize(60,60);

                if (value != 0) {
                    gridPane.add(moveButton, j, i);
                    moveButton.setStyle("-fx-font: 22 arial; -fx-base: LightGray");
                } else {
                    moveButton.setText("");
                    moveButton.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    gridPane.add(moveButton, j, i);
                }
                moveButton.setOnAction(model.getOnMoveAction());
//                button.setOnAction(model.getOnMoveActionProvider().apply(value));
            }
        }
    }


}
