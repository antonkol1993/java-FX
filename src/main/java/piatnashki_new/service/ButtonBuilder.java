package piatnashki_new.service;

import com.anarut.gamefifteen.Constants;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.*;
import piatnashki_new.enums_properties.ButtonBackgroundColour;
import piatnashki_new.enums_properties.GameButtonSize;

public class ButtonBuilder {

    private int fontSize = 12;
    private String text = "-";
    private EventHandler<ActionEvent> onAction;
    private FontWeight fontWeight = FontWeight.NORMAL;
    private Paint textColour = Color.BLACK;
    private Paint buttonColour = ButtonBackgroundColour.LIGHT_GREY.getBackgroundColour();
    private String styleButton = "-fx-border-color: black; -fx-border-width: 1px;";
    private double buttonSize = GameButtonSize.MEDIUM_SIZE_GAMEBUTTON.getFont();

    public static ButtonBuilder get() {
        return new ButtonBuilder();
    }

    public ButtonBuilder withFontSize(int fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public ButtonBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public ButtonBuilder withOnAction(EventHandler<ActionEvent> onAction) {
        this.onAction = onAction;
        return this;
    }

    public ButtonBuilder withFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }
    // todo don't use while
    public ButtonBuilder withTextColour(Paint textColour) {
        this.textColour = textColour;
        return this;
    }

    public ButtonBuilder withButtonColour(Paint buttonColour) {
        this.buttonColour = buttonColour;
        return this;
    }
    public ButtonBuilder withButtonStyle(String styleButton) {
        this.styleButton = styleButton;
        return this;
    }
    public ButtonBuilder withGameButtonSize(double buttonSize) {
        this.buttonSize = buttonSize;
        return this;
    }

    public Button build() {
        Button button = new Button();

        button.setFont(Font.font(null, fontWeight, fontSize));
        button.setText(text);
        button.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        button.setOnAction(onAction);
        button.setTextFill(textColour);
        button.setBackground(Background.fill(buttonColour));
        button.setStyle(styleButton);
        return button;
    }
    public Button gameBoardBuild() {
        Button button = new Button();

        button.setFont(Font.font(null, fontWeight, fontSize));
        button.setText(text);
        button.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        button.setOnAction(onAction);
        button.setTextFill(textColour);
        button.setBackground(Background.fill(buttonColour));
        button.setStyle(styleButton);
        button.setPrefSize(buttonSize,buttonSize);
        return button;
    }

}
