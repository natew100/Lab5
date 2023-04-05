import java.util.ArrayList;

/**
 * <h1>Player</h1>
 * This class represents a player in the game, with a player number, turn status, and a team of units.
 *
 * @author Nathan Wolf, Aditya Gill, Ethan Fassnacht
 * @version 1.0
 * @since 2023-04-04
 */
public class Player {

    private int playerNumber; // the player's number
    private boolean turn; // whether it is currently the player's turn
    private Team team; // the player's team of units

    /**
     * Creates a new Player object with the specified player number, turn status, and team.
     *
     * @param playerNumber the player's number
     * @param turn whether it is currently the player's turn
     * @param team the player's team of units
     */
    public Player(int playerNumber, boolean turn, Team team) {
        this.playerNumber = playerNumber;
        this.turn = turn;
        this.team = team;
    }

    /**
     * Creates a new Player object with the specified player number and team, and sets the turn status
     * to false by default.
     *
     * @param playerNumber the player's number
     * @param team the player's team of units
     */
    public Player(int playerNumber, Team team) {
        this.playerNumber = playerNumber;
        this.turn = false;
        this.team = team;
    }

    /**
     * Creates a new Player object with default values (player number 0, turn status false, and an
     * empty team).
     */
    public Player() {
        this.playerNumber = 0;
        this.turn = false;
        this.team = new Team("", new ArrayList<Unit>());
    }

    //Accessor methods

    /**
     * Returns the player's number.
     *
     * @return the player's number
     */
    public int getPlayerNumber() {
        return playerNumber;
    }

    /**
     * Returns whether it is currently the player's turn.
     *
     * @return true if it is the player's turn, false otherwise
     */
    public boolean isTurn() {
        return turn;
    }

    /**
     * Returns the player's team of units.
     *
     * @return the player's team of units
     */
    public Team getPlayersTeam() {
        return team;
    }

    //Mutator methods

    /**
     * Sets the player's number to the specified value.
     *
     * @param playerNumber the new player number
     */
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    /**
     * Sets the player's turn status to the specified value.
     *
     * @param turn the new turn status
     */
    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    /**
     * Sets the player's team of units to the specified value.
     *
     * @param team the new team of units
     */
    public void setPlayersTeam(Team team) {
        this.team = team;
    }
}