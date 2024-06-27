package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Objects;

public class MainMenuModel implements Model {
    private final EventHandler<ActionEvent> onNewGameAction;
    private final EventHandler<ActionEvent> onExitAction;
    private final EventHandler<ActionEvent> onSettingsAction;
    private Settings settings;

    private MainMenuModel(EventHandler<ActionEvent> onNewGameAction,
                          EventHandler<ActionEvent> onExitAction,
                          EventHandler<ActionEvent> onSettingsAction,
                          Settings settings) {
        Objects.requireNonNull(onNewGameAction, "onNewGameAction can't be null");
        Objects.requireNonNull(onExitAction, "onExitAction can't be null");

        this.onNewGameAction = onNewGameAction;
        this.onExitAction = onExitAction;
        this.onSettingsAction = onSettingsAction;
        this.settings = settings;
    }

    public EventHandler<ActionEvent> getOnNewGameAction() {
        return onNewGameAction;
    }

    public EventHandler<ActionEvent> getOnExitAction() {
        return onExitAction;
    }
    public EventHandler<ActionEvent> getOnSettingsAction() {
        return onSettingsAction;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private EventHandler<ActionEvent> onNewGameAction;
        private EventHandler<ActionEvent> onExitAction;
        private EventHandler<ActionEvent> onSettingsAction;
        private Settings settings;
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
        public Builder withOnSettingsAction(EventHandler<ActionEvent> onSettingsAction) {
            this.onSettingsAction = onSettingsAction;
            return this;
        }

        public Builder withSettings(Settings settings) {
            this.settings = settings;
            return this;
        }

        public MainMenuModel build() {
            return new MainMenuModel(onNewGameAction, onExitAction, onSettingsAction, settings);
        }
    }
}
