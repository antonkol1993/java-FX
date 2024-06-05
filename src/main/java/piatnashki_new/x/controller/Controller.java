package piatnashki_new.x.controller;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import piatnashki_new.x.controller.Service.GameBoardService;
import piatnashki_new.x.model.Model;
import piatnashki_new.x.view.View;

public class Controller {

    // private Service singletonService;


    private static final String REFRESH = "GAME 15 ||Refresh: ";
    private final Stage stage;
    private Model model;
    private View view;
    private int count = 0;
    private int refreshCount = 0;

    private GameBoardService gameBoardService;

    public Controller(Stage stage) {
        this.stage = stage;
        this.model = prepareModel();
        this.view = new View(model);

    }

    private Model prepareModel() {
        Model model = new Model();

        Label label = new Label();
        label.setText(model.getLabelText());

        model.setOnRefreshAction(event -> {
//            new Controller(stage).show(); // открытие новой вью
            while (refreshCount < 1) {
                model.setLabelText(model.getLabelText() + REFRESH);
                refreshCount++;
            }
            model.setLabelText(model.getLabelText() + count++);
            view.refresh();
        });// new game controller


        model.setOnExitAction(event -> Platform.exit());
//        model.setOnNewGameAction(event -> );


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
