package com.anarut.gamefifteen.gameboard.back.end;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GameBoardService gameBoardService = new GameBoardService();
        File file = new File("D:\\fynjy\\Saves Gameboard\\save.txt");
        gameBoardService.loadGame(file);


    }


}