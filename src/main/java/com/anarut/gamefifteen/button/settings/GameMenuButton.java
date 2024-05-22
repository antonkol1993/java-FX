package com.anarut.gamefifteen.button.settings;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class GameMenuButton extends Button {


    ButtonsSizes buttonsSizes;
    private int size;


    public GameMenuButton() {
        if (buttonsSizes == null) {
            buttonsSizes = new ButtonsSizes();
        }
            setFont(Font.font(buttonsSizes.getDefaultSize()));

    }

    //    public GameMenuButton(ButtonSizes sizes) {
//
//        setFont(Font.font(sizes));
//    }


}
