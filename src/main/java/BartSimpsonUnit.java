/**
 * <h1>BartSimpsonUnit</h1>
 * <h2>CISC 181-020L Spring 2023</h2>
 * <h3>University of Delaware</h3>
 *
 * @author Nathan Wolf
 */

/**
 * The BartSimpson class represents a unit of Bart Simpson.
 * This class contains properties and methods for a Bart Simpson unit in a game,
 * including its health, damage, movement, luck, and more special abilities.
 **/

public class BartSimpsonUnit extends Unit {
    // initializing variables

    private int numTimesSpawned;
    private boolean distract;
    private boolean recruit;

    // constant variable, does not change
    public static final int MAX_NUM_SPAWNED = 1;


    // constructor with parameters
    public BartSimpsonUnit(char symbol, String name, double health, double healthModifier, double damage, double damageModifier,
                           int luck, int xCor, int yCor, int movement, int movementModifier, int numTimesSpawned,
                           boolean distract, boolean recruit, String teamColor) {
        super(symbol, name, health, healthModifier, damage, damageModifier, luck, xCor,
                yCor, movement, movementModifier, teamColor);
        this.numTimesSpawned = numTimesSpawned;
        this.distract = distract;
        this.recruit = recruit;
    }

    public BartSimpsonUnit() {
        this('B', "Bart Simpson", 100.0, 0.0, 25.0, 0.0, 0,
                5, 5, 1, 0, 0, true,
                true, "Default Team");
    }

    // ACCESSOR/GET METHODS


    public int getNumTimesSpawned() {
        return numTimesSpawned;
    }

    public boolean canDistract() {
        return distract;
    }

    public boolean canRecruit() {
        return recruit;
    }

    public boolean canSpawn() {
        return (numTimesSpawned == 0 && MAX_NUM_SPAWNED > 0);
    }


    // MUTATOR/SET METHODS

    public void setNumTimesSpawned(int numTimesSpawned) {
        this.numTimesSpawned = numTimesSpawned;
    }

    public void setDistract(boolean distract) {
        this.distract = distract;
    }

    public void setRecruit(boolean recruit) {
        this.recruit = recruit;
    }

    public void distracted() {
        if (canDistract() == true) {
            System.out.println("Unit Distracted!");
        }
    }

    // method that creates BartSimpson unit with new parameters
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