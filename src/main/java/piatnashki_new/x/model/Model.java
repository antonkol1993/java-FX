package piatnashki_new.x.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import piatnashki_new.x.controller.Service.GameBoardService;
import piatnashki_new.x.model.GameBoard.GameBoard;

public class Model {

    private EventHandler<ActionEvent> onNewGameAction;
    private EventHandler<ActionEvent> onExitAction;
    private EventHandler<ActionEvent> onRefreshAction;

    private String refreshText;
    private String newGameText;
    private GameBoardService gameBoardService;
    private GameBoard gameBoard;

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

    public String getRefreshText() {
        return refreshText;
    }

    public void setRefreshText(String refreshText) {
        this.refreshText = refreshText;
    }

    public String getNewGameText() {
        return newGameText;
    }

    public void setNewGameText(String newGameText) {
        this.newGameText = newGameText;
    }
}
