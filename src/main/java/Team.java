import java.util.ArrayList;

/**
 * <h1>Team</h1>
 * This class represents a team in the game, with a color and a list of units.
 *
 * @author Nathan Wolf, Aditya Gill, Ethan Fassnacht
 * @version 1.0
 * @since 2023-04-04
 */
class Team {

    private final String color; // the team's color
    private ArrayList<Unit> units = new ArrayList<Unit>(); // the list of units on the team

    /**
     * Creates a new Team object with the specified color and list of units.
     *
     * @param color the team's color
     * @param units the list of units on the team
     */
    public Team(String color, ArrayList<Unit> units) {
        super();
        this.color = color;
        this.units = units;
    }

    //Accessor methods

    /**
     * Returns the team's color.
     *
     * @return the team's color
     */
    public String getTeamColor() {
        return color;
    }

    /**
     * Returns the list of units on the team.
     *
     * @return the list of units on the team
     */
    public ArrayList<Unit> getTeamUnits() {
        return units;
    }

    //Mutator methods

    /**
     * Removes the specified unit from the team's list of units.
     *
     * @param newUnit the unit to remove from the team
     */
    public void removeUnitsFromTeam(Unit newUnit) {
        this.units.remove(newUnit);
    }

    /**
     * Adds the specified unit to the team's list of units, and changes the unit's color to the team color.
     *
     * @param newUnit the unit to add to the team
     */
    public void addUnitsToTeam(Unit newUnit) {
        this.units.add(newUnit);
        newUnit.teamColor = getTeamColor();
    }

    //Override toString

    /**
     * Returns a string representation of the team, including the team's color and a list of its units.
     *
     * @return a string representation of the team
     */
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Team " + this.color + " Units:\n");
        for (Unit testUnit : units) {
            output.append(testUnit).append(" ");
        }
        return output.toString();
    }
}
