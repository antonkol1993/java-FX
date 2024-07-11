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


    private final EventHandler<ActionEvent> onSizeAction;
    private final EventHandler<ActionEvent> onTextColourAction;
    private final EventHandler<ActionEvent> onSyncLabelAction;
    private final EventHandler<ActionEvent> onFontAction;

    private final EventHandler<ActionEvent> onBlackAction;
    private final EventHandler<ActionEvent> onRedAction;
    private final EventHandler<ActionEvent> onGreenAction;

    private final EventHandler<ActionEvent> onThinFontAction;
    private final EventHandler<ActionEvent> onMediumFontAction;
    private final EventHandler<ActionEvent> onBoldFontAction;

    private SettingsModel(Settings settings,
                          SettingsTab settingsTab,
                          EventHandler<ActionEvent> onSmallSizeAction,
                          EventHandler<ActionEvent> onMediumSizeAction,
                          EventHandler<ActionEvent> onLargeSizeAction,
                          EventHandler<ActionEvent> onBackAction,

                          EventHandler<ActionEvent> onSizeAction,
                          EventHandler<ActionEvent> onTextColourAction,
                          EventHandler<ActionEvent> onSyncLabelAction,
                          EventHandler<ActionEvent> onFontAction,

                          EventHandler<ActionEvent> onBlackAction,
                          EventHandler<ActionEvent> onRedAction,
                          EventHandler<ActionEvent> onGreenAction,
                          EventHandler<ActionEvent> onThinFontAction,
                          EventHandler<ActionEvent> onMediumFontAction,
                          EventHandler<ActionEvent> onBoldFontAction
    ) {
        Objects.requireNonNull(settings, "settings can't be null");
        Objects.requireNonNull(settingsTab);

        Objects.requireNonNull(onSmallSizeAction, "onSmallSizeAction can't be null");
        Objects.requireNonNull(onMediumSizeAction, "onMediumSizeAction can't be null");
        Objects.requireNonNull(onLargeSizeAction, "onLargeSizeAction can't be null");
        Objects.requireNonNull(onBackAction, "Button BACK can't be null everywhere");

        Objects.requireNonNull(onSizeAction, "onSizeAction can't be null");
        Objects.requireNonNull(onTextColourAction, "onTextColourAction can't be null");
        Objects.requireNonNull(onSyncLabelAction, "onSyncLabelAction can't be null");
        Objects.requireNonNull(onFontAction, "onFontAction can't be null");

        Objects.requireNonNull(onBlackAction, "onBlackAction can't be null");
        Objects.requireNonNull(onRedAction, "onRedAction can't be null");
        Objects.requireNonNull(onGreenAction, "onGreenAction can't be null");

        Objects.requireNonNull(onThinFontAction, "onThinFontAction can't be null");
        Objects.requireNonNull(onMediumFontAction, "onMediumFontAction can't be null");
        Objects.requireNonNull(onBoldFontAction, "onBoldFontAction can't be null");


        this.settings = settings;
        this.settingsTab = settingsTab;

        this.onSmallSizeAction = onSmallSizeAction;
        this.onMediumSizeAction = onMediumSizeAction;
        this.onLargeSizeAction = onLargeSizeAction;
        this.onBackAction = onBackAction;

        this.onSizeAction = onSizeAction;
        this.onTextColourAction = onTextColourAction;
        this.onSyncLabelAction = onSyncLabelAction;
        this.onFontAction = onFontAction;

        this.onBlackAction = onBlackAction;
        this.onRedAction = onRedAction;
        this.onGreenAction = onGreenAction;


        this.onThinFontAction = onThinFontAction;
        this.onMediumFontAction = onMediumFontAction;
        this.onBoldFontAction = onBoldFontAction;

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

    public EventHandler<ActionEvent> getOnSmallSizeAction() {
        return onSmallSizeAction;
    }

    public EventHandler<ActionEvent> getOnMediumSizeAction() {
        return onMediumSizeAction;
    }

    public EventHandler<ActionEvent> getOnLargeSizeAction() {
        return onLargeSizeAction;
    }

    public EventHandler<ActionEvent> getOnBackAction() {
        return onBackAction;
    }

    public EventHandler<ActionEvent> getOnSizeButtonAction() {
        return onSizeAction;
    }

    public EventHandler<ActionEvent> getOnTextColourAction() {
        return onTextColourAction;
    }

    public EventHandler<ActionEvent> getOnFontButtonAction() {
        return onFontAction;
    }

    public EventHandler<ActionEvent> getOnSyncLabelButtonAction() {
        return onSyncLabelAction;
    }

    public EventHandler<ActionEvent> getOnBlackAction() {
        return onBlackAction;
    }

    public EventHandler<ActionEvent> getOnRedAction() {
        return onRedAction;
    }

    public EventHandler<ActionEvent> getOnGreenAction() {
        return onGreenAction;
    }

    public EventHandler<ActionEvent> getOnThinFontAction() {
        return onThinFontAction;
    }

    public EventHandler<ActionEvent> getOnMediumFontAction() {
        return onMediumFontAction;
    }

    public EventHandler<ActionEvent> getOnBoldFontAction() {
        return onBoldFontAction;
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
        private EventHandler<ActionEvent> onTextColourAction;
        private EventHandler<ActionEvent> onSyncLabelAction;
        private EventHandler<ActionEvent> onFontAction;

        private EventHandler<ActionEvent> onBlackAction;
        private EventHandler<ActionEvent> onRedAction;
        private EventHandler<ActionEvent> onGreenAction;

        private EventHandler<ActionEvent> onThinFontAction;
        private EventHandler<ActionEvent> onMediumFontAction;
        private EventHandler<ActionEvent> onBoldFontAction;

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

        public Builder withOnTextColourAction(EventHandler<ActionEvent> onTextColourAction) {
            this.onTextColourAction = onTextColourAction;
            return this;
        }

        public Builder withOnSyncLabelAction(EventHandler<ActionEvent> onSyncLabelAction) {
            this.onSyncLabelAction = onSyncLabelAction;
            return this;
        }

        public Builder withOnFontAction(EventHandler<ActionEvent> onFontAction) {
            this.onFontAction = onFontAction;
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

        public Builder withOnGreenAction(EventHandler<ActionEvent> onGreenAction) {
            this.onGreenAction = onGreenAction;
            return this;
        }

        public Builder withOnThinFontAction(EventHandler<ActionEvent> onThinFontAction) {
            this.onThinFontAction = onThinFontAction;
            return this;
        }
        public Builder withOnMediumFontAction(EventHandler<ActionEvent> onMediumFontAction) {
            this.onMediumFontAction = onMediumFontAction;
            return this;
        }
        public Builder withOnBoldFontAction(EventHandler<ActionEvent> onBoldFontAction) {
            this.onBoldFontAction = onBoldFontAction;
            return this;
        }





        public SettingsModel build() {
            return new SettingsModel(settings, settingsTab, onSmallSizeAction, onMediumSizeAction, onLargeSizeAction,
                    onBackAction, onSizeAction, onTextColourAction, onSyncLabelAction, onFontAction, onBlackAction,
                    onRedAction, onGreenAction, onThinFontAction, onMediumFontAction, onBoldFontAction
            );
        }
    }

}
