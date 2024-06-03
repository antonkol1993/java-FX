package com.anarut.gamefifteen.x;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Model {

    private EventHandler<ActionEvent> onNewGameAction;
    private EventHandler<ActionEvent> onExitAction;
    private String newGameText;

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

    public String getNewGameText() {
        return newGameText;
    }

    public void setNewGameText(String newGameText) {
        this.newGameText = newGameText;
    }
}
