package piatnashki_new.x.view;

import com.anarut.gamefifteen.Constants;
import com.anarut.gamefifteen.button.settings.GameMenuButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import piatnashki_new.x.model.Model;

public class View {

    public Button newGameButton = new GameMenuButton();
    private final Model model;

    public View(Model model) {
        this.model = model;
    }

    public Scene getScene() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(Background.fill(Color.BEIGE));

        Label titleLabel = new Label();
        titleLabel.setText("Game 15");
        vBox.getChildren().add(titleLabel);

        newGameButton.setText(model.getNewGameText());
        newGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        newGameButton.setOnAction(model.getOnNewGameAction());
        vBox.getChildren().add(newGameButton);

        Button exitGameButton = new GameMenuButton();
        exitGameButton.setText("Exit Game");
        exitGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        exitGameButton.setOnAction(model.getOnExitAction());
        vBox.getChildren().add(exitGameButton);

        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        scene.setFill(Color.GOLD);
        return scene;
    }

    public void refresh() {
        newGameButton.setText(model.getNewGameText());
        newGameButton.setOnAction(model.getOnNewGameAction());
    }

}
