package com.anarut.gamefifteen.gameboard.back.end;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GameBoardService.getInstance().newGame(5);
        System.out.println(GameBoard.getInstance());

        System.out.println(Arrays.toString(GameBoard.getInstance().getBoard()));

        System.out.println(GameBoard.getInstance().getBoard().length);
    }


}