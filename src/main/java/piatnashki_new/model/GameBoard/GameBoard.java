package piatnashki_new.model.GameBoard;

import java.util.Arrays;
import java.util.Objects;

public class GameBoard {

    private final Integer[][] board;
    private final Integer sizeWidth;
    private final Integer sizeHeight;
    private Integer zeroInBoard;

    public GameBoard(Integer i, Integer j) {
        board = new Integer[i][j];
        this.sizeHeight = i;
        this.sizeWidth = j;
    }

    public Integer[][] getBoard() {
        return board;
    }

    public Integer getSizeWidth() {
        return sizeWidth;
    }

    public Integer getSizeHeight() {
        return sizeHeight;
    }

    public Integer getZeroInBoard() {
        return zeroInBoard;
    }

    public void setZeroInBoard(Integer zeroInBoard) {
        this.zeroInBoard = zeroInBoard;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(board);
        result = 31 * result + sizeWidth.hashCode() + sizeHeight.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameBoard gameBoard)) return false;
        return Objects.deepEquals(board, gameBoard.board) &&
                Objects.equals(sizeWidth, gameBoard.sizeWidth) &&
                Objects.equals(sizeHeight, gameBoard.sizeHeight) &&
                Objects.equals(zeroInBoard, gameBoard.zeroInBoard);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < sizeHeight; i++) {
            for (int j = 0; j < sizeWidth; j++) {
                String val = board[i][j] == 0 ? "[]" : board[i][j].toString();
                builder.append(String.format("%3s", val));
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
