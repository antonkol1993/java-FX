package com.anarut.gamefifteen.button.settings;

import com.anarut.gamefifteen.Constants;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class GameMenuButton extends Button {


    ButtonsSizes buttonsSizes;


    public GameMenuButton() {
        if (buttonsSizes == null) {
            buttonsSizes = new ButtonsSizes();
        }
            setFont(Font.font(buttonsSizes.getDefaultSize()));
        setPrefWidth(Constants.BUTTON_PREF_WIDTH * ((double) buttonsSizes.getDefaultSize() / 8));
    }

    //    public GameMenuButton(ButtonSizes sizes) {
//
//        setFont(Font.font(sizes));
//    }


}
