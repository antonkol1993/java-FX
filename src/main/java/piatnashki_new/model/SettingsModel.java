package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Objects;

public class SettingsModel implements Model {

    private Settings settings;
    private SettingsTab settingsTab;
    private final EventHandler<ActionEvent> onSmallSizeAction;
    private final EventHandler<ActionEvent> onMediumSizeAction;
    private final EventHandler<ActionEvent> onLargeSizeAction;
    private final EventHandler<ActionEvent> onBackAction;

//    private final EventHandler<ActionEvent> on;
//    private final EventHandler<ActionEvent> onBackInSizeButton;
//    private final EventHandler<ActionEvent> onBackInSizeButton;
//    private final EventHandler<ActionEvent> onBackInSizeButton;

    private final EventHandler<ActionEvent> onSizeAction;
    private final EventHandler<ActionEvent> onColourAction;
    private final EventHandler<ActionEvent> onSyncLabelAction;

    private final EventHandler<ActionEvent> onBlackAction;
    private final EventHandler<ActionEvent> onRedAction;
    private final EventHandler<ActionEvent> onWhiteAction;

    private SettingsModel(Settings settings,
                          SettingsTab settingsTab,
                          EventHandler<ActionEvent> onSmallSizeAction,
                          EventHandler<ActionEvent> onMediumSizeAction,
                          EventHandler<ActionEvent> onLargeSizeAction,
                          EventHandler<ActionEvent> onBackAction,
                          EventHandler<ActionEvent> onSizeAction,
                          EventHandler<ActionEvent> onColourAction,
                          EventHandler<ActionEvent> onSyncLabelAction,
                          EventHandler<ActionEvent> onBlackAction,
                          EventHandler<ActionEvent> onRedAction,
                          EventHandler<ActionEvent> onWhiteAction
    ) {
        Objects.requireNonNull(settings, "settings can't be null");
        Objects.requireNonNull(settingsTab);
        Objects.requireNonNull(onSmallSizeAction, "onSmallSizeAction can't be null");
        Objects.requireNonNull(onMediumSizeAction, "onMediumSizeAction can't be null");
        Objects.requireNonNull(onLargeSizeAction, "onLargeSizeAction can't be null");
        Objects.requireNonNull(onBackAction, "onBackAction can't be null");
        Objects.requireNonNull(onSizeAction, "onSizeAction can't be null");
        Objects.requireNonNull(onColourAction, "onColourAction can't be null");
        Objects.requireNonNull(onSyncLabelAction, "onSyncLabelAction can't be null");
        Objects.requireNonNull(onBlackAction, "onBlackAction can't be null");
        Objects.requireNonNull(onRedAction, "onRedAction can't be null");
        Objects.requireNonNull(onWhiteAction, "onWhiteAction can't be null");

        this.settings = settings;
        this.settingsTab = settingsTab;
        this.onSmallSizeAction = onSmallSizeAction;
        this.onMediumSizeAction = onMediumSizeAction;
        this.onLargeSizeAction = onLargeSizeAction;

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

    public SettingsTab getSettingsTab() {
        return settingsTab;
    }

    public void setSettingsTab(SettingsTab settingsTab) {
        this.settingsTab = settingsTab;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public EventHandler<ActionEvent> getOnSmallAction() {
        return onSmallSizeAction;
    }

    public EventHandler<ActionEvent> getOnMediumAction() {
        return onMediumSizeAction;
    }

    public EventHandler<ActionEvent> getOnLargeAction() {
        return onLargeSizeAction;
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

        private SettingsTab settingsTab;

        private EventHandler<ActionEvent> onSmallSizeAction;
        private EventHandler<ActionEvent> onMediumSizeAction;
        private EventHandler<ActionEvent> onLargeSizeAction;
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

        public Builder withSettingsTab(SettingsTab settingsTab) {
            this.settingsTab = settingsTab;
            return this;
        }

        public Builder withOnSmallSizeAction(EventHandler<ActionEvent> onSmallSizeAction) {
            this.onSmallSizeAction = onSmallSizeAction;
            return this;
        }

        public Builder withOnMediumSizeAction(EventHandler<ActionEvent> onMediumSizeAction) {
            this.onMediumSizeAction = onMediumSizeAction;
            return this;
        }

        public Builder withOnLargeSizeAction(EventHandler<ActionEvent> onLargeSizeAction) {
            this.onLargeSizeAction = onLargeSizeAction;
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
            return new SettingsModel(settings, settingsTab, onSmallSizeAction, onMediumSizeAction, onLargeSizeAction, onBackAction, onSizeAction,
                    onColourAction, onSyncLabelAction, onBlackAction, onRedAction, onWhiteAction
            );
        }
    }

}
