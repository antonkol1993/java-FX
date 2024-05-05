package com.anarut.gamefifteen.GameboardBackEnd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameBoardService gameBoardService = new GameBoardService();
//        GameBoard gameBoard = gameBoardService.newGame(4);
        GameBoard gameBoard = gameBoardService.newGameNotRandom(4);
//        System.out.println(gameBoard);
        System.out.println(gameBoard.getZeroInBoard());
        System.out.println(gameBoard);

        for (; ; ) {
            if (gameBoardService.win(gameBoard)) {
                System.out.println("You win!!!!");
                return;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number");
            int numb;
            if (scanner.hasNextInt()) {
                numb = scanner.nextInt();
                if (numb < 1 || numb >= gameBoard.getArrayLength()) {
                    System.out.println("Sorry, enter the correct number. Your number has out of bound ");
                } else {
//                    gameBoard = gameBoardService.move(gameBoard, numb);
                    gameBoard = gameBoardService.superMove(gameBoard, numb);
                    System.out.println(gameBoard);
                }
            } else if (scanner.hasNext()) {
                String s = scanner.next();
                if (s.equals("new") || s.equals("n")) {
                    System.out.println("What is the count of board?");
                    int count = scanner.nextInt();
                    gameBoard = new GameBoardService().newGame(count);
                    System.out.println(gameBoard
                    );
                } else if (s.equals("exit") || s.equals("ex")) {
                    System.out.println("You have completed the game!!!!");
                    return;
                } else {


                    System.out.println("Sorry, enter the correct number (only numbers from 1 to " + (gameBoard.getArrayLength() - 1) + ") or enter correct text(symbol)");
                }
            }


        }





    }


}