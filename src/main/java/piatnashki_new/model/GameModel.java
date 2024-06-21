package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import piatnashki_new.model.gameBoard.GameBoard;

import java.util.function.Function;

public class GameModel implements Model {

    private Function<Integer, EventHandler<ActionEvent>> onMoveActionProvider;
    private final GameBoard gameBoard;


    public GameModel(Function<Integer, EventHandler<ActionEvent>> onMoveActionProvider, GameBoard gameBoard) {
        this.onMoveActionProvider = onMoveActionProvider;
        this.gameBoard = gameBoard;
    }

    public Function<Integer, EventHandler<ActionEvent>> getOnMoveActionProvider() {
        return onMoveActionProvider;
    }

    @Override
    public Function<Integer, EventHandler<ActionEvent>> move(int a) {
        return null;
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
