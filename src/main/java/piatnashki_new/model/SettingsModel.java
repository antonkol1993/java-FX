package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Objects;
import java.util.function.Function;

public class SettingsModel implements Model {

    private Settings settings;
    private final EventHandler<ActionEvent> onSmallAction;
    private final EventHandler<ActionEvent> onMediumAction;
    private final EventHandler<ActionEvent> onLargeAction;
    private final EventHandler<ActionEvent> onBackAction;
    private SettingsModel(Settings settings,
                          EventHandler<ActionEvent> onSmallAction,
                          EventHandler<ActionEvent> onMediumAction,
                          EventHandler<ActionEvent> onLargeAction,
                          EventHandler<ActionEvent> onBackAction) {
        Objects.requireNonNull(settings, "settings can't be null");
        Objects.requireNonNull(onSmallAction, "onSmallAction can't be null");
        Objects.requireNonNull(onMediumAction, "onMediumAction can't be null");
        Objects.requireNonNull(onLargeAction, "onLargeAction can't be null");
        Objects.requireNonNull(onBackAction, "onBackAction can't be null");

        this.settings = settings;
        this.onSmallAction = onSmallAction;
        this.onMediumAction = onMediumAction;
        this.onLargeAction = onLargeAction;
        this.onBackAction = onBackAction;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public EventHandler<ActionEvent> getOnSmallAction() {
        return onSmallAction;
    }

    public EventHandler<ActionEvent> getOnMediumAction() {
        return onMediumAction;
    }

    public EventHandler<ActionEvent> getOnLargeAction() {
        return onLargeAction;
    }

    public EventHandler<ActionEvent> getOnBackAction() {
        return onBackAction;
    }

    public static Builder builder() {
        return new SettingsModel.Builder();
    }
    public static class Builder {
        private Settings settings;
        private EventHandler<ActionEvent> onSmallAction;
        private EventHandler<ActionEvent> onMediumAction;
        private EventHandler<ActionEvent> onLargeAction;
        private EventHandler<ActionEvent> onBackAction;
        private Builder() {
        }

        public Builder withSettings(Settings settings) {
            this.settings = settings;
            return this;
        }

        public Builder withOnSmallAction(EventHandler<ActionEvent> onSmallAction) {
            this.onSmallAction = onSmallAction;
            return this;
        }

        public Builder withOnMediumAction(EventHandler<ActionEvent> onMediumAction) {
            this.onMediumAction = onMediumAction;
            return this;
        }
        public Builder withOnLargeAction(EventHandler<ActionEvent> onLargeAction) {
            this.onLargeAction = onLargeAction;
            return this;
        }
        public Builder withOnBackAction(EventHandler<ActionEvent> onBackAction) {
            this.onBackAction = onBackAction;
            return this;
        }

        public SettingsModel build() {
            return new SettingsModel(settings, onSmallAction, onMediumAction, onLargeAction,onBackAction);
        }
    }

}
