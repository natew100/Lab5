import java.util.ArrayList;

class Team{

    //member fields for color and units
    private String color;
    private ArrayList<Unit> units = new ArrayList<Unit>();

    //make a 2 parameter constructor
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

    //2 mutator methods
    public void removeUnitsFromTeam(Unit newUnit) {
        this.units.remove(newUnit);
    }
    public void addUnitsToTeam(Unit newUnit) {
        this.units.add(newUnit);
    }

    //override toString
    @Override
    public String toString() {
        String output = "Team " + this.color + " Units:\n";
        for(Unit testUnit:units)
        {
            output = output + this.color + " " + testUnit + " ";
        }
        return output;
    }

}