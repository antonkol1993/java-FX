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
    private final EventHandler<ActionEvent> onBackgroundColourAction;
    private final EventHandler<ActionEvent> onFontAction;

    private final EventHandler<ActionEvent> onBlackTextAction;
    private final EventHandler<ActionEvent> onRedTextAction;
    private final EventHandler<ActionEvent> onGreenTextAction;

    private final EventHandler<ActionEvent> onThinFontAction;
    private final EventHandler<ActionEvent> onMediumFontAction;
    private final EventHandler<ActionEvent> onBoldFontAction;

    private final EventHandler<ActionEvent> onGrayButtonAction;
    private final EventHandler<ActionEvent> onPinkButtonAction;
    private final EventHandler<ActionEvent> onVioletButtonAction;

    private SettingsModel(Settings settings,
                          SettingsTab settingsTab,
                          EventHandler<ActionEvent> onSmallSizeAction,
                          EventHandler<ActionEvent> onMediumSizeAction,
                          EventHandler<ActionEvent> onLargeSizeAction,
                          EventHandler<ActionEvent> onBackAction,

                          EventHandler<ActionEvent> onSizeAction,
                          EventHandler<ActionEvent> onTextColourAction,
                          EventHandler<ActionEvent> onBackgroundColourAction,
                          EventHandler<ActionEvent> onFontAction,

                          EventHandler<ActionEvent> onBlackAction,
                          EventHandler<ActionEvent> onRedAction,
                          EventHandler<ActionEvent> onGreenAction,
                          EventHandler<ActionEvent> onThinFontAction,
                          EventHandler<ActionEvent> onMediumFontAction,
                          EventHandler<ActionEvent> onBoldFontAction,
                          EventHandler<ActionEvent> onGrayButtonAction,
                          EventHandler<ActionEvent> onPinkButtonAction,
                          EventHandler<ActionEvent> onVioletButtonAction
    ) {
        Objects.requireNonNull(settings, "settings can't be null");
        Objects.requireNonNull(settingsTab);

        Objects.requireNonNull(onSmallSizeAction, "onSmallSizeAction can't be null");
        Objects.requireNonNull(onMediumSizeAction, "onMediumSizeAction can't be null");
        Objects.requireNonNull(onLargeSizeAction, "onLargeSizeAction can't be null");
        Objects.requireNonNull(onBackAction, "Button BACK can't be null everywhere");

        Objects.requireNonNull(onSizeAction, "onSizeAction can't be null");
        Objects.requireNonNull(onTextColourAction, "onTextColourAction can't be null");
        Objects.requireNonNull(onBackgroundColourAction, "onBackgroundColourAction can't be null");
        Objects.requireNonNull(onFontAction, "onFontAction can't be null");

        Objects.requireNonNull(onBlackAction, "onBlackAction can't be null");
        Objects.requireNonNull(onRedAction, "onRedAction can't be null");
        Objects.requireNonNull(onGreenAction, "onGreenAction can't be null");

        Objects.requireNonNull(onThinFontAction, "onThinFontAction can't be null");
        Objects.requireNonNull(onMediumFontAction, "onMediumFontAction can't be null");
        Objects.requireNonNull(onBoldFontAction, "onBoldFontAction can't be null");

        Objects.requireNonNull(onGrayButtonAction, "onGrayButtonAction can't be null");
        Objects.requireNonNull(onPinkButtonAction, "onPinkButtonAction can't be null");
        Objects.requireNonNull(onVioletButtonAction, "onVioletButtonAction can't be null");


        this.settings = settings;
        this.settingsTab = settingsTab;

        this.onSmallSizeAction = onSmallSizeAction;
        this.onMediumSizeAction = onMediumSizeAction;
        this.onLargeSizeAction = onLargeSizeAction;
        this.onBackAction = onBackAction;

        this.onSizeAction = onSizeAction;
        this.onTextColourAction = onTextColourAction;
        this.onBackgroundColourAction = onBackgroundColourAction;
        this.onFontAction = onFontAction;

        this.onBlackTextAction = onBlackAction;
        this.onRedTextAction = onRedAction;
        this.onGreenTextAction = onGreenAction;


        this.onThinFontAction = onThinFontAction;
        this.onMediumFontAction = onMediumFontAction;
        this.onBoldFontAction = onBoldFontAction;

        this.onGrayButtonAction = onGrayButtonAction;
        this.onPinkButtonAction = onPinkButtonAction;
        this.onVioletButtonAction = onVioletButtonAction;


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

    public EventHandler<ActionEvent> getOnBackgroundColourAction() {
        return onBackgroundColourAction;
    }

    public EventHandler<ActionEvent> getOnBlackTextAction() {
        return onBlackTextAction;
    }

    public EventHandler<ActionEvent> getOnRedTextAction() {
        return onRedTextAction;
    }

    public EventHandler<ActionEvent> getOnGreenTextAction() {
        return onGreenTextAction;
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

    public EventHandler<ActionEvent> getOnGrayButtonAction() {
        return onGrayButtonAction;
    }

    public EventHandler<ActionEvent> getOnPinkButtonAction() {
        return onPinkButtonAction;
    }

    public EventHandler<ActionEvent> getOnVioletButtonAction() {
        return onVioletButtonAction;
    }


    public static Builder builder() {
        return new SettingsModel.Builder();
    }

    public static class Builder {
        private Settings settings;

        private SettingsTab settingsTab;
        EventHandler<ActionEvent> onGrayButtonAction;
        EventHandler<ActionEvent> onPinkButtonAction;
        EventHandler<ActionEvent> onVioletButtonAction;


        private EventHandler<ActionEvent> onSmallSizeAction;
        private EventHandler<ActionEvent> onMediumSizeAction;
        private EventHandler<ActionEvent> onLargeSizeAction;
        private EventHandler<ActionEvent> onBackAction;

        private EventHandler<ActionEvent> onSizeAction;
        private EventHandler<ActionEvent> onTextColourAction;
        private EventHandler<ActionEvent> onBackgroundColourAction;
        private EventHandler<ActionEvent> onFontAction;

        private EventHandler<ActionEvent> onBlackTextAction;
        private EventHandler<ActionEvent> onRedTextAction;
        private EventHandler<ActionEvent> onGreenTextAction;

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

        public Builder withOnBackgroundColourAction(EventHandler<ActionEvent> onBackgroundColourAction) {
            this.onBackgroundColourAction = onBackgroundColourAction;
            return this;
        }

        public Builder withOnFontAction(EventHandler<ActionEvent> onFontAction) {
            this.onFontAction = onFontAction;
            return this;
        }


        public Builder withOnBlackAction(EventHandler<ActionEvent> onBlackAction) {
            this.onBlackTextAction = onBlackAction;
            return this;
        }

        public Builder withOnRedAction(EventHandler<ActionEvent> onRedAction) {
            this.onRedTextAction = onRedAction;
            return this;
        }

        public Builder withOnGreenAction(EventHandler<ActionEvent> onGreenAction) {
            this.onGreenTextAction = onGreenAction;
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
        public Builder withOnGrayButtonAction(EventHandler<ActionEvent> onGrayButtonAction) {
            this.onGrayButtonAction = onGrayButtonAction;
            return this;
        }
        public Builder withOnPinkButtonAction(EventHandler<ActionEvent> onPinkButtonAction) {
            this.onPinkButtonAction = onPinkButtonAction;
            return this;
        }
        public Builder withOnVioletButtonAction(EventHandler<ActionEvent> onVioletButtonAction) {
            this.onVioletButtonAction = onVioletButtonAction;
            return this;
        }



        public SettingsModel build() {
            return new SettingsModel(settings, settingsTab, onSmallSizeAction, onMediumSizeAction, onLargeSizeAction,
                    onBackAction, onSizeAction, onTextColourAction, onBackgroundColourAction, onFontAction, onBlackTextAction,
                    onRedTextAction, onGreenTextAction, onThinFontAction, onMediumFontAction, onBoldFontAction,onGrayButtonAction,
                    onPinkButtonAction,onVioletButtonAction
            );
        }
    }

}
