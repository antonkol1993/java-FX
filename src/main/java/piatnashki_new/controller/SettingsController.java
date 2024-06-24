package piatnashki_new.controller;

import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import piatnashki_new.model.SettingsModel;
import piatnashki_new.service.ButtonType;
import piatnashki_new.service.SettingsService;
import piatnashki_new.view.SettingsView;

public class SettingsController extends AbstractController<SettingsModel, SettingsView> {

    private SettingsService settingsService = SettingsService.getInstance();

    public SettingsController(Stage stage) {
        super(stage);

        model = SettingsModel.builder()
                .withSettings(settingsService.getSettings())
                .withOnSmallAction(e -> {
                    settingsService.updateButtonType(ButtonType.SMALL);
                    settingsService.updateFontWeight(FontWeight.THIN);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnMediumAction(e -> {
                    settingsService.updateButtonType(ButtonType.MEDIUM);
                    settingsService.updateFontWeight(FontWeight.NORMAL);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnLargeAction(e -> {
                    settingsService.updateButtonType(ButtonType.LARGE);
                    settingsService.updateFontWeight(FontWeight.BOLD);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .build();

        view = new SettingsView(model);
    }

}
