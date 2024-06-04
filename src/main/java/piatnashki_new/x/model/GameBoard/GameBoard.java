package piatnashki_new.x.model.GameBoard;

import java.util.Arrays;
import java.util.Objects;

public class GameBoard {

    private final Integer[][] board;
    private Integer sizeWidth;
    private Integer sizeHeight;
    private Integer zeroInBoard;

    public GameBoard(Integer sizeWidth, Integer sizeHeight) {
        board = new Integer[sizeWidth][sizeHeight];
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
}
