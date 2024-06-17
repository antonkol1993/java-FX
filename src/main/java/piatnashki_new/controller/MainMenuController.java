package piatnashki_new.controller;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import piatnashki_new.model.MainMenuModel;
import piatnashki_new.model.Model;
import piatnashki_new.model.OldModel;
import piatnashki_new.model.gameBoard.GameBoard;
import piatnashki_new.service.GameBoardService;
import piatnashki_new.view.MainMenuView;
import piatnashki_new.view.NewGameBoardView;

public class MainMenuController extends AbstractController {
    private final GameBoardService gameBoardService = GameBoardService.getInstance();
    private Stage stage;
    private MainMenuModel mainMenuModel;
    private final MainMenuView mainMenuView;
    private GameBoard currentBoard;

    public MainMenuController(Stage stage) {
        this.stage = stage;
        mainMenuModel= prepareModel();
        this.mainMenuView = new MainMenuView(mainMenuModel);
        currentBoard = gameBoardService.newGame(5, 5);
    }

    private MainMenuModel prepareModel() {
        MainMenuModel mainMenuModel = new MainMenuModel();

        Label label = new Label();
        label.setText(REFRESH);

        mainMenuModel = MainMenuModel.builder()
                .withOnNewGameAction(event -> new GameController(stage).show())
                .withOnExitAction(event -> Platform.exit())
                .build();

//        model.setOnRefreshAction(event -> {
//            model.setLabelText(REFRESH + count++);
//            mainMenuView.refresh();
//        });
        oldModel.setOnExitAction(event -> Platform.exit());
        oldModel.setOnNewGameAction(event -> {
            show(gameBoardView.getScene(currentBoard));
        });

        oldModel.setOnMoveActionProvider(value -> e -> {
            gameBoardService.move(currentBoard, value);
            show(gameBoardView.getScene(currentBoard));
        });

        return oldModel;
    }

}
