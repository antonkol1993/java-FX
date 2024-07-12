package piatnashki_new.service;

import javafx.scene.paint.Paint;
import javafx.scene.text.FontWeight;
import piatnashki_new.enums_properties.GameButtonSize;
import piatnashki_new.model.Settings;
import piatnashki_new.enums_properties.ButtonSize;

public class SettingsService {

    private Settings settings = new Settings();
    private static SettingsService instance;

    private SettingsService() {
    }


    public static SettingsService getInstance() {
        if (instance == null) {
            instance = new SettingsService();
        }
        return instance;
    }

    public Settings getSettings(){
        return settings;
    }


    public void updateButtonType(ButtonSize buttonSize) {
        settings.setButtonType(buttonSize);
    }
    public void updateFontWeight(FontWeight fontWeight) {
        settings.setFontWeight(fontWeight);
    }
    public void updateTextColour(Paint textColour) {
        settings.setTextColour(textColour);
    }
    public void updateBackgroundColour(Paint backgroundColour) {
        settings.setBackgroundColour(backgroundColour);
    }
    public void updateSizeInGameBoard(GameButtonSize size) {
        settings.setSizeInGameBoard(size);
    }



}
