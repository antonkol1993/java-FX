package piatnashki_new.controller;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import piatnashki_new.model.GameModel;
import piatnashki_new.model.gameBoard.GameBoard;
import piatnashki_new.service.GameBoardService;
import piatnashki_new.service.SettingsService;
import piatnashki_new.view.GameView;

public class GameController extends AbstractController<GameModel, GameView> {
    private final GameBoardService gameBoardService = GameBoardService.getInstance();
    private final GameBoard gameBoard;
    private SettingsService settingsService = SettingsService.getInstance();

    public GameController(Stage stage) {
        super(stage);
        this.gameBoard = gameBoardService.newGame(5, 5);

        model = GameModel.builder().withOnMoveAction(e -> {
                    Button source = (Button) e.getSource();
                    String text = source.getText();

                    int value = text.equals("") ? 0 : Integer.valueOf(text);
                    gameBoardService.move(gameBoard, value);
                    view.refresh();
                })
                .withGameboard(gameBoard)
                .withSettings(settingsService.getSettings())
                .withOnBackAction(e -> {
                    new MainMenuController(stage).show();
                })
                .build();


        view = new GameView(model);
    }

}
