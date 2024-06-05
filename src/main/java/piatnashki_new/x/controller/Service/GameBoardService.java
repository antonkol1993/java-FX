package piatnashki_new.x.controller.Service;

import piatnashki_new.x.model.GameBoard.GameBoard;

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

// todo move
//    public GameBoard move(GameBoard gameBoard, int numb) {
//        for (int i = 0; i < gameBoard.getSizeHeight(); i++) {
//            for (int j = 0; j < gameBoard.getSizeWidth(); j++) {
//                int ZeroCount = gameBoard.getZeroInBoard();
//                int ijCount = i * gameBoard.getSize() + j;
//                // todo if horizontal
//                if (gameBoard.getBoard()[i * gameBoard.getSize() + j] == numb &&
//                        gameBoard.getZeroInBoard() / gameBoard.getSize() == i) {
//
//                    if (ijCount < ZeroCount) {
//                        //todo zeroToLeft
//                        for (int c = 0; c < ZeroCount - ijCount; c++) {
//                            int temp = gameBoard.getBoard()[ZeroCount - c - 1];
//                            gameBoard.getBoard()[ZeroCount - c - 1] = 0;
//                            gameBoard.getBoard()[ZeroCount - c] = temp;
//
//                            gameBoard.setZeroInBoard(ZeroCount - c - 1);
//                        } return gameBoard;
//
//                    } else { //todo zeroToRight
//                        for (int c = 0; c < ijCount - ZeroCount; c++) {
//                            int temp = gameBoard.getBoard()[ZeroCount + c + 1];
//                            gameBoard.getBoard()[ZeroCount + c + 1] = 0;
//                            gameBoard.getBoard()[ZeroCount + c] = temp;
//
//                            gameBoard.setZeroInBoard(ZeroCount + c + 1);
//                        }
//                        return gameBoard;
//                    }
//
//                }
//                // todo if vertical??
//                else if (gameBoard.getBoard()[i * gameBoard.getSize() + j] == numb &&
//                        gameBoard.getZeroInBoard() % gameBoard.getSize() == j) {
//
//                    int zeroString = gameBoard.getZeroInBoard() / gameBoard.getSize();
//                    int numberString = (i * gameBoard.getSize() + j) / gameBoard.getSize();
//
//
//                    if (numberString < zeroString) {
//                        //todo zero to up
//                        for (int c = 0; c < zeroString - numberString; c++) {
//                            int temp = gameBoard.getBoard()[ZeroCount - (gameBoard.getSize() * (c + 1))];
//                            gameBoard.getBoard()[ZeroCount - (gameBoard.getSize() * (c + 1))] = 0;
//                            gameBoard.getBoard()[ZeroCount - (gameBoard.getSize() * c)] = temp;
//
//                            gameBoard.setZeroInBoard(ZeroCount - (gameBoard.getSize() * (c + 1)));
//                        }
//
//
//                        return gameBoard;
//                    } else {  //todo zero to down
//                        for (int c = 0; c < numberString - zeroString; c++) {
//                            int temp = gameBoard.getBoard()[ZeroCount + (gameBoard.getSize() * (c + 1))];
//                            gameBoard.getBoard()[ZeroCount + (gameBoard.getSize() * (c + 1))] = 0;
//                            gameBoard.getBoard()[ZeroCount + (gameBoard.getSize() * c)] = temp;
//
//                            gameBoard.setZeroInBoard(ZeroCount + (gameBoard.getSize() * (c + 1)));
//
//                        }
//                        return gameBoard;
//                    }
//                }
//            }
//        }
//        return gameBoard;
//    }
}
