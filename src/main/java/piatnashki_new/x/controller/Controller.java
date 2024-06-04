package piatnashki_new.x.controller;

import javafx.application.Platform;
import javafx.stage.Stage;
import piatnashki_new.x.model.Model;
import piatnashki_new.x.view.View;

public class Controller {

    // private Service singletonService;

    private static final String NEW_GAME_TEXT = "New Game";
    private final Stage stage;
    private Model model;
    private View view;
    private int count = 0;

    public Controller(Stage stage) {
        this.stage = stage;
        this.model = prepareModel();
        this.view = new View(model);
    }

    private Model prepareModel() {
        Model model = new Model();
        model.setNewGameText(NEW_GAME_TEXT);
        model.setOnNewGameAction(event -> {
//            new Controller(stage).show(); // открытие новой вью

            model.setNewGameText(NEW_GAME_TEXT + " " + count++);
            view.refresh();
        });// new game controller
        model.setOnExitAction(event -> Platform.exit());
//        model.setOnMoveAction(event ->
//            service.move(model.getBoard(), value);
//            service.move(model.getBoard(), i, j);
//            model.setModel();
//            view.refresh();
//        });

        return model;
    }

    public void show(){
        stage.setScene(view.getScene());
        stage.show();
    }
}
