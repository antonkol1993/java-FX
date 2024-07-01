package piatnashki_new.controller;

import javafx.scene.Scene;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import piatnashki_new.model.SettingsModel;
import piatnashki_new.service.ButtonSize;
import piatnashki_new.service.SettingsService;
import piatnashki_new.view.SettingsView;

public class SettingsController extends AbstractController<SettingsModel, SettingsView> {

    private SettingsService settingsService = SettingsService.getInstance();

    public SettingsController(Stage stage) {
        super(stage);

        model = SettingsModel.builder()
                .withSettings(settingsService.getSettings())
                .withOnSmallAction(e -> {
                    settingsService.updateButtonType(ButtonSize.SMALL);
                    settingsService.updateFontWeight(FontWeight.THIN);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnMediumAction(e -> {
                    settingsService.updateButtonType(ButtonSize.MEDIUM);
                    settingsService.updateFontWeight(FontWeight.NORMAL);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnLargeAction(e -> {
                    settingsService.updateButtonType(ButtonSize.LARGE);
                    settingsService.updateFontWeight(FontWeight.BOLD);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnBackAction(e -> {
                    new MainMenuController(stage).show();
                })
                .withOnSizeAction(e -> {


                    Scene scene = new Scene(view.getSizeView(), V, V);

                    getStage().setHeight(V);
                    getStage().setWidth(V);

                    getStage().setScene(scene);
                    getStage().show();

                }).
                withOnColourAction(e -> {


                    Scene scene = new Scene(view.getColourView(), V, V);
                    getStage().setHeight(V);
                    getStage().setWidth(V);

                    getStage().setScene(scene);
                    getStage().show();
                }).
                withOnSyncLabelAction(e -> {



                })
                .build();

        view = new SettingsView(model);
    }


}
