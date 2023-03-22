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

public class BartSimpsonUnit {
    // initializing variables

    private char symbol;
    private String name;
    private double health;
    private double healthModifier;
    private double damage;
    private double damageModifier;
    private int luck;
    private int xCor;
    private int yCor;
    private int movement;
    private int movementModifier;
    private int numTimesSpawned;
    private boolean distract;
    private boolean recruit;

    // constant variable, does not change
    public static final int MAX_NUM_SPAWNED = 1;


    // constructor with parameters
    public BartSimpsonUnit(char symbol, String name, double health, double healthModifier, double damage, double damageModifier,
                           int luck, int xCor, int yCor, int movement, int movementModifier, int numTimesSpawned,
                           boolean distract, boolean recruit) {
        this.symbol = symbol;
        this.name = name;
        this.health = health;
        this.healthModifier = healthModifier;
        this.damage = damage;
        this.damageModifier = damageModifier;
        this.luck = luck;
        this.xCor = xCor;
        this.yCor = yCor;
        this.movement = movement;
        this.movementModifier = movementModifier;
        this.numTimesSpawned = numTimesSpawned;
        this.distract = distract;
        this.recruit = recruit;
    }

    public BartSimpsonUnit() {
        this('B', "Bart Simpson", 100.0, 0.0, 25.0, 0.0, 0,
                5, 5, 1, 0, 0, true, true);
    }

    // ACCESSOR/GET METHODS
    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getHealthModifier() {
        return healthModifier;
    }

    public double getDamage() {
        return damage;
    }

    public double getDamageModifier() {
        return damageModifier;
    }

    public int getLuck() {
        return luck;
    }

    public int getxCor() {
        return xCor;
    }

    public int getyCor() {
        return yCor;
    }

    public int getMovement() {
        return movement;
    }

    public int getMovementModifier() {
        return movementModifier;
    }

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
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setHealthModifier(double healthModifier) {
        this.healthModifier = healthModifier;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setDamageModifier(double damageModifier) {
        this.damageModifier = damageModifier;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void setxCor(int xCor) {
        this.xCor = xCor;
    }

    public void setyCor(int yCor) {
        this.yCor = yCor;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public void setMovementModifier(int movementModifier) {
        this.movementModifier = movementModifier;
    }

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
                true);
        this.numTimesSpawned++;
        return newUnit;
    }
}