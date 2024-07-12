package piatnashki_new.enums_properties;

import javafx.scene.text.FontWeight;

public enum GameButtonSize {

    SMALL_SIZE_GAMEBUTTON(40),
    MEDIUM_SIZE_GAMEBUTTON(60),
    BOLD_SIZE_GAMEBUTTON(90);

    private final double font;


    GameButtonSize(double font) {
        this.font = font;
    }

    public double getFont() {
        return font;
    }

}
