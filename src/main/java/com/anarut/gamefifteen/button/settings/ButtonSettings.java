package com.anarut.gamefifteen.button.settings;

import javafx.scene.text.Font;

public class ButtonSettings {

//    public static int size = 13;
    GameMenuButton gameMenuButton;

    public GameMenuButton getButtonSize (int size) {
        gameMenuButton.setSize(size);
        return gameMenuButton;
    }

}
