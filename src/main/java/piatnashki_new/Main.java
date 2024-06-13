package piatnashki_new;

import piatnashki_new.model.MainMenuModel;
import piatnashki_new.model.gameBoard.GameBoard;
import piatnashki_new.service.GameBoardService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        MainMenuModel.Builder builder = MainMenuModel.builder();
//        builder.setOnNewGameAction(e -> System.out.println());
//        builder.setOnExitAction(event -> System.out.println());
//        MainMenuModel mainMenuModel = builder.build();


//        MainMenuModel mainMenuModel = MainMenuModel.builder()
//                .withOnNewGameAction(e -> System.out.println())
//                .withOnExitAction(event -> System.out.println())
//                .build();

        GameBoardService gameBoardService = GameBoardService.getInstance();
        GameBoard gameBoard = gameBoardService.newGame(5,5);
        System.out.println(gameBoard);
        for(;;) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            gameBoardService.move(gameBoard,x);
            System.out.println(gameBoard);
        }

    }
}
