package piatnashki_new.view;

import com.anarut.gamefifteen.Constants;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import piatnashki_new.model.MainMenuModel;
import piatnashki_new.service.PiatnashkiButtons;

public class MainMenuView {


    private final MainMenuModel model;
    private final Label label = new Label();

    public MainMenuView(MainMenuModel model) {
        this.model = model;
    }

    public Scene getMainMenu() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.BEIGE));


        label.setText("Game 15");
        vBox.getChildren().add(label);

        PiatnashkiButtons newGameButton = new PiatnashkiButtons();
        newGameButton.setText("New game");
        newGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        newGameButton.setOnAction(model.getOnNewGameAction());
        vBox.getChildren().add(newGameButton);

        PiatnashkiButtons settingsButton = new PiatnashkiButtons();
        settingsButton.setText("Settings");
        settingsButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        settingsButton.setOnAction(model.getOnSettingsAction());
        vBox.getChildren().add(settingsButton);

        PiatnashkiButtons exitGameButton = new PiatnashkiButtons();
        exitGameButton.setText("Exit Game");
        exitGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        exitGameButton.setOnAction(model.getOnExitAction());
        vBox.getChildren().add(exitGameButton);

        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        scene.setFill(Color.GOLD);
        return scene;
    }


}
