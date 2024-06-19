package piatnashki_new.controller;

import javafx.application.Platform;
import javafx.stage.Stage;
import piatnashki_new.model.MainMenuModel;
import piatnashki_new.view.MainMenuView;

public class MainMenuController extends AbstractController {
    private final Stage stage;
    private MainMenuModel mainMenuModel;
    MainMenuView mainMenuView;
    public MainMenuController(Stage stage) {
        super(stage);
        this.stage = stage;
        mainMenuModel= prepareModel();
        mainMenuView = new MainMenuView(mainMenuModel);
//
//        GameBoardService gameBoardService = GameBoardService.getInstance();
//        GameBoard currentBoard = gameBoardService.newGame(5, 5);
    }

    private MainMenuModel prepareModel() {
        mainMenuModel = MainMenuModel.builder()
                .withOnNewGameAction(event -> new GameController(stage).show())
                .withOnExitAction(event -> Platform.exit())
                .build();
        return mainMenuModel;
    }
    public void showMainMenu() {
        stage.setScene(mainMenuView.getMainMenu());
        stage.show();
    }

}
