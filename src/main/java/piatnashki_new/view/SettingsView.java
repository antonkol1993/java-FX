package piatnashki_new.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import piatnashki_new.model.SettingsModel;

public class SettingsView implements View {

    private SettingsModel model;

    private Button smallButton;
    private Button mediumButton;
    private Button largeButton;
    private Button backButton;

    public SettingsView(SettingsModel model) {
        this.model = model;
    }

    @Override
    public Parent getView() {
        VBox vBox = new VBox();

        ObservableList<String> sections = FXCollections.observableArrayList( "","Size", "Colours", "Labels");

        ComboBox<String> langsComboBox = new ComboBox<String>(sections);
        langsComboBox.setValue(""); // устанавливаем выбранный элемент по умолчанию

        Label lbl = new Label();
        FlowPane root = new FlowPane(10, 10, langsComboBox, lbl);


        // получаем выбранный элемент
        langsComboBox.setOnAction(event -> {

                   if ((langsComboBox.getValue().equals(langsComboBox.getItems().get(1)))) {

                System.out.println("222222222");
                       vBox.getChildren().add(root);
                       vBox.getChildren().add(getSizeView());
            } else {

                   }
                }

        );

        vBox.getChildren().add(root);
        vBox.getChildren().add(getColours());




        
//        ComboBox<String> langsComboBox = new ComboBox<String>(sections);
//        ComboBox<String> langsComboBox = new ComboBox<String>(sections);
//        ComboBox<String> langsComboBox = new ComboBox<String>(sections);
//        langsComboBox.setValue("Java"); // устанавливаем выбранный элемент по умолчанию







        return vBox;
    }

    private Parent getSizeView() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.GRAY));

        Label label = new Label();
        label.setText("Settings");
        vBox.getChildren().add(label);

        smallButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Small")
                .withOnAction(model.getOnSmallAction())
                .build();
        vBox.getChildren().add(smallButton);

        mediumButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Medium")
                .withOnAction(model.getOnMediumAction())
                .build();
        vBox.getChildren().add(mediumButton);

        largeButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Large")
                .withOnAction(model.getOnLargeAction())
                .build();
        vBox.getChildren().add(largeButton);

        backButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .build();
        vBox.getChildren().add(backButton);
        return vBox;
    }
    private Parent getColours() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.OLDLACE));

        Label label = new Label();
        label.setText("Settings");
        vBox.getChildren().add(label);

        Button blackButton = new Button();
        blackButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Black")
                .withOnAction(model.getOnSmallAction())
                .build();
        vBox.getChildren().add(blackButton);

        Button redButton = new Button();
        redButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Red")
                .withOnAction(model.getOnMediumAction())
                .build();
        vBox.getChildren().add(redButton);

        Button whiteButton = new Button();
        whiteButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("White")
                .withOnAction(model.getOnLargeAction())
                .build();
        vBox.getChildren().add(whiteButton);

        Button backButton = new Button();
        backButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .build();
        vBox.getChildren().add(backButton);
        return vBox;
    }

    @Override
    public void refresh() {
        int newSize = model.getSettings().getButtonType().getSize();
        FontWeight fontWeight = model.getSettings().getFontWeight();

        smallButton.setFont(Font.font(null, fontWeight, newSize));
        mediumButton.setFont(Font.font(null, fontWeight, newSize));
        largeButton.setFont(Font.font(null, fontWeight, newSize));
        backButton.setFont(Font.font(null, fontWeight, newSize));


    }
}
