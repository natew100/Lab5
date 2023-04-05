import java.util.Collections;

/**
 * <h1>Game</h1>
 *
 * This class represents the game and contains information about the game board, the current player,
 * the opponent player, and methods for initializing the game board, changing turns, and retrieving
 * game-related information.
 *
 * @author Nathan Wolf, Aditya Gill, Ethan Fassnacht
 * @version 1.0
 * @since 2023-04-04
 */
public class Game {
    private GameBoard gameBoard; // the game board
    private Player currentPlayer; // the current player
    private Player opponentPlayer; // the opponent player

    /**
     * Initializes the game board with random empty spaces and sets the players' units on the board.
     *
     * @param numRows the number of rows in the game board
     * @param numColumns the number of columns in the game board
     */
    private void initializeGameBoard(int numRows, int numColumns) {
        gameBoard = new GameBoard(numRows, numColumns);
        for (int i = 0; i < currentPlayer.getPlayersTeam().getTeamUnits().size(); i++) {
            BoardSquare randomEmptySpace = gameBoard.findRandomEmptySpace();
            randomEmptySpace.setUnit(currentPlayer.getPlayersTeam().getTeamUnits().get(i));
        }

        for (int i = 0; i < opponentPlayer.getPlayersTeam().getTeamUnits().size(); i++) {
            BoardSquare randomEmptySpace = gameBoard.findRandomEmptySpace();
            randomEmptySpace.setUnit(opponentPlayer.getPlayersTeam().getTeamUnits().get(i));
        }

    }

    /**
     * Creates a new Game object with the specified number of rows, columns, current player, and opponent player.
     *
     * @param numRows the number of rows in the game board
     * @param numColumns the number of columns in the game board
     * @param currentPlayer the current player
     * @param opponentPlayer the opponent player
     */
    Game(int numRows, int numColumns, Player currentPlayer, Player opponentPlayer) {
        this.currentPlayer = currentPlayer;
        this.opponentPlayer = opponentPlayer;
        initializeGameBoard(numRows, numColumns);
    }

    // GETTER METHODS

    /**
     * Returns the game board.
     *
     * @return the game board
     */
    public GameBoard getGameBoard() {
        return gameBoard;
    }

    /**
     * Returns the current player.
     *
     * @return the current player
     */
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     * Returns the opponent player.
     *
     * @return the opponent player
     */
    public Player getOpponentPlayer() {
        return opponentPlayer;
    }

    /**
     * Returns whether it is the specified player's turn or not.
     *
     * @param player the player to check
     * @return true if it is the player's turn, false otherwise
     */
    public boolean isTurn(Player player) {
        return currentPlayer == player;
    }

    /**
     * Returns the 2D array of board squares.
     *
     * @return the 2D array of board squares
     */
    public BoardSquare[][] getBoardSquares() {
        return gameBoard.getSquares();
    }

    /**
     * Changes the turn to the opponent player.
     */
    public void changeTurn() {
        Player tempPlayer = currentPlayer;
        currentPlayer = opponentPlayer;
        opponentPlayer = tempPlayer;
    }

    // TO STRING

    /**
     * Returns a string representation of the game. The string includes the game board, the current player's
     * team, the opponent player's team, and whose turn it is.
     is.
     *
     @return a string representation of the game
     */

    public String toString(){
        StringBuilder retString = new StringBuilder();
        retString.append("Game Board:\n")
                .append(String.join("", Collections.nCopies(10 + gameBoard.getNumColumns()*8, "*")))
                .append("\n" + getGameBoard().toString())
                .append(String.join("", Collections.nCopies(10 + gameBoard.getNumColumns()*8, "*")))
                .append("\n" + getCurrentPlayer().getPlayersTeam().toString() + "\n")
                .append(String.join("", Collections.nCopies(10 + gameBoard.getNumColumns()*8, "*")))
                .append("\n" + getOpponentPlayer().getPlayersTeam().toString() + "\n")
                .append(String.join("", Collections.nCopies(10 + gameBoard.getNumColumns()*8, "*")))
                .append("\nIt is Player " + getCurrentPlayer().getPlayerNumber() + "'s (" + getCurrentPlayer().getPlayersTeam().getTeamColor() + "'s) turn\n");
        return retString.toString();
    }
}