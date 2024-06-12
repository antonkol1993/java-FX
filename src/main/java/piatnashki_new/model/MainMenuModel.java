package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Objects;

public class MainMenuModel {
    private EventHandler<ActionEvent> onNewGameAction;
    private EventHandler<ActionEvent> onExitAction;

    private MainMenuModel(EventHandler<ActionEvent> onNewGameAction,
                          EventHandler<ActionEvent> onExitAction) {
        Objects.requireNonNull(onNewGameAction, "onNewGameAction can't be null");
        Objects.requireNonNull(onExitAction, "onExitAction can't be null");

        this.onNewGameAction = onNewGameAction;
        this.onExitAction = onExitAction;
    }

    public EventHandler<ActionEvent> getOnNewGameAction() {
        return onNewGameAction;
    }

    public EventHandler<ActionEvent> getOnExitAction() {
        return onExitAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private EventHandler<ActionEvent> onNewGameAction;
        private EventHandler<ActionEvent> onExitAction;

        private Builder() {
        }

        public Builder withOnNewGameAction(EventHandler<ActionEvent> onNewGameAction) {
            this.onNewGameAction = onNewGameAction;
            return this;
        }

        public Builder withOnExitAction(EventHandler<ActionEvent> onExitAction) {
            this.onExitAction = onExitAction;
            return this;
        }

        public MainMenuModel build() {
            return new MainMenuModel(onNewGameAction, onExitAction);
        }
    }
}
