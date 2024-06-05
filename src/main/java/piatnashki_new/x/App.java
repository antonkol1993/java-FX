package piatnashki_new.x;

import javafx.application.Application;
import javafx.stage.Stage;
import piatnashki_new.x.controller.Controller;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        new Controller(stage).show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("game piatnashki is over");
    }
}
