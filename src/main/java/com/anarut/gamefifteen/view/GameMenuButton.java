package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.security.PublicKey;

public class GameMenuButton extends Button {
    private Stage stage;
    static final int LARGE_SCREEN = 24;
    static final int MEDIUM_SCREEN = 16;
    static final int SMALL_SCREEN = 8;

    public GameMenuButton() {
        setFont(Font.font(16));
    }

    public GameMenuButton(int constant) {
        setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        setFont(Font.font(constant));
        if (constant <= 8) {
            stage.setMinWidth(320 / 1.5);
            stage.setMinHeight(240/ 1.5);
            stage.setMaxWidth(640/ 1.5);
            stage.setMaxHeight(480 / 1.5);
        }
        if (constant <= 16 && constant > 8) {
            stage.setMinWidth(320);
            stage.setMinHeight(240);
            stage.setMaxWidth(640);
            stage.setMaxHeight(480);
        }
        if (constant >= 24) {
            stage.setMinWidth(320 * 3.5);
            stage.setMinHeight(240 * 3.5);
            stage.setMaxWidth(640 * 3.5);
            stage.setMaxHeight(480 * 3.5);
        }
    }




}
