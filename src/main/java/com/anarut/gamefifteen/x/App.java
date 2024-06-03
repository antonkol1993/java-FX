package com.anarut.gamefifteen.x;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        new Controller(stage).show();
    }
}
