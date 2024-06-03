module com.anarut.gamefifteen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.anarut.gamefifteen to javafx.fxml;
    exports com.anarut.gamefifteen;
    exports com.anarut.gamefifteen.view;
    opens com.anarut.gamefifteen.view to javafx.fxml;
    exports com.anarut.gamefifteen.gameboard.back.end;
    opens com.anarut.gamefifteen.gameboard.back.end to javafx.fxml;
//    exports com.anarut.gamefifteen.button;
//    opens com.anarut.gamefifteen.button to javafx.fxml;
    exports com.anarut.gamefifteen.button.settings;
    opens com.anarut.gamefifteen.button.settings to javafx.fxml;
    exports com.anarut.gamefifteen.x;
    opens com.anarut.gamefifteen.x to javafx.fxml;

}