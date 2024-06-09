package piatnashki_new.controller;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import piatnashki_new.controller.service.GameBoardService;
import piatnashki_new.model.GameBoard.GameBoard;
import piatnashki_new.model.Model;
import piatnashki_new.view.MainMenuView;
import piatnashki_new.view.NewGameBoardView;

public class Controller {

    // private Service singletonService;


    private static final String REFRESH = "GAME 15 ||Refresh: ";
    private final Stage stage;
    private final MainMenuView mainMenuView;
    private final NewGameBoardView gameBoardView;
    private int count = 1;

    public Controller(Stage stage) {
        this.stage = stage;
        Model model = prepareModel();
        this.mainMenuView = new MainMenuView(model);
        this.gameBoardView = new NewGameBoardView(model);

    }

    private Model prepareModel() {
        Model model = new Model();

        Label label = new Label();
        label.setText(REFRESH);

        model.setOnRefreshAction(event -> {
            model.setLabelText(REFRESH + count++);
            mainMenuView.refresh();
        });
        model.setOnExitAction(event -> Platform.exit());
        model.setOnNewGameAction(event -> {
            showNewGame();
        });
        model.setOnMoveAction(e -> {
            GameBoardService gameBoardService  = GameBoardService.getInstance();
            GameBoardService.getInstance().move(gameBoardService.getCurrentBoard(), gameBoardService.getNumbForMove());
        });


//        model.setOnMoveAction(event ->
//            service.move(model.getBoard(), value);
//            service.move(model.getBoard(), i, j);
//            model.setModel();
//            view.refresh();
//        });

        return model;
    }
    private void gameBoardsSettings () {
        stage.setHeight(600);
        stage.setWidth(600);
    }
    public void showMainMenu() {
        stage.setScene(mainMenuView.getMainMenu());
        stage.show();
    }

    public void showNewGame() {
        gameBoardsSettings();
        stage.setScene(gameBoardView.getScene(GameBoardService.getInstance().newGame(5, 5)));
        stage.show();
    }

    public void showGameboard() {
       gameBoardsSettings();
        stage.setScene(gameBoardView.getScene(GameBoardService.getInstance().getCurrentBoard()));
        stage.show();
    }

}
