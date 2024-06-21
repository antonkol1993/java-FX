package piatnashki_new.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.function.Function;

public interface Model {

    Function<Integer, EventHandler<ActionEvent>> move (int a);
}
