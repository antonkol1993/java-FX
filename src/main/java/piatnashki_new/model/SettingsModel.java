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
    private final EventHandler<ActionEvent> onSizeAction;
    private final EventHandler<ActionEvent> onColourAction;
    private final EventHandler<ActionEvent> onSyncLabelAction;
    private SettingsModel(Settings settings,
                          EventHandler<ActionEvent> onSmallAction,
                          EventHandler<ActionEvent> onMediumAction,
                          EventHandler<ActionEvent> onLargeAction,
                          EventHandler<ActionEvent> onBackAction,
                          EventHandler<ActionEvent> onSizeAction,
                          EventHandler<ActionEvent> onColourAction,
                          EventHandler<ActionEvent> onSyncLabelAction
                          ) {
        Objects.requireNonNull(settings, "settings can't be null");
        Objects.requireNonNull(onSmallAction, "onSmallAction can't be null");
        Objects.requireNonNull(onMediumAction, "onMediumAction can't be null");
        Objects.requireNonNull(onLargeAction, "onLargeAction can't be null");
        Objects.requireNonNull(onBackAction, "onBackAction can't be null");
        Objects.requireNonNull(onSizeAction, "onSizeAction can't be null");
        Objects.requireNonNull(onSizeAction, "onColourAction can't be null");
        Objects.requireNonNull(onSizeAction, "onSyncLabelAction can't be null");

        this.settings = settings;
        this.onSmallAction = onSmallAction;
        this.onMediumAction = onMediumAction;
        this.onLargeAction = onLargeAction;
        this.onBackAction = onBackAction;
        this.onSizeAction = onSizeAction;
        this.onColourAction = onColourAction;
        this.onSyncLabelAction = onSyncLabelAction;
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
    public EventHandler<ActionEvent> getOnSizeAction() {
        return onSizeAction;
    }
    public EventHandler<ActionEvent> getOnColourAction() {
        return onColourAction;
    }
    public EventHandler<ActionEvent> getOnSyncLabelAction() {
        return onSyncLabelAction;
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
        private EventHandler<ActionEvent> onSizeAction;
        private EventHandler<ActionEvent> onColourAction;
        private EventHandler<ActionEvent> onSyncLabelAction;
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
        public Builder withOnSizeAction(EventHandler<ActionEvent> onSizeAction) {
            this.onSizeAction = onSizeAction;
            return this;
        }

        public Builder withOnColourAction(EventHandler<ActionEvent> onColourAction) {
            this.onColourAction = onColourAction;
            return this;
        }

        public Builder withOnSyncLabelAction(EventHandler<ActionEvent> onSyncLabelAction) {
            this.onSyncLabelAction = onSyncLabelAction;
            return this;
        }

        public SettingsModel build() {
            return new SettingsModel(settings, onSmallAction, onMediumAction, onLargeAction,onBackAction, onSizeAction,
                    onColourAction, onSyncLabelAction
                    );
        }
    }

}
