package piatnashki_new.model.GameBoard;

import piatnashki_new.controller.service.GameBoardService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        GameBoardService gameBoardService = GameBoardService.getInstance();
        GameBoard gameBoard = gameBoardService.newGame(5,5);

        System.out.println(gameBoard);
        for (;;) {
            Scanner scanner = new Scanner(System.in);
            int ght = scanner.nextInt();
            gameBoardService.move(gameBoardService.getCurrentBoard(),ght);
            System.out.println(gameBoard);
        }
    }
}
