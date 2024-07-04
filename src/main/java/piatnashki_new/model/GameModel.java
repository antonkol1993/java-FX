package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import piatnashki_new.model.gameBoard.GameBoard;

import java.util.function.Function;

public class GameModel implements Model {

    private EventHandler<ActionEvent> onMoveAction;
    private final GameBoard gameBoard;
    private Settings settings;

    public GameModel(EventHandler<ActionEvent> onMoveAction, GameBoard gameBoard, Settings settings) {

        this.onMoveAction = onMoveAction;
        this.gameBoard = gameBoard;
        this.settings = settings;
    }

    public EventHandler<ActionEvent> getOnMoveAction() {
        return onMoveAction;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public Settings getSettings() {
        return settings;
    }

    public static Builder builder() {
        return new GameModel.Builder();
    }

    public static class Builder {


        EventHandler<ActionEvent> onMoveAction;
        GameBoard gameBoard;
        Settings settings;

        private Builder() {
        }

        public Builder withGameboard (GameBoard gameBoard) {
            this.gameBoard = gameBoard;
            return this;
        }

        public Builder withOnMoveAction(EventHandler<ActionEvent> onMoveAction) {
            this.onMoveAction = onMoveAction;
            return this;
        }

        public Builder withSettings(Settings settings) {
            this.settings = settings;
            return this;
        }




        public GameModel build () {
            return new GameModel(onMoveAction, gameBoard, settings);
        }

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
