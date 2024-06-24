package piatnashki_new.model;

import javafx.scene.text.FontWeight;
import piatnashki_new.service.ButtonType;

public class Settings {

    private ButtonType buttonType = ButtonType.MEDIUM;
    private FontWeight fontWeight = FontWeight.NORMAL;

    public Settings() {
    }

    public ButtonType getButtonType() {
        return buttonType;
    }

    public void setButtonType(ButtonType buttonType) {
        this.buttonType = buttonType;
    }

    public FontWeight getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }
}

