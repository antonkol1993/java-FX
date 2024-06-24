package piatnashki_new.service;

public class ButtonsSizes {
    private static ButtonsSizes instance;
    private  int sizeButton = 12;

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
        sizeButton = 14;
        return sizeButton;
    }
    public  int getLargeButton () {
        getInstance();
        sizeButton = 19;
        return sizeButton;
    }

    public  int getSizeButton() {
        return sizeButton;
    }
}
