package piatnashki_new.controller;

import javafx.scene.Scene;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import piatnashki_new.model.SettingsModel;
import piatnashki_new.model.SettingsTab;
import piatnashki_new.service.ButtonSize;
import piatnashki_new.service.SettingsService;
import piatnashki_new.view.SettingsView;

public class SettingsController extends AbstractController<SettingsModel, SettingsView> {

    private SettingsService settingsService = SettingsService.getInstance();

    public SettingsController(Stage stage) {
        super(stage);

        model = SettingsModel.builder()
                .withSettings(settingsService.getSettings())
                .withSettingsTab(SettingsTab.SIZE)
                .withOnSmallSizeAction(e -> {
                    settingsService.updateButtonType(ButtonSize.SMALL);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnMediumSizeAction(e -> {
                    settingsService.updateButtonType(ButtonSize.MEDIUM);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnLargeSizeAction(e -> {
                    settingsService.updateButtonType(ButtonSize.LARGE);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnBackAction(e -> {
                    new MainMenuController(stage).show();
                })
                .withOnSizeAction(e -> {
                    model.setSettingsTab(SettingsTab.SIZE);
                    view.refresh();

                }).
                withOnColourAction(e -> {
                    model.setSettingsTab(SettingsTab.COLOUR);
                    view.refresh();
                }).
                withOnSyncLabelAction(e -> {


                }).
                withOnFontAction(e -> {
                    model.setSettingsTab(SettingsTab.FONT);
                    view.refresh();
                }).
                withOnBlackAction(e -> {
                    //TODO: update global settings
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                }).
                withOnRedAction(e -> {


                }).
                withOnWhiteAction(e -> {


                })
                .build();

        view = new SettingsView(model);
    }


}
