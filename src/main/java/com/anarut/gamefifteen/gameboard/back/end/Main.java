package com.anarut.gamefifteen.gameboard.back.end;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = 7;
        GameBoard gB = GameBoardService.getInstance().newGame(size);
        GameBoardService gBService = GameBoardService.getInstance();


        System.out.print(gB);
        System.out.println(gB.getZeroInBoard());

        for (;;) {



            Scanner scanner = new Scanner(System.in);
            int numb = scanner.nextInt();
            gBService.superMove(gB,numb);
            System.out.println(gB);
        }

    }


}