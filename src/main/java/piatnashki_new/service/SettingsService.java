package piatnashki_new.service;

import javafx.scene.text.FontWeight;
import piatnashki_new.model.Settings;

public class SettingsService {

    private Settings settings = new Settings();
    private static SettingsService instance = new SettingsService();

    public static SettingsService getInstance() {
        return instance;
    }

    public Settings getSettings(){
        return settings;
    }

    public void updateButtonType(ButtonSize buttonType) {
        settings.setButtonType(buttonType);
    }

    public void updateFontWeight(FontWeight fontWeight) {
        settings.setFontWeight(fontWeight);
    }



}
