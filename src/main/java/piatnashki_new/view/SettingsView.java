package piatnashki_new.view;

import com.anarut.gamefifteen.Constants;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import piatnashki_new.model.SettingsModel;

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


//        Button smallButton = new Button();
//        smallButton.setText("Small");
//        smallButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
//        smallButton.setOnAction(model.getOnNewGameAction());
//        vBox.getChildren().add(smallButton);


//        Button medium = new Button();
//        medium.setText("Medium");
//        medium.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
//        medium.setOnAction(model.getOnExitAction());
//        vBox.getChildren().add(medium);

        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        scene.setFill(Color.GOLD);
        return vBox;

    }

    @Override
    public void refresh() {

    }
}
