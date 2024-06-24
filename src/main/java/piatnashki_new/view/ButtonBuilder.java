package piatnashki_new.view;

import com.anarut.gamefifteen.Constants;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ButtonBuilder {

    private int fontSize = 12;
    private String text = "-";
    private EventHandler<ActionEvent> onAction;
    private FontWeight fontWeight = FontWeight.NORMAL;

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

    public Button build() {
        Button button = new Button();
        button.setFont(Font.font(null, fontWeight, fontSize));
        button.setText(text);
        button.setPrefWidth(Constants.BUTTON_PREF_WIDTH);
        button.setOnAction(onAction);
        button.setOnAction(e -> System.out.println());
//        button.setStyle(button.getStyle() + "; -fx-font-weight: %s".formatted(fontWeight));
        return button;
    }
}
