package piatnashki_new.view;

import com.anarut.gamefifteen.Constants;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import piatnashki_new.model.MainMenuModel;

public class MainMenuView {


    private final MainMenuModel model;
    private final Button refreshButton = new Button();
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

        Button newGameButton = new Button();
        newGameButton.setText("New game");
        newGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        newGameButton.setOnAction(model.getOnNewGameAction());
        vBox.getChildren().add(newGameButton);


//        refreshButton.setText("Refresh");
//        refreshButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
//        refreshButton.setOnAction(model.getOnRefreshAction());
//        vBox.getChildren().add(refreshButton);

        Button exitGameButton = new Button();
        exitGameButton.setText("Exit Game");
        exitGameButton.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        exitGameButton.setOnAction(model.getOnExitAction());
        vBox.getChildren().add(exitGameButton);

        Scene scene = new Scene(vBox, Constants.WIDTH, Constants.HEIGHT);
        scene.setFill(Color.GOLD);
        return scene;
    }

//    public void refresh() {
//        label.setText(model.getLabelText());
//        refreshButton.setOnAction(model.getOnRefreshAction());
//    }

}
