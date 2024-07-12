package piatnashki_new.enums_properties;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public enum ButtonBackgroundColour {

    LIGHT_GREY(Color.LIGHTGREY),
    VIOLET(Color.VIOLET),
    PINK(Color.PINK);

    private final Paint backgroundColour;


    ButtonBackgroundColour(Paint textColour) {
        this.backgroundColour = textColour;
    }

    public Paint getBackgroundColour() {
        return backgroundColour;
    }

}
