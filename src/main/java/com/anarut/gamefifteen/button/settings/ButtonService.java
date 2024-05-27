package com.anarut.gamefifteen.button.settings;

import javafx.stage.Stage;

public class ButtonService {

    //    public static int size = 13;
    ButtonsSizes size;
    Stage stage;

    public Stage stageSize() {
        if (stage == null) {
            stage = new Stage();
        }
        stage.setMinWidth((double) (420 * (size.getDefaultSize()) / 5));
        stage.setMinHeight(340 * ((double) (size.getDefaultSize()) / 5));
        stage.setMaxWidth(840 * ((double) (size.getDefaultSize()) / 5));
        stage.setMaxHeight(680 * ((double) (size.getDefaultSize()) / 5));
        stage.setWidth(520 * ((double) (size.getDefaultSize()) / 5));
        stage.setHeight(440 * ((double) (size.getDefaultSize()) / 5));
        return stage;
    }

    public void getButtonSmallSize() {
        if (size == null) {
            size = new ButtonsSizes();
        }
        size.setDefaultSize(8);

//        gameMenuButton.setFont(Font.font(new ButtonsSizes().getSmall()));
    }

    public void getButtonMediumSize() {
        if (size == null) {
            size = new ButtonsSizes();
        }
        size.setDefaultSize(16);

//        gameMenuButton.setFont(Font.font(new ButtonsSizes().getSmall()));
    }

    public void getButtonLargeSize() {
        if (size == null) {
            size = new ButtonsSizes();
        }
        size.setDefaultSize(24);

//        gameMenuButton.setFont(Font.font(new ButtonsSizes().getSmall()));

    }


}
