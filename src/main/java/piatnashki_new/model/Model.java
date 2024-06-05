package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Model {

    private EventHandler<ActionEvent> onNewGameAction;
    private EventHandler<ActionEvent> onExitAction;
    private EventHandler<ActionEvent> onRefreshAction;
    private String labelText = "Game 15";
    public Model() {
    }

    public EventHandler<ActionEvent> getOnNewGameAction() {
        return onNewGameAction;
    }

    public void setOnNewGameAction(EventHandler<ActionEvent> onNewGameAction) {
        this.onNewGameAction = onNewGameAction;
    }

    public EventHandler<ActionEvent> getOnExitAction() {
        return onExitAction;
    }

    public void setOnExitAction(EventHandler<ActionEvent> onExitAction) {
        this.onExitAction = onExitAction;
    }

    public EventHandler<ActionEvent> getOnRefreshAction() {
        return onRefreshAction;
    }

    public void setOnRefreshAction(EventHandler<ActionEvent> onRefreshAction) {
        this.onRefreshAction = onRefreshAction;
    }

    public String getLabelText() {
        return labelText;
    }

    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }


}
