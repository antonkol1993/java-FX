package com.anarut.gamefifteen.button.settings;

public class ButtonsSizes {
    private static ButtonsSizes instance;
    private  int sizeButton = 10;

    private ButtonsSizes() {
    }

    public static ButtonsSizes getInstance() {
        if (instance == null) {
            instance = new ButtonsSizes();
        }
        return instance;
    }

    public  int getSmallButton () {
        getInstance();
        sizeButton = 8;
        return sizeButton;
    }
    public  int getMediumButton () {
        getInstance();
        sizeButton = 16;
        return sizeButton;
    }
    public  int getLargeButton () {
        getInstance();
        sizeButton = 25;
        return sizeButton;
    }

    public  int getSizeButton() {
        return sizeButton;
    }
}
