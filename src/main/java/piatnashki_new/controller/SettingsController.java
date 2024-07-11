package piatnashki_new.controller;

import javafx.stage.Stage;
import piatnashki_new.model.SettingsModel;
import piatnashki_new.model.SettingsTab;
import piatnashki_new.enums_properties.ButtonFont;
import piatnashki_new.enums_properties.ButtonSize;
import piatnashki_new.enums_properties.ButtonTextColour;
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
                withOnTextColourAction(e -> {
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
                    settingsService.updateTextColour(ButtonTextColour.BLACK.getTextColour());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                }).
                withOnRedAction(e -> {
                    settingsService.updateTextColour(ButtonTextColour.RED.getTextColour());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnGreenAction(e -> {
                    settingsService.updateTextColour(ButtonTextColour.GREEN.getTextColour());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnThinFontAction(e -> {
                    settingsService.updateFontWeight(ButtonFont.THIN_FONT.getFont());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnMediumFontAction(e -> {
                    settingsService.updateFontWeight(ButtonFont.MEDIUM_FONT.getFont());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnBoldFontAction(e -> {
                    settingsService.updateFontWeight(ButtonFont.BOLD_FONT.getFont());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                })
                .build();

        view = new SettingsView(model);
    }


}
