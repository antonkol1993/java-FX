package com.anarut.gamefifteen.button.settings;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class ButtonSettings {

    //    public static int size = 13;
    ButtonsSizes size;

    public Button getButtonSmallSize(Button gameMenuButton) {

        gameMenuButton.setFont(Font.font(size.small));
        return gameMenuButton;
    }
    public GameMenuButton getButtonMediumSize(GameMenuButton gameMenuButton, ButtonsSizes size) {

        gameMenuButton.setSize(size.medium);
        return gameMenuButton;
    }
    public GameMenuButton getButtonLargeSize(GameMenuButton gameMenuButton, ButtonsSizes size) {

        gameMenuButton.setSize(size.large);
        return gameMenuButton;
    }


}
