module com.anarut.gamefifteen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anarut.gamefifteen to javafx.fxml;
    exports com.anarut.gamefifteen;
    exports com.anarut.gamefifteen.view;
    opens com.anarut.gamefifteen.view to javafx.fxml;
    exports com.anarut.gamefifteen.GameboardBackEnd;
    opens com.anarut.gamefifteen.GameboardBackEnd to javafx.fxml;
}