package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Objects;

public class SettingsModel implements Model {

    private Settings settings;
    private final EventHandler<ActionEvent> onSmallAction;
    private final EventHandler<ActionEvent> onMediumAction;
    private final EventHandler<ActionEvent> onLargeAction;
    private final EventHandler<ActionEvent> onBackAction;
    private final EventHandler<ActionEvent> onSizeAction;
    private final EventHandler<ActionEvent> onColourAction;
    private final EventHandler<ActionEvent> onSyncLabelAction;
    private final EventHandler<ActionEvent> onBlackAction;
    private final EventHandler<ActionEvent> onRedAction;
    private final EventHandler<ActionEvent> onWhiteAction;

    private SettingsModel(Settings settings,
                          EventHandler<ActionEvent> onSmallAction,
                          EventHandler<ActionEvent> onMediumAction,
                          EventHandler<ActionEvent> onLargeAction,
                          EventHandler<ActionEvent> onBackAction,
                          EventHandler<ActionEvent> onSizeAction,
                          EventHandler<ActionEvent> onColourAction,
                          EventHandler<ActionEvent> onSyncLabelAction,
                          EventHandler<ActionEvent> onBlackAction,
                          EventHandler<ActionEvent> onRedAction,
                          EventHandler<ActionEvent> onWhiteAction
    ) {
        Objects.requireNonNull(settings, "settings can't be null");
        Objects.requireNonNull(onSmallAction, "onSmallAction can't be null");
        Objects.requireNonNull(onMediumAction, "onMediumAction can't be null");
        Objects.requireNonNull(onLargeAction, "onLargeAction can't be null");
        Objects.requireNonNull(onBackAction, "onBackAction can't be null");
        Objects.requireNonNull(onSizeAction, "onSizeAction can't be null");
        Objects.requireNonNull(onColourAction, "onColourAction can't be null");
        Objects.requireNonNull(onSyncLabelAction, "onSyncLabelAction can't be null");
        Objects.requireNonNull(onBlackAction, "onBlackAction can't be null");
        Objects.requireNonNull(onRedAction, "onRedAction can't be null");
        Objects.requireNonNull(onWhiteAction, "onWhiteAction can't be null");

        this.settings = settings;
        this.onSmallAction = onSmallAction;
        this.onMediumAction = onMediumAction;
        this.onLargeAction = onLargeAction;
        this.onBackAction = onBackAction;
        this.onSizeAction = onSizeAction;
        this.onColourAction = onColourAction;
        this.onSyncLabelAction = onSyncLabelAction;
        this.onBlackAction = onBlackAction;
        this.onRedAction = onRedAction;
        this.onWhiteAction = onWhiteAction;
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

    public EventHandler<ActionEvent> getOnBlackAction() {
        return onBlackAction;
    }

    public EventHandler<ActionEvent> getOnRedAction() {
        return onRedAction;
    }

    public EventHandler<ActionEvent> getOnWhiteAction() {
        return onWhiteAction;
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
        private EventHandler<ActionEvent> onBlackAction;
        private EventHandler<ActionEvent> onRedAction;
        private EventHandler<ActionEvent> onWhiteAction;

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

        public Builder withOnBlackAction(EventHandler<ActionEvent> onBlackAction) {
            this.onBlackAction = onBlackAction;
            return this;
        }

        public Builder withOnRedAction(EventHandler<ActionEvent> onRedAction) {
            this.onRedAction = onRedAction;
            return this;
        }

        public Builder withOnWhiteAction(EventHandler<ActionEvent> onWhiteAction) {
            this.onWhiteAction = onWhiteAction;
            return this;
        }

        public SettingsModel build() {
            return new SettingsModel(settings, onSmallAction, onMediumAction, onLargeAction, onBackAction, onSizeAction,
                    onColourAction, onSyncLabelAction, onBlackAction, onRedAction, onWhiteAction
            );
        }
    }

}
