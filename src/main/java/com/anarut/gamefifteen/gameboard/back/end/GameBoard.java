package com.anarut.gamefifteen.gameboard.back.end;

import java.util.Arrays;

public class GameBoard {
    private static Integer[] board;
    private static Integer size;
    private Integer zeroInBoard;
    private static GameBoard instance;

    private GameBoard(int size) {
        GameBoard.size = size;
        board = new Integer[size * size];
    }
    public static GameBoard getInstance(int size) {
        if (instance == null) {
            instance = new GameBoard(size);
        }

        return instance;
    }

    public Integer getZeroInBoard() {
        return zeroInBoard;
    }



    public Integer[] getBoard() {
        return board;
    }


    public Integer getArrayLength() {
        return board.length;
    }


    public Integer getSize() {
        return size;
    }


    public void setSize(Integer size) {
        GameBoard.size = size;
    }
    public void setZeroInBoard(Integer zeroInBoard) {
        this.zeroInBoard = zeroInBoard;
    }


    @Override
    public int hashCode() {
        int result = Arrays.hashCode(board);
        result = 31 * result + size.hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String val = board[i * size + j] == 0 ? "[]" : board[i * size + j].toString();
                builder.append(String.format("%3s", val));
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GameBoard gameBoard = (GameBoard) object;

        return Arrays.equals((gameBoard.getBoard()), this.getBoard());
    }
}
