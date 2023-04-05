import java.util.ArrayList;

/**
 * <h1>Lab4</h1>
 * <h2>CISC 181-020L Spring 2023</h2>
 * <h3>University of Delaware</h3>
 *
 * This Lab4 Player program represents a player. This class has a total of 3 fields, one constructor
 * with 3 parameters, one constructor with 2 parameters, one constructor with 0 parameters
 * 3 accessor methods, and 3 mutator methods.
 *
 * @author Aditya Gill
 * @since 2023-03-21
 * @version 2022.3.2
 */
public class Player {
    //3 fields (attributes/properties)
    private int playerNumber;
    private boolean turn;
    private Team team;

    //3 parameter constructor
    public Player(int playerNumber, boolean turn, Team team) {
        this.playerNumber = playerNumber;
        this.turn = turn;
        this.team = team;
    }

    //2 parameter constructor
    public Player(int playerNumber, Team team) {
        this.playerNumber = playerNumber;
        this.turn = false;
        this.team = team;
    }

    //0 parameter constructor
    public Player() {
        this.playerNumber = 0;
        this.turn = false;
        this.team = new Team("", new ArrayList<Unit>());
    }

    //Accessor methods
    public int getPlayerNumber() {
        return playerNumber;
    }


    public boolean isTurn() {
        return turn;
    }

    public Team getPlayersTeam() {
        return team;
    }

    //Mutator methods
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public void setPlayersTeam(Team team) {
        this.team = team;
    }
}
