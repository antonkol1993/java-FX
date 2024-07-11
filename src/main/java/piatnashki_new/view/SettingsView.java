package piatnashki_new.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import piatnashki_new.model.SettingsModel;
import piatnashki_new.model.SettingsTab;
import piatnashki_new.service.ButtonBuilder;

public class SettingsView implements View {
    private SettingsModel model;

    public VBox box = new VBox();
    private Label settingsLabel;
    private Button smallSizeButton;
    private Button mediumSizeButton;
    private Button largeSizeButton;
    private Button backInSizeButton;

    private Button blackButton;
    private Button redButton;
    private Button whiteButton;
    private Button backInColourButton;

    private Button thinFontButton;
    private Button mediumFontButton;
    private Button boldFontButton;
    private Button backInFontButton;

    private Button sizeButton;
    private Button textColourButton;
    private Button syncWithLabel;
    private Button fontButton;


    private Parent sizeView;
    private Parent colorView;
    private Parent textStyleView;
    private Parent fontView;

    public SettingsView(SettingsModel model) {
        this.model = model;
    }

    @Override
    public Parent getView() {

        settingsLabel = new Label();
        settingsLabel.setText("Settings");


        box.setAlignment(Pos.TOP_CENTER);
        box.getChildren().add(settingsLabel);


        GridPane headButtons = new GridPane();
        headButtons.setAlignment(Pos.CENTER);
        headButtons.setPadding(new Insets(5.0, 5.0, 5.0, 5.0));

        sizeButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Size").
                withOnAction(model.getOnSizeButtonAction()).
                withTextColour(Color.RED).
                build();
        headButtons.add(sizeButton, 0, 0);

        textColourButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Colour").
                withOnAction(model.getOnTextColourAction()).
                withTextColour(Color.BLUE).
                build();
        headButtons.add(textColourButton, 1, 0);

        fontButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Font").
                withOnAction(model.getOnFontButtonAction()).
                withTextColour(Color.ORANGE).
                build();
        headButtons.add(fontButton, 2, 0);

        syncWithLabel = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("SyncWithLabel").
//                withOnAction(model.getOnSyncLabelButtonAction()).
                withTextColour(Color.GREEN).
                build();
        headButtons.add(syncWithLabel, 3, 0);

        box.getChildren().add(headButtons);

        sizeView = sizeButtons();
        colorView = coloursButtons();
//        textStyleView = coloursButtons();
        fontView = fontView();

        Parent view = switch (model.getSettingsTab()) {
            case SIZE -> sizeView;
            case COLOUR -> colorView;
            case TEXT_STYLE -> throw new RuntimeException();
            case FONT -> fontView;
        };
        box.getChildren().add(view);
        return box;
    }


    private Parent sizeButtons() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.GRAY));

        smallSizeButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Small size")
                .withOnAction(model.getOnSmallSizeAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(smallSizeButton);

        mediumSizeButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Medium size")
                .withOnAction(model.getOnMediumSizeAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(mediumSizeButton);

        largeSizeButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Large size")
                .withOnAction(model.getOnLargeSizeAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(largeSizeButton);

        backInSizeButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(backInSizeButton);
        return vBox;
    }

    private Parent coloursButtons() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.OLDLACE));

        blackButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Black")
                .withOnAction(model.getOnBlackAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(blackButton);


        redButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Red")
                .withOnAction(model.getOnRedAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(redButton);


        whiteButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Green")
                .withOnAction(model.getOnGreenAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(whiteButton);


        backInColourButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(backInColourButton);
        return vBox;
    }

    private Parent fontView() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.OLDLACE));

        thinFontButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Thin font")
                .withOnAction(model.getOnThinFontAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(thinFontButton);


        mediumFontButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Medium font")
                .withOnAction(model.getOnMediumFontAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(mediumFontButton);


        boldFontButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Bold font")
                .withOnAction(model.getOnBoldFontAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(boldFontButton);


        backInFontButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();

        vBox.getChildren().add(backInFontButton);
        return vBox;
    }

    @Override
    public void refresh() {
        int newSize = model.getSettings().getButtonType().getSize();
        FontWeight fontWeight = model.getSettings().getFontWeight();
        SettingsTab settingsTab = model.getSettingsTab();
        Paint textColour = model.getSettings().getTextColour();

        settingsLabel.setFont(Font.font(null, fontWeight, newSize));
        settingsLabel.setTextFill(textColour);

        // submenu area
        sizeButton.setFont(Font.font(null, fontWeight, newSize));
        sizeButton.setTextFill(Color.RED);
        textColourButton.setFont(Font.font(null, fontWeight, newSize));
        textColourButton.setTextFill(Color.BLUE);
        fontButton.setFont(Font.font(null, fontWeight, newSize));
        fontButton.setTextFill(Color.ORANGE);
        syncWithLabel.setFont(Font.font(null, fontWeight, newSize));
        syncWithLabel.setTextFill(Color.GREEN);

        // size menu area
        smallSizeButton.setFont(Font.font(null, fontWeight, newSize));
        smallSizeButton.setTextFill(textColour);
        mediumSizeButton.setFont(Font.font(null, fontWeight, newSize));
        mediumSizeButton.setTextFill(textColour);
        largeSizeButton.setFont(Font.font(null, fontWeight, newSize));
        largeSizeButton.setTextFill(textColour);
        backInSizeButton.setFont(Font.font(null, fontWeight, newSize));
        backInSizeButton.setTextFill(textColour);


        // color menu area
        blackButton.setFont(Font.font(null, fontWeight, newSize));
        blackButton.setTextFill(textColour);
        redButton.setFont(Font.font(null, fontWeight, newSize));
        redButton.setTextFill(textColour);
        whiteButton.setFont(Font.font(null, fontWeight, newSize));
        whiteButton.setTextFill(textColour);
        backInColourButton.setFont(Font.font(null, fontWeight, newSize));
        backInColourButton.setTextFill(textColour);

        thinFontButton.setFont(Font.font(null, fontWeight, newSize));
        thinFontButton.setTextFill(textColour);
        mediumFontButton.setFont(Font.font(null, fontWeight, newSize));
        mediumFontButton.setTextFill(textColour);
        boldFontButton.setFont(Font.font(null, fontWeight, newSize));
        boldFontButton.setTextFill(textColour);
        backInFontButton.setFont(Font.font(null, fontWeight, newSize));
        backInFontButton.setTextFill(textColour);

        Parent view = switch (settingsTab) {
            case SIZE -> sizeView;
            case COLOUR -> colorView;
            case TEXT_STYLE -> throw new RuntimeException();
            case FONT -> fontView;
        };
        box.getChildren().remove(2);
        box.getChildren().add(view);
//        view.refresh(); // при выносе в отдельный класс


    }
}
