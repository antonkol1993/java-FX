package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class GameMenuButton extends Button {
    private Stage stage;

//    static final int largeScreen = 24;
//    static final int mediumScreen = 16;
//    static final int smallScreen = 8;

    private int screenSize;


    public GameMenuButton() {

            setFont(Font.font(12));
    }
    public GameMenuButton(int size) {

        setFont(Font.font(size));
    }


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
