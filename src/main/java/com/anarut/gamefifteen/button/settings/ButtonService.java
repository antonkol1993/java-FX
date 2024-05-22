package com.anarut.gamefifteen.button.settings;

public class ButtonService {

    //    public static int size = 13;
    ButtonsSizes size;

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
