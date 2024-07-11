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

public class ButtonBuilder {

    private int fontSize = 12;
    private String text = "-";
    private EventHandler<ActionEvent> onAction;
    private FontWeight fontWeight = FontWeight.NORMAL;
    private int buttonSize = 75;
    private Paint textColour = Color.BLACK;
    private Paint buttonColour = Color.GRAY;

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

    public Button build() {
        Button button = new Button();

        button.setFont(Font.font(null, fontWeight, fontSize));
        button.setText(text);
        button.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        button.setOnAction(onAction);
        button.setTextFill(textColour);
        button.setBackground(Background.fill(buttonColour));
        return button;
    }
}
