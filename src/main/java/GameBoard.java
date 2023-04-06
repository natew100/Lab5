/**
 *  <h1>BoardSquare</h1>
 * This class represents the game board and contains information about the number of rows, columns,
 * and the 2D array of board squares. It also includes methods for initializing an empty board,
 * finding a random empty space on the board, and checking whether a given index is in bounds.
 *
 * @author Nathan Wolf, Aditya Gill, Ethan Fassnacht
 * @version 1.0
 * @since 2023-04-04
 */
public class GameBoard {

    private int numRows; // number of rows on the game board
    private int numColumns; // number of columns on the game board
    private BoardSquare[][] squares; // 2D array of board squares

    /**
     * Creates a new GameBoard object with the specified number of rows and columns and initializes an
     * empty board.
     *
     * @param numRows    the number of rows on the game board
     * @param numColumns the number of columns on the game board
     */
    public GameBoard(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.squares = new BoardSquare[numRows][numColumns];
        setUpEmptyBoard();
    }

    // GETTER METHODS

    /**
     * Returns the number of rows on the game board.
     *
     * @return the number of rows on the game board
     */
    public int getNumRows() {
        return numRows;
    }

    /**
     * Returns the number of columns on the game board.
     *
     * @return the number of columns on the game board
     */
    public int getNumColumns() {
        return numColumns;
    }

    /**
     * Returns the 2D array of board squares.
     *
     * @return the 2D array of board squares
     */
    public BoardSquare[][] getSquares() {
        return squares;
    }

    /**
     * Returns whether the given row and column indices are within the bounds of the game board.
     *
     * @param rowIndex    the row index to check
     * @param columnIndex the column index to check
     * @return true if the indices are in bounds, false otherwise
     */
    public boolean inBounds(int rowIndex, int columnIndex) {
        return rowIndex >= 0 && rowIndex < numRows && columnIndex >= 0 && columnIndex < numColumns;
    }

    // SETS UP GAME BOARD DISPLAY

    /**
     * Initializes an empty game board with alternating square colors.
     */
    private void setUpEmptyBoard() {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                // Customize the color alternation logic as needed
                String color = (row + col) % 2 == 0 ? "White" : "Black";
                squares[row][col] = new BoardSquare(color);
            }
        }
    }

    // RANDOM SPACE USING MATH FUNCTION

    /**
     * Finds a random empty space on the game board using the Math.random() function.
     *
     * @return a random empty board square
     */
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

    // TO STRING

    /**
     * Returns a string representation of the game board. The
     * string includes column numbers at the top, row numbers on the left, and a grid of board squares
     * separated by dashes.
     *
     * @return a string representation of the game board
     */
    public String toString(){
        StringBuilder boardString = new StringBuilder();
        boardString.append("Col : ");

        for(int col = 0; col < squares[0].length; col++){
            boardString.append(col + " ");
        }
        boardString.append("\n");
        for(int row = 0; row < squares.length; row++){
            boardString.append("Row : " + row + " ");
            for(int col = 0; col < squares[row].length; col++){
                boardString.append(squares[row][col].toString() + " ");
            }
            boardString.append("\n");
        }
        return boardString.toString();
    }
}
