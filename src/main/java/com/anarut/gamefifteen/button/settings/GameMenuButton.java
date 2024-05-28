package com.anarut.gamefifteen.button.settings;

import com.anarut.gamefifteen.Constants;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class GameMenuButton extends Button {


    public GameMenuButton() {
        ButtonsSizes.getInstance();
        setFont(Font.font(ButtonsSizes.getInstance().getSizeButton()));
        setPrefWidth(Constants.BUTTON_PREF_WIDTH * ((double) ButtonsSizes.getInstance().getSizeButton() / 8));
    }



}
