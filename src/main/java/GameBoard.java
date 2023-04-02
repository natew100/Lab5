public class GameBoard {
    private int numRows;
    private int numColumns;
    private BoardSquare[][] squares;

    public GameBoard(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.squares = new BoardSquare[numRows][numColumns];

    }

    // ACCESSOR/GETTER METHODS

    public int getNumRows() {
        return numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public BoardSquare[][] getSquares() {
        return squares;
    }

    public boolean inBounds(int rowIndex, int columnIndex) {
        return rowIndex >= 0 && rowIndex < numRows && columnIndex >= 0 && columnIndex < numColumns;


    }


}
