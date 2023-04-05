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

    private void setUpEmptyBoard() {
        String[] colors = {"black", "white"};
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                squares[i][j] = new BoardSquare(colors[(i + j)]);
            }
        }
    }

    public BoardSquare findRandomEmptySpace() {
        while (true) {
            int row = (int) (Math.random() * numRows);
            int column = (int) (Math.random() * numColumns);
            BoardSquare square = squares[row][column];
            if (square.isEmpty()) {
                return square;
            }
        }
    }

    public String toString(){
        StringBuilder boardString = new StringBuilder();
        boardString.append("Col :       ");

        for(int col = 0; col < squares[0].length; col++){
            boardString.append(col + "        ");
        }
        boardString.append("\n");
        for(int row = 0; row < squares.length; row++){
            boardString.append("Row : " + row + "   ");
            for(int col = 0; col < squares[row].length; col++){
                boardString.append(squares[row][col].toString() + "  ");
            }
            boardString.append("\n");
        }
        return boardString.toString();
    }


}
