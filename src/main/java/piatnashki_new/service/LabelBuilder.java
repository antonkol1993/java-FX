package piatnashki_new.service;

import com.anarut.gamefifteen.Constants;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LabelBuilder {

    private int fontSize = 12;
    private String text = "-";
    private EventHandler<ActionEvent> onAction;
    private FontWeight fontWeight = FontWeight.NORMAL;
    private int buttonSize = 75;
    private Paint textColour = Color.BLACK;

    public static LabelBuilder get() {
        return new LabelBuilder();
    }

    public LabelBuilder withFontSize(int fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public LabelBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public LabelBuilder withOnAction(EventHandler<ActionEvent> onAction) {
        this.onAction = onAction;
        return this;
    }

    public LabelBuilder withFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }
    // todo don't use while
    public LabelBuilder withTextColour(Paint textColour) {
        this.textColour = textColour;
        return this;
    }



    public Button build() {
        Button button = new Button();
        button.setFont(Font.font(null, fontWeight, fontSize));
        button.setText(text);
        button.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        button.setOnAction(onAction);
        button.setTextFill(textColour);
//        button.setStyle(button.getStyle() + "; -fx-font-weight: %s".formatted(fontWeight));
        return button;
    }
}
