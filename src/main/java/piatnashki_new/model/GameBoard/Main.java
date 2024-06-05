package piatnashki_new.model.GameBoard;

import piatnashki_new.controller.Service.GameBoardService;

public class Main {
    public static void main(String[] args) {


        GameBoardService gameBoardService = GameBoardService.getInstance();
        GameBoard gameBoard = gameBoardService.newGame(5,5);

        System.out.println(gameBoard);
        System.out.println(gameBoard.getZeroInBoard());
    }
}
