package com.anarut.gamefifteen.gameboard.back.end;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

    public boolean win(GameBoard gameBoard) {

        List<Integer> currentBoard = new ArrayList<>();
        List<Integer> finalBoard = getFinalGameBoard(GameBoard.getInstance(gameBoard.getSize()));
        for (int i = 0; i < GameBoard.getInstance(gameBoard.getSize()).getArrayLength(); i++) {
            currentBoard.add(i, GameBoard.getInstance(gameBoard.getSize()).getBoard()[i]);

        }
        return finalBoard.equals(currentBoard);
    }

    private List<Integer> getFinalGameBoard(GameBoard gameBoard) {
        List<Integer> finalBoard = new ArrayList<>();
        for (int i = 0; i < GameBoard.getInstance(gameBoard.getSize()).getArrayLength(); i++) {
            finalBoard.add(i, i + 1);
            if (i == GameBoard.getInstance(gameBoard.getSize()).getArrayLength() - 1) {

                GameBoard.getInstance(gameBoard.getSize()).getBoard()[i] = 0;
            }
        }
        return finalBoard;
    }
    // todo uncorrect win method
//    public boolean win(GameBoard gameBoard) {
//        return true;
//    }

//    public GameBoard newGameNotRandom(int n) {
//        GameBoard.getInstance().setSize(n);
//        List<Integer> allValues = new ArrayList<>();
//        for (int i = 0; i < GameBoard.getInstance().getArrayLength(); i++) {
//            allValues.add(i, i + 1);
//        }
//        for (int i = 0; i < GameBoard.getInstance().getBoard().length; i++) {
//            GameBoard.getInstance().getBoard()[i] = allValues.get(i);
//            if (i == GameBoard.getInstance().getArrayLength() - 1) {
//                GameBoard.getInstance().getBoard()[i] = 0;
//            }
//        }
//        return GameBoard.getInstance();
//    }

    public GameBoard newGame(int n) {
        GameBoard.getInstance(n);
        List<Integer> allValues = new ArrayList<>();
        for (int i = 0; i < n * n; i++) {
            allValues.add(i, i);
        }
        for (int i = 0; i < n * n; i++) {
            int index = new Random().nextInt(allValues.size());
            GameBoard.getInstance(n).getBoard()[i] = allValues.get(index);
            allValues.remove(index);
        }
        whereIsZero(GameBoard.getInstance(n));

        return GameBoard.getInstance(n);
    }

    public GameBoard moveToOneStep(GameBoard gameBoard, int numb) {
        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            if (gameBoard.getBoard()[i] == numb) {
                //todo zeroToleft
                if (i % gameBoard.getSize() != gameBoard.getSize() - 1 && i + 1 < gameBoard.getArrayLength() && gameBoard.getBoard()[i + 1] == 0) {

                    gameBoard.getBoard()[i] = 0;
                    gameBoard.getBoard()[i + 1] = numb;

                    gameBoard.setZeroInBoard(i);
                    return gameBoard;
                }
                //todo zeroToRight
                else if (i % gameBoard.getSize() != 0 && gameBoard.getBoard()[i - 1] == 0) {

                    gameBoard.getBoard()[i] = 0;
                    gameBoard.getBoard()[i - 1] = numb;

                    gameBoard.setZeroInBoard(i);
                    return gameBoard;

                }
                //todo zeroToUp
                else if (i - gameBoard.getSize() >= 0 && gameBoard.getBoard()[i - gameBoard.getSize()] == 0) {
                    gameBoard.getBoard()[i] = 0;
                    gameBoard.getBoard()[i - gameBoard.getSize()] = numb;

                    gameBoard.setZeroInBoard(i);
                    return gameBoard;
                }
                //todo zeroToDown
                else if (i + gameBoard.getSize() < gameBoard.getArrayLength() && gameBoard.getBoard()[i + gameBoard.getSize()] == 0) {
                    gameBoard.getBoard()[i] = 0;
                    gameBoard.getBoard()[i + gameBoard.getSize()] = numb;

                    gameBoard.setZeroInBoard(i);
                    return gameBoard;
                }
            }

        }

        return gameBoard;
    }

    private void whereIsZero(GameBoard gameBoard) {
        for (int i = 0; i < gameBoard.getSize(); i++) {
            for (int j = 0; j < gameBoard.getSize(); j++) {
                if (gameBoard.getBoard()[i * gameBoard.getSize() + j] == 0) {
                    gameBoard.setZeroInBoard(i * gameBoard.getSize() + j);
                }
            }
        }

    }



    public GameBoard loadGame(File file) {

        StringBuilder arrString = new StringBuilder();
        List arrayList = new ArrayList();
        try (FileReader reader = new FileReader(file.getAbsolutePath());
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            {
                int c;
                while ((c = bufferedReader.read()) != -1) {
                    if (c == ',') {
                        arrayList.add(Integer.parseInt(String.valueOf(arrString)));
                        arrString.delete(0, 5);

                    } else {
                        arrString.append((char) (c));
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int size = arrayList.size();

        GameBoard.getInstance(size).setSize(size);
        for (int i = 0; i < size; i++) {
            GameBoard.getInstance(size).getBoard()[i] = (Integer) arrayList.get(i);
        }
        whereIsZero(GameBoard.getInstance(size));
        System.out.println(arrayList);

        return GameBoard.getInstance(size);
    }


}

