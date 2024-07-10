package piatnashki_new.service.enums_properties;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public enum ButtonTextColour {

    RED(Color.RED),
    GREEN(Color.GREEN),
    BLACK(Color.BLACK);

    private final Paint textColour;


    ButtonTextColour(Paint textColour) {
        this.textColour = textColour;
    }

    public Paint getTextColour() {
        return textColour;
    }

}
