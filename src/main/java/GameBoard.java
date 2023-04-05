public class GameBoard {
    private int numRows;
    private int numColumns;
    private BoardSquare[][] squares;

    public GameBoard(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.squares = new BoardSquare[numRows][numColumns];
        setUpEmptyBoard();
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

    private void setUpEmptyBoard() {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                // Customize the color alternation logic as needed
                String color = (row + col) % 2 == 0 ? "White" : "Black";
                squares[row][col] = new BoardSquare(color);
            }
        }
    }

    public BoardSquare findRandomEmptySpace() {
        int randomRow;
        int randomColumn;
        BoardSquare randomSquare;

        while (true) {
            randomRow = (int) (Math.random() * numRows);
            randomColumn = (int) (Math.random() * numColumns);
            randomSquare = squares[randomRow][randomColumn];
            if (randomSquare.isEmpty()) {
                break;
            }
        }
        return randomSquare;
    }

    public String toString() {
        StringBuilder boardString = new StringBuilder();
        boardString.append("Col : ");
        for (int col = 0; col < squares[0].length; col++) {
            boardString.append(col + " ");
        }
        boardString.append("\n");
        for (int row = 0; row < squares.length; row++) {
            boardString.append("Row : " + row + " ");
            for (int col = 0; col < squares[row].length; col++) {
                boardString.append("-------" + " ");
            }
            boardString.append("\n");
        }
        return boardString.toString();
    }
}