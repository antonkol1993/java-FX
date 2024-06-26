package piatnashki_new.service;

import com.anarut.gamefifteen.gameboard.back.end.GameBoardService;
import javafx.scene.text.FontWeight;
import piatnashki_new.model.Settings;

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



}
