package piatnashki_new;

import javafx.application.Application;
import javafx.application.Platform;
import piatnashki_new.model.MainMenuModel;
import piatnashki_new.model.gameBoard.GameBoard;
import piatnashki_new.service.GameBoardService;
import javafx.scene.control.Button;
import java.awt.*;
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


    // todo for check to win

//        GameBoard gameBoardasddsa = new GameBoard(5,5);
//
//        for (int i = 0; i < gameBoardasddsa.getBoard().length; i++) {
//            for (int j = 0; j < gameBoardasddsa.getBoard()[i].length; j++) {
//                gameBoardasddsa.getBoard()[i][j] = i * gameBoardasddsa.getBoard().length + j + 1;
//                if (i * gameBoardasddsa.getBoard().length + j == 5*5 - 1) {
//                    gameBoardasddsa.getBoard()[i][j] = 0;
//                    gameBoardasddsa.setZeroInBoard(i * 5 + j);
//                }
//            }
//        }
//
//        System.out.println("\n\n");
////        System.out.println(gameBoardasddsa);
//
//        GameBoardService gameBoardService = GameBoardService.getInstance();
//        GameBoard gameBoard = gameBoardService.newGame(5,5);
////        System.out.println(gameBoard);
////        System.out.println("\n\n\n");
//        System.out.println(gameBoardasddsa);
//        for(;;) {
//            Scanner scanner = new Scanner(System.in);
//            int x = scanner.nextInt();
//            gameBoardService.move(gameBoardasddsa,x);
//            System.out.println(gameBoardasddsa);
//            System.out.println(gameBoardService.reviewToWin(gameBoardasddsa));
//        }



    }
}
