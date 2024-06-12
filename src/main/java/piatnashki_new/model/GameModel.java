package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import piatnashki_new.model.gameBoard.GameBoard;

import java.util.function.Function;

public class GameModel implements Model {

    private Function<Integer, EventHandler<ActionEvent>> onMoveActionProvider;
    private GameBoard gameBoard;


    public GameModel(Function<Integer, EventHandler<ActionEvent>> onMoveActionProvider, GameBoard gameBoard) {
        this.onMoveActionProvider = onMoveActionProvider;
        this.gameBoard = gameBoard;
    }

    public Function<Integer, EventHandler<ActionEvent>> getOnMoveActionProvider() {
        return onMoveActionProvider;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }
}
