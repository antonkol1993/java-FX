package piatnashki_new.controller;

import javafx.stage.Stage;
import piatnashki_new.model.MainMenuModel;
import piatnashki_new.model.Model;
import piatnashki_new.model.SettingsModel;
import piatnashki_new.service.ButtonsSizes;
import piatnashki_new.view.MainMenuView;
import piatnashki_new.view.SettingsView;

public class SettingsController extends AbstractController<SettingsModel, SettingsView> {

    private final Stage stage;
    private SettingsModel settingsModel;
    private SettingsView settingsView;


    public SettingsController(Stage stage) {
        super(stage);
        this.stage = stage;
        settingsModel = prepareModel();
        settingsView = new SettingsView(settingsModel);
    }

    private SettingsModel prepareModel() {
//        settingsModel = SettingsModel.builder().withOnSmallAction(e -> (ButtonsSizes.getInstance().getSmallButton() ))
//                .SettingsModel.builder().wit

        return settingsModel;
    }

}
