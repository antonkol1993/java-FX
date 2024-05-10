package com.anarut.gamefifteen.button.settings;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameMenuButton extends Button {
    Integer size = 13;
    Stage stage;
    ButtonSettings buttonSettings;



    public GameMenuButton() {
        setFont(Font.font(size));
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    //    public GameMenuButton(ButtonSizes sizes) {
//
//        setFont(Font.font(sizes));
//    }


}
