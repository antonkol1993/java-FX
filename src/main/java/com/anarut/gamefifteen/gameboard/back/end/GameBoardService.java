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
        GameBoard finalGameBoard = (GameBoard) getFinalGameBoard(GameBoard.getInstance().getSize());
        return finalGameBoard.equals(gameBoard);
    }

    private List<Integer> getFinalGameBoard(int size) {
        GameBoard.getInstance().setSize(size);
        List<Integer> board = new ArrayList<>();
        for (int i = 0; i < GameBoard.getInstance().getBoard().length; i++) {
            GameBoard.getInstance().getBoard()[i] = i + 1;
            board.add(i, GameBoard.getInstance().getBoard()[i]) ;
            if (i == GameBoard.getInstance().getArrayLength() - 1) {

                GameBoard.getInstance().getBoard()[i] = 0;
            }
        }

        return board;
    }

    public GameBoard newGameNotRandom(int n) {
        GameBoard.getInstance().setSize(n);
        List<Integer> allValues = new ArrayList<>();
        for (int i = 0; i < GameBoard.getInstance().getArrayLength(); i++) {
            allValues.add(i, i + 1);
        }
        for (int i = 0; i < GameBoard.getInstance().getBoard().length; i++) {
            GameBoard.getInstance().getBoard()[i] = allValues.get(i);
            if (i == GameBoard.getInstance().getArrayLength() - 1) {
                GameBoard.getInstance().getBoard()[i] = 0;
            }
        }
        return GameBoard.getInstance();
    }

    public GameBoard newGame(int n) {
        GameBoard.getInstance().setSize(n);
        List<Integer> allValues = new ArrayList<>();
        for (int i = 0; i < GameBoard.getInstance().getArrayLength(); i++) {
            allValues.add(i, i);
        }
        for (int i = 0; i < GameBoard.getInstance().getBoard().length; i++) {
            int index = new Random().nextInt(allValues.size());
            GameBoard.getInstance().getBoard()[i] = allValues.get(index);
            allValues.remove(index);
        }

        whereIsZero(GameBoard.getInstance());

        return GameBoard.getInstance();
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

    public void superMove(GameBoard gameBoard, int numb) {
        for (int i = 0; i < gameBoard.getSize(); i++) {
            for (int j = 0; j < gameBoard.getSize(); j++) {

                // todo if horizontal
                if (gameBoard.getBoard()[i * gameBoard.getSize() + j] == numb &&
                        gameBoard.getZeroInBoard() / gameBoard.getSize() == i) {


                    int gzCount = gameBoard.getZeroInBoard();
                    int ijCount = i * gameBoard.getSize() + j;
                    if (ijCount < gzCount) {
                        //todo zeroToLeft
                        for (int c = 0; c < gzCount - ijCount; c++) {
                            int temp = gameBoard.getBoard()[gzCount - c - 1];
                            gameBoard.getBoard()[gzCount - c - 1] = 0;
                            gameBoard.getBoard()[gzCount - c] = temp;

                            gameBoard.setZeroInBoard(gzCount - c - 1);
                        }
                        //todo zeroToRight
                    } else {
                        for (int c = 0; c < ijCount - gzCount; c++) {
                            int temp = gameBoard.getBoard()[gzCount + c + 1];
                            gameBoard.getBoard()[gzCount + c + 1] = 0;
                            gameBoard.getBoard()[gzCount + c] = temp;

                            gameBoard.setZeroInBoard(gzCount + c + 1);
                        }
                    }

                    return;
                }
                // todo if horizontal
                else if (gameBoard.getBoard()[i * gameBoard.getSize() + j] == numb &&
                        gameBoard.getZeroInBoard() % gameBoard.getSize() == j) {

                    int zeroString = gameBoard.getZeroInBoard() / gameBoard.getSize();
                    int numberString = (i * gameBoard.getSize() + j) / gameBoard.getSize();

                    int gzCount = gameBoard.getZeroInBoard();

                    if (numberString < zeroString) {
                        //todo zero to up
                        for (int c = 0; c < zeroString - numberString; c++) {
                            int temp = gameBoard.getBoard()[gzCount - (gameBoard.getSize() * (c + 1))];
                            gameBoard.getBoard()[gzCount - (gameBoard.getSize() * (c + 1))] = 0;
                            gameBoard.getBoard()[gzCount - (gameBoard.getSize() * c)] = temp;

                            gameBoard.setZeroInBoard(gzCount - (gameBoard.getSize() * (c + 1)));
                        }

                        //todo zero to down
                    } else {
                        for (int c = 0; c < numberString - zeroString; c++) {
                            int temp = gameBoard.getBoard()[gzCount + (gameBoard.getSize() * (c + 1))];
                            gameBoard.getBoard()[gzCount + (gameBoard.getSize() * (c + 1))] = 0;
                            gameBoard.getBoard()[gzCount + (gameBoard.getSize() * c)] = temp;

                            gameBoard.setZeroInBoard(gzCount + (gameBoard.getSize() * (c + 1)));
                        }
                    }
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
        GameBoard.getInstance().setSize(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            GameBoard.getInstance().getBoard()[i] = (Integer) arrayList.get(i);
        }
        whereIsZero(GameBoard.getInstance());
        System.out.println(arrayList);

        return GameBoard.getInstance();
    }


}

