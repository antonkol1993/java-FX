package piatnashki_new.model;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.FontWeight;
import piatnashki_new.enums_properties.ButtonSize;
import piatnashki_new.enums_properties.GameButtonSize;

public class Settings {

    private ButtonSize buttonType = ButtonSize.MEDIUM;
    private FontWeight fontWeight = FontWeight.MEDIUM;
    private Paint textColour = Color.BLACK;
    private Paint backgroundColour = Color.LIGHTGREY;
    private GameButtonSize sizeInGameBoard = GameButtonSize.MEDIUM_SIZE_GAMEBUTTON;

    public Settings() {
    }

    public ButtonSize getButtonType() {
        return buttonType;
    }

    public void setButtonType(ButtonSize buttonType) {
        this.buttonType = buttonType;
    }

    public FontWeight getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public Paint getTextColour() {
        return textColour;
    }

    public void setTextColour(Paint textColour) {
        this.textColour = textColour;
    }

    public Paint getBackgroundColour() {
        return backgroundColour;
    }

    public void setBackgroundColour(Paint backgroundColour) {
        this.backgroundColour = backgroundColour;
    }

    public GameButtonSize getSizeInGameBoard() {
        return sizeInGameBoard;
    }

    public void setSizeInGameBoard(GameButtonSize sizeInGameBoard) {
        this.sizeInGameBoard = sizeInGameBoard;
    }
}


