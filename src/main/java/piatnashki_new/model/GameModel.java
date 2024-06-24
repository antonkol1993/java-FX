package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import piatnashki_new.model.gameBoard.GameBoard;

import java.util.function.Function;

public class GameModel implements Model {

    private Function<Integer, EventHandler<ActionEvent>> onMoveActionProvider;
    private EventHandler<ActionEvent> onMoveAction;
    private final GameBoard gameBoard;


    public GameModel(Function<Integer, EventHandler<ActionEvent>> onMoveActionProvider, EventHandler<ActionEvent> onMoveAction, GameBoard gameBoard) {
        this.onMoveActionProvider = onMoveActionProvider;
        this.onMoveAction = onMoveAction;
        this.gameBoard = gameBoard;
    }

    public Function<Integer, EventHandler<ActionEvent>> getOnMoveActionProvider() {
        return onMoveActionProvider;
    }

    public EventHandler<ActionEvent> getOnMoveAction() {
        return onMoveAction;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }



//    public static Builder builder() {
//        return new Builder();
//    }
//    public static class Builder {
//        private Function<Integer, EventHandler<ActionEvent>> onMoveActionProvider;
//        Integer value;
//
//        private Builder() {
//        }
//
//        public Builder withOnMoveActionProvider(Function<Integer, EventHandler<ActionEvent>> onMoveActionProvider) {
//            this.onMoveActionProvider = onMoveActionProvider;
//            return this;
//        }
//
//
//        public GameModel build() {
//            return new GameModel(onMoveActionProvider.apply());
//        }
//    }


}
