package com.anarut.gamefifteen;

import com.anarut.gamefifteen.GameboardBackEnd.GameBoard;
import com.anarut.gamefifteen.GameboardBackEnd.GameBoardService;
import com.anarut.gamefifteen.view.MainMenuView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Game15Application extends Application {


    @Override
    public void init() throws Exception {

    }



    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new MainMenuView(stage).getScene();

        stage.setMinWidth(320);
        stage.setMinHeight(240);
        stage.setMaxWidth(640);
        stage.setMaxHeight(480);
        stage.setTitle("Game 15");
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void stop() throws Exception {
        System.out.println("Game 15 stopped");
    }

    public static void main(String[] args) {
        launch();
    }
}