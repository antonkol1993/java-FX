package piatnashki_new.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import piatnashki_new.model.MainMenuModel;
import piatnashki_new.model.SettingsTab;

public class MainMenuView implements View {


    private final MainMenuModel model;
    private final Label label = new Label();
    private Button newGameButton;
    private Button settingsButton;
    private Button exitGameButton;

    public MainMenuView(MainMenuModel model) {
        this.model = model;
    }



    @Override
    public Parent getView() {




        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.BEIGE));


        int newSize = model.getSettings().getButtonType().getSize();
        FontWeight fontWeight = model.getSettings().getFontWeight();
        Paint textColour = model.getSettings().getTextColour();
        label.setText("Game 15");
        label.setFont(Font.font(null, fontWeight, newSize));
        label.setTextFill(textColour);

        vBox.getChildren().add(label);

        newGameButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("New game").
                withOnAction(model.getOnNewGameAction()).
                withTextColour(model.getSettings().getTextColour()).
                build();
        vBox.getChildren().add(newGameButton);

        settingsButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Settings").
                withOnAction(model.getOnSettingsAction()).
                withTextColour(model.getSettings().getTextColour()).
                build();
        vBox.getChildren().add(settingsButton);

        exitGameButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Exit").
                withOnAction(model.getOnExitAction()).
                withTextColour(model.getSettings().getTextColour()).
                build();
        vBox.getChildren().add(exitGameButton);

        return vBox;
    }

    @Override
    public void refresh() {
        //do nothing
    }
}
