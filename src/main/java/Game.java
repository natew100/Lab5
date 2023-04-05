import java.util.Collections;
import java.util.Random;
public class Game {
    private GameBoard gameBoard;
    private Player currentPlayer;
    private Player opponentPlayer;

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

    Game(int numRows, int numColumns, Player currentPlayer, Player opponentPlayer) {
        this.currentPlayer = currentPlayer;
        this.opponentPlayer = opponentPlayer;
        initializeGameBoard(numRows, numColumns);
    }



    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getOpponentPlayer() {
        return opponentPlayer;
    }

    public boolean isTurn(Player player) {
        return currentPlayer == player;
    }

    public BoardSquare[][] getBoardSquares() {
        return gameBoard.getSquares();
    }

    public void changeTurn() {
        Player tempPlayer = currentPlayer;
        currentPlayer = opponentPlayer;
        opponentPlayer = tempPlayer;
    }

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


