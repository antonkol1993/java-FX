package piatnashki_new.service;

import com.anarut.gamefifteen.Constants;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class PiatnashkiButtons extends Button {


    public PiatnashkiButtons() {
        ButtonsSizes.getInstance();
        setFont(Font.font(ButtonsSizes.getInstance().getSizeButton()));
        setPrefWidth(Constants.BUTTON_PREF_WIDTH * ((double) ButtonsSizes.getInstance().getSizeButton() / 8));
    }



}
