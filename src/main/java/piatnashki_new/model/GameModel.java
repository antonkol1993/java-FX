package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import piatnashki_new.model.gameBoard.GameBoard;

public class GameModel implements Model {

    private EventHandler<ActionEvent> onMoveAction;
    private final GameBoard gameBoard;
    private Settings settings;
    private EventHandler<ActionEvent> onBackAction;

    public GameModel(EventHandler<ActionEvent> onMoveAction, GameBoard gameBoard, Settings settings, EventHandler<ActionEvent> onBackAction) {

        this.onMoveAction = onMoveAction;
        this.gameBoard = gameBoard;
        this.settings = settings;
        this.onBackAction = onBackAction;
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

    public EventHandler<ActionEvent> getOnBackAction() {
        return onBackAction;
    }

    public static Builder builder() {
        return new GameModel.Builder();
    }

    public static class Builder {


        EventHandler<ActionEvent> onMoveAction;
        GameBoard gameBoard;
        Settings settings;
        EventHandler<ActionEvent> onBackAction;

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
        public Builder withOnBackAction(EventHandler<ActionEvent> onBackAction) {
            this.onBackAction = onBackAction;
            return this;
        }




        public GameModel build () {
            return new GameModel(onMoveAction, gameBoard, settings,onBackAction );
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
