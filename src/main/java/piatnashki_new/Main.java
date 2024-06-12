package piatnashki_new;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import piatnashki_new.controller.service.GameBoardService;
import piatnashki_new.model.MainMenuModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MainMenuModel.Builder builder = MainMenuModel.builder();
//        builder.setOnNewGameAction(e -> System.out.println());
//        builder.setOnExitAction(event -> System.out.println());
//        MainMenuModel mainMenuModel = builder.build();


        MainMenuModel mainMenuModel = MainMenuModel.builder()
                .withOnNewGameAction(e -> System.out.println())
                .withOnExitAction(event -> System.out.println())
                .build();

    }
}
