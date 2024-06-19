package piatnashki_new;

import javafx.application.Application;
import javafx.stage.Stage;
import piatnashki_new.controller.MainMenuController;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        new MainMenuController(stage).showMainMenu();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("game piatnashki is over");
    }
}
