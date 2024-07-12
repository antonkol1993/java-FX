package piatnashki_new.model;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.FontWeight;
import piatnashki_new.enums_properties.ButtonSize;

public class Settings {

    private ButtonSize buttonType = ButtonSize.MEDIUM;
    private FontWeight fontWeight = FontWeight.MEDIUM;
    private Paint textColour = Color.BLACK;
    private Paint backgroundColour = Color.GRAY;

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
}


