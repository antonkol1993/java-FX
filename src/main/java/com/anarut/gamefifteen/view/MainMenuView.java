package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.button.settings.ButtonsSizes;
import com.anarut.gamefifteen.button.settings.GameMenuButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class MainMenuView {

    private Stage stage;


    public MainMenuView(Stage stage) {
        this.stage = stage;
    }

    private void load(ActionEvent t) {
        File loadFile = new File("D:\\fynjy\\Saves Gameboard");
        boolean exists = loadFile.exists();
        System.out.println(exists);
    }

    public Scene getScene() {
        new ButtonsSizes();
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.BEIGE));

        Label titleLabel = new Label();
        titleLabel.setText("Game 15");
        vBox.getChildren().add(titleLabel);


        Button newGameButton = new GameMenuButton();
        newGameButton.setText("New Game");
        newGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        newGameButton.setOnAction(actionEvent -> new GameBoardSettingsView(stage).show());
        vBox.getChildren().add(newGameButton);


        //todo load button


//        FileNameExtensionFilter filter = new FileNameExtensionFilter(
//                "Text", "txt");

        FileChooser fileChooser = new FileChooser();
//        fileChooser.setFileFilter(filter);
        fileChooser.setTitle("Open Game File");
        fileChooser.setInitialDirectory(new File("D:\\fynjy\\Saves Gameboard"));

        Button loadGameButton = new GameMenuButton();
        loadGameButton.setDisable(false);
        loadGameButton.setText("Load Game");
        loadGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        loadGameButton.setOnAction(actionEvent -> {
            File file = fileChooser.showOpenDialog(stage);
            if (file != null) {
                System.out.println(file.getAbsolutePath());
            }

            Integer []arr;
//            boolean exists = file.exists();
//            System.out.println(exists);
            try {
                assert file != null;
                FileReader fileReader = null;
                try {
                    fileReader = new FileReader(file);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                try {
                    StringBuilder temp = new StringBuilder();


                    int c;
                    int quantity = 0;

                    while ((c = fileReader.read()) != -1) {
                        quantity++;
                    }
                    arr = new Integer[quantity];
                    while ((c = fileReader.read()) != -1) {
                        int i = 0;
                        temp.append(fileReader.read());
                        if (fileReader.read() == ',') {
                             arr[i] = Integer.parseInt(String.valueOf(temp));
                             temp = new StringBuilder();
                            System.out.println(Arrays.toString(arr));
                        }

                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Arrays.toString(arr));
        });


        vBox.getChildren().add(loadGameButton);

        Button settingsButton = new GameMenuButton();
        settingsButton.setText("settings");
        settingsButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        settingsButton.setOnAction(actionEvent -> new SettingsView(stage).show());
        vBox.getChildren().add(settingsButton);

        Button exitGameButton = new GameMenuButton();
        exitGameButton.setText("Exit Game");
        exitGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        exitGameButton.setOnAction(actionEvent -> Platform.exit());
        vBox.getChildren().add(exitGameButton);

        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        scene.setFill(Color.GOLD);
        return scene;
    }
}
