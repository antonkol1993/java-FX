package piatnashki_new.controller;

import javafx.application.Platform;
import javafx.stage.Stage;
import piatnashki_new.model.MainMenuModel;
import piatnashki_new.view.MainMenuView;

public class MainMenuController extends AbstractController<MainMenuModel, MainMenuView> {

    public MainMenuController(Stage stage) {
        super(stage);
        model = MainMenuModel.builder()
                .withOnNewGameAction(event -> new GameController(stage).show())
                .withOnExitAction(event -> Platform.exit())
                .withOnSettingsAction(event -> new SettingsController(stage).show())
                .build();
        view = new MainMenuView(model);
    }


}
