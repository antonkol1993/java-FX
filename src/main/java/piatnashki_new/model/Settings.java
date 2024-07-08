package piatnashki_new.model;

import javafx.scene.text.FontWeight;
import piatnashki_new.service.ButtonSize;

public class Settings {

    private ButtonSize buttonSize = ButtonSize.MEDIUM;
    private FontWeight fontWeight = FontWeight.NORMAL;
    private String colour = "-fx-border-color:white; -fx-background-color: black;";


    public Settings() {
    }

    public ButtonSize getButtonSize() {
        return buttonSize;
    }

    public void setButtonSize(ButtonSize buttonSize) {
        this.buttonSize = buttonSize;
    }

    public FontWeight getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

