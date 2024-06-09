package piatnashki_new.controller;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import piatnashki_new.controller.service.GameBoardService;
import piatnashki_new.model.Model;
import piatnashki_new.view.NewGameBoardView;
import piatnashki_new.view.MainMenuView;

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
         showGameBoard();
        });


//        model.setOnMoveAction(event ->
//            service.move(model.getBoard(), value);
//            service.move(model.getBoard(), i, j);
//            model.setModel();
//            view.refresh();
//        });

        return model;
    }
    private Scene setScene (Scene newScene) {
        return newScene;
    }
    public void showMainMenu(){
        stage.setScene(mainMenuView.getMainMenu());
        stage.show();
    }
    public void showGameBoard(){
        stage.setScene(gameBoardView.getNewGameBoard(GameBoardService.getInstance().newGame(5,5)));
        stage.show();
    }

}
