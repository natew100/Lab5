import java.util.ArrayList;

class Team {

    // member fields for color and units
    private final String color;
    private ArrayList<Unit> units = new ArrayList<Unit>();

    // make a 2 parameter constructor
    public Team(String color, ArrayList<Unit> units) {
        super();
        this.color = color;
        this.units = units;
    }

    //2 accessor methods
    public String getTeamColor() {
        return color;
    }

    public ArrayList<Unit> getTeamUnits() {
        return units;
    }

    /**2 mutator methods, they add and remove units from team, and
     * in the case of adding, it also changes the unit color to the team color
     */
    public void removeUnitsFromTeam(Unit newUnit) {
        this.units.remove(newUnit);
    }
    public void addUnitsToTeam(Unit newUnit) {
        this.units.add(newUnit);
        newUnit.teamColor = getTeamColor();
    }

    // override toString
    @Override
    public String toString()
    {
        String output = "Team " + this.color + " Units:\n";
        for(Unit testUnit:units)
        {
            output = output + testUnit + " ";
        }
        return output;
    }
}