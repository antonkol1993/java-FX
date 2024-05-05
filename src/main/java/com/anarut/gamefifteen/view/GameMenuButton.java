package com.anarut.gamefifteen.view;

import com.anarut.gamefifteen.Constants;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class GameMenuButton extends Button {

    public GameMenuButton() {
        setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        setFont(Font.font(16));
    }

}
