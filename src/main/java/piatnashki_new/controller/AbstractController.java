package piatnashki_new.controller;

import javafx.scene.Scene;
import javafx.stage.Stage;
import piatnashki_new.model.Model;
import piatnashki_new.view.View;

public abstract class AbstractController<M extends Model, V extends View> {

    public static final int V = 600;
    private final Stage stage;
    protected M model;
    protected V view;

    public AbstractController(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Scene scene = new Scene(view.getView(), V, V);
        stage.setHeight(V);
        stage.setWidth(V);
        stage.setScene(scene);
        stage.show();
    }

}
