package piatnashki_new.service;

import piatnashki_new.model.gameBoard.GameBoard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBoardService {
    private static GameBoardService instance;


    private GameBoardService() {
    }

    public static GameBoardService getInstance() {
        if (instance == null) {
            instance = new GameBoardService();
        }
        return instance;
    }

    public GameBoard newGame(int height, int width) {
        GameBoard gameBoard = new GameBoard(height, width);
        List<Integer> allValues = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                allValues.add(i + j, i * width + j);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int index = new Random().nextInt(allValues.size());
                gameBoard.getBoard()[i][j] = allValues.get(index);
                allValues.remove(index);
                if (gameBoard.getBoard()[i][j] == 0)
                    gameBoard.setZeroInBoard(i * width + j);
            }

        }
        return gameBoard;
    }


    public void move(GameBoard gameBoard, int numb) {

        int height = gameBoard.getSizeHeight();
        int width = gameBoard.getSizeWidth();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                // todo if horizontal
                if (gameBoard.getBoard()[i][j] == numb &&
                        gameBoard.getZeroInBoard() / height == i) {
                    int zeroOnJ = gameBoard.getZeroInBoard() % height;
                    if (j < zeroOnJ) {
                        //todo zeroToLeft
                        for (int c = 0; c < zeroOnJ - j; c++) {
                            int temp = gameBoard.getBoard()[i][zeroOnJ - c - 1];
                            gameBoard.getBoard()[i][zeroOnJ - c - 1] = 0;
                            gameBoard.getBoard()[i][zeroOnJ - c] = temp;

                            gameBoard.setZeroInBoard(i * width + (zeroOnJ - c - 1));
                        }
                        return;

                    } else if (j > zeroOnJ){
                        //todo zeroToRight
                        for (int c = 0; c < j - zeroOnJ; c++) {
                            int temp = gameBoard.getBoard()[i][zeroOnJ + c + 1];
                            gameBoard.getBoard()[i][zeroOnJ + c + 1] = 0;
                            gameBoard.getBoard()[i][zeroOnJ + c] = temp;

                            gameBoard.setZeroInBoard(i * width + (zeroOnJ + c + 1));
                        }
                        return;
                    }

                }
//                 todo if vertical??
                else if (gameBoard.getBoard()[i][j] == numb &&
                        gameBoard.getZeroInBoard() % height == j) {

                    int zeroString = gameBoard.getZeroInBoard() / height;
                    int numberString = (i * gameBoard.getSizeHeight() + j) / height;


                    if (numberString < zeroString) {
                        //todo zero to up
                        for (int c = 0; c < zeroString - numberString; c++) {
                            int temp = gameBoard.getBoard()[zeroString - c - 1][j];
                            gameBoard.getBoard()[zeroString - c - 1][j] = 0;
                            gameBoard.getBoard()[zeroString - c][j] = temp;

                            gameBoard.setZeroInBoard((zeroString - c - 1) * width + j);
                        }
                        return;

                    } else if (zeroString < numberString) {
                        //todo zero to down
                        for (int c = 0; c < numberString - zeroString; c++) {
                            int temp = gameBoard.getBoard()[zeroString + c + 1][j];
                            gameBoard.getBoard()[zeroString + c + 1][j] = 0;
                            gameBoard.getBoard()[zeroString + c][j] = temp;

                            gameBoard.setZeroInBoard((zeroString + c + 1) * width + j);

                        }
                        return;
                    }
                }
            }
        }
    }
}
