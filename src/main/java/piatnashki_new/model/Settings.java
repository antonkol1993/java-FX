package piatnashki_new.model;

import javafx.scene.text.FontWeight;
import piatnashki_new.service.ButtonSize;

public class Settings {

    private ButtonSize buttonType = ButtonSize.MEDIUM;
    private FontWeight fontWeight = FontWeight.NORMAL;

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
}

