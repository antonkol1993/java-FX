package piatnashki_new.controller;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import piatnashki_new.controller.service.GameBoardService;
import piatnashki_new.model.MainMenuModel;
import piatnashki_new.model.Model;
import piatnashki_new.model.gameBoard.GameBoard;
import piatnashki_new.view.MainMenuView;
import piatnashki_new.view.NewGameBoardView;

public class Controller {

    // private Service singletonService;
    private final GameBoardService gameBoardService = GameBoardService.getInstance();

    private static final String REFRESH = "GAME 15 ||Refresh: ";
    private final Stage stage;

    private MainMenuModel mainMenuModel;
    private final MainMenuView mainMenuView;
    private final NewGameBoardView gameBoardView;
    private int count = 1;

    private GameBoard currentBoard;

    public Controller(Stage stage) {
        this.stage = stage;
        Model model = prepareModel();
        this.mainMenuView = new MainMenuView(mainMenuModel);
        this.gameBoardView = new NewGameBoardView(model);
        currentBoard = gameBoardService.newGame(5, 5);

    }

    private Model prepareModel() {
        Model model = new Model();

        Label label = new Label();
        label.setText(REFRESH);

        mainMenuModel = MainMenuModel.builder()
                .withOnNewGameAction(event -> show(gameBoardView.getScene(currentBoard)))
                .withOnExitAction(event -> Platform.exit())
                .build();

//        model.setOnRefreshAction(event -> {
//            model.setLabelText(REFRESH + count++);
//            mainMenuView.refresh();
//        });
        model.setOnExitAction(event -> Platform.exit());
        model.setOnNewGameAction(event -> {
            show(gameBoardView.getScene(currentBoard));
        });

        model.setOnMoveActionProvider(value -> e -> {
            gameBoardService.move(currentBoard, value);
            show(gameBoardView.getScene(currentBoard));
        });

        return model;
    }

    private void gameBoardsSettings() {
        stage.setHeight(600);
        stage.setWidth(600);
    }

    public void showMainMenu() {
        gameBoardsSettings();
        stage.setScene(mainMenuView.getMainMenu());
        stage.show();
    }


    private void show(Scene scene) {
        stage.setHeight(600);
        stage.setWidth(600);
        stage.setScene(scene);
        stage.show();
    }
}
