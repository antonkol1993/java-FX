package piatnashki_new.controller;

import javafx.stage.Stage;
import piatnashki_new.model.GameModel;
import piatnashki_new.model.gameBoard.GameBoard;
import piatnashki_new.service.GameBoardService;
import piatnashki_new.view.GameView;

public class GameController extends AbstractController<GameModel, GameView> {
    private final GameBoardService gameBoardService = GameBoardService.getInstance();
    private GameBoard gameBoard;
    public GameController(Stage stage) {
        super(stage);
        this.gameBoard = gameBoardService.newGame(5, 5);

        model = new GameModel(value -> e -> {
            gameBoardService.move(gameBoard, value);
            view.refresh();
        }, gameBoard);

        view = new GameView(model);
    }

}
