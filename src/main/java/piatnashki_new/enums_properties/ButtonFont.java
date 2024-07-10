package piatnashki_new.enums_properties;

import javafx.scene.text.FontWeight;

public enum ButtonFont {

    THIN_FONT(FontWeight.THIN),
    MEDIUM_FONT(FontWeight.MEDIUM),
    BOLD_FONT(FontWeight.BOLD);

    private final FontWeight font;


    ButtonFont(FontWeight font) {
        this.font = font;
    }

    public FontWeight getFont() {
        return font;
    }

}
