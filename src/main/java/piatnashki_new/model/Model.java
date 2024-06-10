package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import piatnashki_new.controller.service.GameBoardService;

public class Model {

    private EventHandler<ActionEvent> onNewGameAction;
    private EventHandler<ActionEvent> onExitAction;
    private EventHandler<ActionEvent> onRefreshAction;
    private EventHandler<ActionEvent> onMoveAction;
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

    public EventHandler<ActionEvent> getOnMoveAction(int value) {
        GameBoardService.getInstance().setMoveNumber(value);
        return onMoveAction;
    }

    public void setOnMoveAction(EventHandler<ActionEvent> onMoveAction) {
        this.onMoveAction = onMoveAction;
    }

    public String getLabelText() {
        return labelText;
    }

    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }


}
