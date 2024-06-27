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
import piatnashki_new.model.MainMenuModel;
import piatnashki_new.service.ButtonType;

public class MainMenuView implements View {


    private final MainMenuModel model;
    private final Label label = new Label();

    public MainMenuView(MainMenuModel model) {
        this.model = model;
    }

    Button newGameButton;
    Button settingsButton;
    Button exitGameButton;

    @Override
    public Parent getView() {
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
                build()
        ;

//        PiatnashkiButtons settingsButton = new PiatnashkiButtons();
//        settingsButton.setText("Settings");
//        settingsButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
//        settingsButton.setOnAction(model.getOnSettingsAction());
//        vBox.getChildren().add(settingsButton);
//
//        PiatnashkiButtons exitGameButton = new PiatnashkiButtons();
//        exitGameButton.setText("Exit Game");
//        exitGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
//        exitGameButton.setOnAction(model.getOnExitAction());
//        vBox.getChildren().add(exitGameButton);

        return vBox;
    }

    @Override
    public void refresh() {
        //do nothing
    }
}
