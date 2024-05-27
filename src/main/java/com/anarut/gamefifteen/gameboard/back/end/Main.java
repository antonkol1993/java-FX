package com.anarut.gamefifteen.gameboard.back.end;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GameBoardService gameBoardService = GameBoardService.getInstance();
        File file = new File("D:\\fynjy\\Saves Gameboard\\save.txt");
        gameBoardService.loadGame(file);


        String string = new StringBuilder("ds")
                .append("4343")
                .append("sfdfdsf")
                .append("sdfds")
                .reverse()
                .insert(2, "4545")
                .toString()
                .toLowerCase();


    }


}