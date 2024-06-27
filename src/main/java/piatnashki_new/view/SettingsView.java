package piatnashki_new.view;

import com.anarut.gamefifteen.Constants;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

        ObservableList<String> sections = FXCollections.observableArrayList("Size", "Colours", "Labels", "Other");

        ComboBox<String> langsComboBox = new ComboBox<String>(sections);
        langsComboBox.setValue("Size"); // устанавливаем выбранный элемент по умолчанию

        Label lbl = new Label();

        // получаем выбранный элемент
        langsComboBox.setOnAction(event -> lbl.setText(langsComboBox.getValue()));


        System.out.println(langsComboBox.getValue());

        FlowPane root = new FlowPane(10, 10, langsComboBox, lbl);
        
//        ComboBox<String> langsComboBox = new ComboBox<String>(sections);
//        ComboBox<String> langsComboBox = new ComboBox<String>(sections);
//        ComboBox<String> langsComboBox = new ComboBox<String>(sections);
//        langsComboBox.setValue("Java"); // устанавливаем выбранный элемент по умолчанию



        vBox.getChildren().add(root);



        return vBox;
    }

    private Parent sizeView () {
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
