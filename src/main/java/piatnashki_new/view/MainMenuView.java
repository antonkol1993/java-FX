package piatnashki_new.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import piatnashki_new.model.MainMenuModel;

public class MainMenuView implements View {


    private final MainMenuModel model;
    private final Label label = new Label();

    public MainMenuView(MainMenuModel model) {
        this.model = model;
    }



    @Override
    public Parent getView() {
        Button newGameButton;
        Button settingsButton;
        Button exitGameButton;


        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.BEIGE));


        label.setText("Game 15");
        vBox.getChildren().add(label);

        newGameButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("New game").
                withOnAction(model.getOnNewGameAction()).
                build();
        vBox.getChildren().add(newGameButton);

        settingsButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Settings").
                withOnAction(model.getOnSettingsAction()).
                build();
        vBox.getChildren().add(settingsButton);

        exitGameButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Settings").
                withOnAction(model.getOnExitAction()).
                build();
        vBox.getChildren().add(exitGameButton);

        return vBox;
    }

    @Override
    public void refresh() {
        //do nothing
    }
}
