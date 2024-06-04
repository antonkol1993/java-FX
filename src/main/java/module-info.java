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
    exports piatnashki_new.x;
    opens piatnashki_new.x to javafx.fxml;
    exports piatnashki_new.x.controller;
    opens piatnashki_new.x.controller to javafx.fxml;
    exports piatnashki_new.x.model;
    opens piatnashki_new.x.model to javafx.fxml;
    exports piatnashki_new.x.view;
    opens piatnashki_new.x.view to javafx.fxml;

}