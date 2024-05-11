package com.anarut.gamefifteen.button.settings;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class GameMenuButton extends Button {


    ButtonsSizes buttonsSizes;



    public GameMenuButton() {
            setFont(Font.font(buttonsSizes.getDefaultSize()));
    }

    //    public GameMenuButton(ButtonSizes sizes) {
//
//        setFont(Font.font(sizes));
//    }


}
