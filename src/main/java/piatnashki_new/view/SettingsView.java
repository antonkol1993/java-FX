package piatnashki_new.view;

import com.anarut.gamefifteen.Constants;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import piatnashki_new.model.SettingsModel;
import piatnashki_new.service.PiatnashkiButtons;

public class SettingsView implements View {

    SettingsModel settingsModel;

    public SettingsView(SettingsModel settingsModel) {
        this.settingsModel = settingsModel;
    }



    @Override
    public Parent getView() {

        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.GRAY));

        Label label = new Label();
        label.setText("Settings");
        vBox.getChildren().add(label);


        PiatnashkiButtons smallButton = new PiatnashkiButtons();
        smallButton.setText("Small");
        smallButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
//        smallButton.setOnAction(model.getOnNewGameAction());
        vBox.getChildren().add(smallButton);


        PiatnashkiButtons mediumButton = new PiatnashkiButtons();
        mediumButton.setText("Medium");
        mediumButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
//        mediumButton.setOnAction(model.getOnExitAction());
        vBox.getChildren().add(mediumButton);

        PiatnashkiButtons largeButton = new PiatnashkiButtons();
        largeButton.setText("Large");
        largeButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
//        largeButton.setOnAction(model.getOnExitAction());
        vBox.getChildren().add(largeButton);

        PiatnashkiButtons backButton = new PiatnashkiButtons();
        backButton.setText("Large");
        backButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
//        backButton.setOnAction(model.getOnExitAction());
        vBox.getChildren().add(backButton);

        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        scene.setFill(Color.GOLD);
        return vBox;
    }

    @Override
    public void refresh() {

    }
}
