package com.anarut.gamefifteen.GameboardBackEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBoardService {

    public boolean win(GameBoard gameBoard) {
        GameBoard finalGameBoard = getFinalGameBoard(gameBoard.getSize());
        return finalGameBoard.equals(gameBoard);
    }

    private GameBoard getFinalGameBoard(int size) {
        GameBoard gameBoard = new GameBoard(size);
        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            gameBoard.getBoard()[i] = i;
        }
        return gameBoard;
    }

    public GameBoard newGameNotRandom(int n) {
        GameBoard gameBoard = new GameBoard(n);
        List<Integer> allValues = new ArrayList<>();
        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            allValues.add(i, i);
        }
        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            gameBoard.getBoard()[i] = allValues.get(i);
        }
        return gameBoard;
    }


    public GameBoard newGame(int n) {
        GameBoard gameBoard = new GameBoard(n);
        List<Integer> allValues = new ArrayList<>();
        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            allValues.add(i, i);
        }


        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            int index = new Random().nextInt(allValues.size());
            gameBoard.getBoard()[i] = allValues.get(index);
            allValues.remove(index);

        }
        whereIsZero(gameBoard);

        return gameBoard;
    }

    public GameBoard move(GameBoard gameBoard, int numb) {
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

    public GameBoard superMove(GameBoard gameBoard, int numb) {


        for (int i = 0; i < gameBoard.getSize(); i++) {
            for (int j = 0; j < gameBoard.getSize(); j++) {
                // todo if horizontal
                if (gameBoard.getBoard()[i * gameBoard.getSize() + j] == numb && gameBoard.getZeroInBoard() / gameBoard.getSize() == i) {
                    int gzCount = gameBoard.getZeroInBoard();
                    int ijCount = i * gameBoard.getSize() + j;
                    if (ijCount < gzCount) {
                        //todo zeroToLeft
                        for (int c = 0; c < ijCount - gzCount; c++) {
                            gameBoard.getBoard()[i - c] = 0;
                            gameBoard.getBoard()[i - c - 1] = numb;

                            gameBoard.setZeroInBoard(i - c);
                            return gameBoard;

                        }
                        //todo zeroToRight
                    } else {
                        for (int c = 0; c < gzCount - ijCount; c++) {
                            gameBoard.getBoard()[i + c] = 0;
                            gameBoard.getBoard()[i + c + 1] = numb;

                            gameBoard.setZeroInBoard(i + c);
                            return gameBoard;

                        }
                    }
                }

            }


        }
        return gameBoard;

    }
}
//                System.out.print(gameBoard.getBoard()[i * gameBoard.getSize() + j]);
//    }
//            System.out.println();
//            }


//        return gameBoard;
//                }
//                }
