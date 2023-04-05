/**
 * <h1>BartSimpsonUnit</h1>
 *
 * This BartSimpsonUnit class extends the Unit class and represents a Bart Simpson Unit.
 * It contains additional properties and methods related to the special abilities
 * and characteristics of the Bart Simpson Unit.
 *
 * @author Nathan Wolf, Aditya Gill, Ethan Fassnacht
 * @version 1.0
 * @since 2023-04-04
 */
public class BartSimpsonUnit extends Unit {
    // initializing variables
    private int numTimesSpawned;
    private boolean distract;
    private boolean recruit;

    // constant variable, does not change
    public static final int MAX_NUM_SPAWNED = 1;

    /**
     * Constructor with parameters.
     *
     * @param symbol           char representing the unit's symbol.
     * @param name             String representing the unit's name.
     * @param health           double representing the unit's health.
     * @param healthModifier   double representing the unit's health modifier.
     * @param damage           double representing the unit's damage.
     * @param damageModifier   double representing the unit's damage modifier.
     * @param luck             int representing the unit's luck.
     * @param xCor             int representing the unit's x coordinate.
     * @param yCor             int representing the unit's y coordinate.
     * @param movement         int representing the unit's movement.
     * @param movementModifier int representing the unit's movement modifier.
     * @param numTimesSpawned  int representing the number of times the unit has been spawned.
     * @param distract         boolean representing the unit's ability to distract.
     * @param recruit          boolean representing the unit's ability to recruit.
     * @param teamColor        String representing the team's color.
     */
    public BartSimpsonUnit(char symbol, String name, double health, double healthModifier, double damage, double damageModifier,
                           int luck, int xCor, int yCor, int movement, int movementModifier, int numTimesSpawned,
                           boolean distract, boolean recruit, String teamColor) {
        super(symbol, name, health, healthModifier, damage, damageModifier, luck, xCor,
                yCor, movement, movementModifier, teamColor);
        this.numTimesSpawned = numTimesSpawned;
        this.distract = distract;
        this.recruit = recruit;
    }

    /**
     * Default constructor.
     */
    public BartSimpsonUnit() {
        this('B', "Bart Simpson", 100.0, 0.0, 25.0, 0.0, 0,
                5, 5, 1, 0, 0, true,
                true, "Default Team");
    }

    /**
     * Accessor method for the number of times this unit has been spawned.
     *
     * @return int The number of times this unit has been spawned.
     */
    public int getNumTimesSpawned() {
        return numTimesSpawned;
    }

    /**
     * Accessor method for the distract ability of this unit.
     *
     * @return boolean True if the unit can distract, false otherwise.
     */
    public boolean canDistract() {
        return distract;
    }

    /**
     * Accessor method for the recruit ability of this unit.
     *
     * @return boolean True if the unit can recruit, false otherwise.
     */
    public boolean canRecruit() {
        return recruit;
    }

    /**
     * Accessor method for the spawn ability of this unit.
     *
     * @return boolean True if the unit can spawn, false otherwise.
     */
    public boolean canSpawn() {
        return (numTimesSpawned == 0 && MAX_NUM_SPAWNED > 0);
    }

    /**
     * Mutator method for the number of times this unit has been spawned.
     *
     * @param numTimesSpawned int representing the number of times this unit has been spawned.
     */
    public void setNumTimesSpawned(int numTimesSpawned) {
        this.numTimesSpawned = numTimesSpawned;
    }

    /**
     * Mutator method for the distract ability of this unit.
     *
     * @param distract boolean representing the distract ability of this unit.
     */
    public void setDistract(boolean distract) {
        this.distract = distract;
    }

    /**
     * Mutator method for the recruit ability of this unit.
     *
     * @param recruit boolean representing the recruit ability of this unit.
     */
    public void setRecruit(boolean recruit) {
        this.recruit = recruit;
    }

    /**
     * Method for handling distraction by this unit.
     */
    public void distracted() {
        if (canDistract()) {
            System.out.println("Unit Distracted!");
        }
    }

    /**
     * Method that creates a new BartSimpsonUnit with new parameters.
     *
     * @return BartSimpsonUnit The newly spawned BartSimpsonUnit.
     */
    public BartSimpsonUnit spawn() {
        BartSimpsonUnit newUnit = new BartSimpsonUnit(
                'b',
                "Bart Simpson",
                100.0,
                5.0,
                25.0,
                10.0,
                0,
                1,
                1,
                1,
                1,
                0,
                true,
                true,
                "Default Team");
        this.numTimesSpawned++;
        return newUnit;
    }
}