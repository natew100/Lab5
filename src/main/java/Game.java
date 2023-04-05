import java.util.Collections;
import java.util.Random;
public class Game {
    private GameBoard board;
    private Player player1;
    private Player player2;

    Game(int numRows, int numColumns, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        initializeGameBoard(numRows, numColumns);
    }

    private void initializeGameBoard(int numRows, int numColumns) {
        board = new GameBoard(numRows, numColumns);

    }

    public GameBoard getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        if (player1.isTurn()) {
            return player1;
        } else {
            return player2;
        }
    }

    public Player getOpponentPlayer() {
        if (player1.isTurn()) {
            return player2;
        } else {
            return player1;
        }
    }

    public boolean isTurn(Player player) {
        return player.isTurn();
    }

    public BoardSquare[][] getBoardSquares() {
        return board.getSquares();
    }

    public void changeTurn() {
        player1.setTurn(!player1.isTurn());
        player2.setTurn(!player2.isTurn());
    }

    public String toString(){
        StringBuilder retString = new StringBuilder();
        retString.append("Game Board:\n")
                .append(String.join("", Collections.nCopies(10 + board.getNumColumns()*8, "*")))
                .append("\n" + getBoard().toString())
                .append(String.join("", Collections.nCopies(10 + board.getNumColumns()*8, "*")))
                .append("\n" + getCurrentPlayer().getPlayersTeam().toString() + "\n")
                .append(String.join("", Collections.nCopies(10 + board.getNumColumns()*8, "*")))
                .append("\n" + getOpponentPlayer().getPlayersTeam().toString() + "\n")
                .append(String.join("", Collections.nCopies(10 + board.getNumColumns()*8, "*")))
                .append("\nIt is Player " + getCurrentPlayer().getPlayerNumber() + "'s (" + getCurrentPlayer().getPlayersTeam().getTeamColor() + "'s) turn\n");
        return retString.toString();
    }

}


