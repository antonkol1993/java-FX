package piatnashki_new.controller;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import piatnashki_new.controller.Service.GameBoardService;
import piatnashki_new.model.Model;
import piatnashki_new.view.MainMenuView;

public class Controller {

    // private Service singletonService;


    private static final String REFRESH = "GAME 15 ||Refresh: ";
    private final Stage stage;
    private final MainMenuView mainMenuView;
    private int count = 1;

    public Controller(Stage stage) {
        this.stage = stage;
        Model model = prepareModel();
        this.mainMenuView = new MainMenuView(model);

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
        GameBoardService.getInstance().newGame(5,5);
        // view.
        });


//        model.setOnMoveAction(event ->
//            service.move(model.getBoard(), value);
//            service.move(model.getBoard(), i, j);
//            model.setModel();
//            view.refresh();
//        });

        return model;
    }

    public void show(){
        stage.setScene(mainMenuView.getMainMenu());
        stage.show();
    }
}
