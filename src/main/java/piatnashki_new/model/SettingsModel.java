package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Objects;
import java.util.function.Function;

public class SettingsModel implements Model {



    private EventHandler<ActionEvent> onSmallAction;
    private EventHandler<ActionEvent> onMediumAction;
    private EventHandler<ActionEvent> onLargeAction;

    private SettingsModel(EventHandler<ActionEvent> onSmallAction,
                          EventHandler<ActionEvent> onMediumAction,
                          EventHandler<ActionEvent> onLargeAction) {
        Objects.requireNonNull(onSmallAction, "onSmallAction can't be null");
        Objects.requireNonNull(onMediumAction, "onMediumAction can't be null");
        Objects.requireNonNull(onLargeAction, "onLargeAction can't be null");

        this.onSmallAction = onSmallAction;
        this.onMediumAction = onMediumAction;
        this.onLargeAction = onLargeAction;
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

    public static Builder builder() {
        return new SettingsModel.Builder();
    }
    public static class Builder {
        private EventHandler<ActionEvent> onSmallAction;
        private EventHandler<ActionEvent> onMediumAction;
        private EventHandler<ActionEvent> onLargeAction;
        private Builder() {
        }

        public Builder withOnSmallAction(EventHandler<ActionEvent> onSmallAction) {
            this.onSmallAction = onSmallAction;
            return this;
        }

        public Builder WithOnMediumAction(EventHandler<ActionEvent> onMediumAction) {
            this.onMediumAction = onMediumAction;
            return this;
        }
        public Builder withOnLargeAction(EventHandler<ActionEvent> onLargeAction) {
            this.onLargeAction = onLargeAction;
            return this;
        }

        public SettingsModel build() {
            return new SettingsModel(onSmallAction, onMediumAction, onLargeAction);
        }
    }

    @Override
    public Function<Integer, EventHandler<ActionEvent>> move(int a) {
        return null;
    }





}
