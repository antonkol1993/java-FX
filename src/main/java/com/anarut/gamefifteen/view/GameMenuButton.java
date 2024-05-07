package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameMenuButton extends Button {
    private Stage stage;

//    static final int largeScreen = 24;
//    static final int mediumScreen = 16;
//    static final int smallScreen = 8;

    private int screenSize;


    public GameMenuButton() {

        if (screenSize <= 8) {
            setPrefWidth((double) Constants.BUTTON_PREF_WIDTH / 2);
            setFont(Font.font(screenSize));
        }
        if (screenSize >= 8 && screenSize < 20) {
            setPrefWidth(Constants.BUTTON_PREF_WIDTH);
            setFont(Font.font(screenSize));
        }
        if (screenSize >= 24) {
            setPrefWidth(Constants.BUTTON_PREF_WIDTH * 2);
            setFont(Font.font(screenSize));
        } else {
            setFont(Font.font(12));
        }

    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
