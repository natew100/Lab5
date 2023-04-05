/**
 * <h1>Unit</h1>
 * Unit is an abstract class that represents a unit in the game.
 *
 * @author Nathan Wolf, Aditya Gill, Ethan Fassnacht
 * @version 1.0
 * @since 2023-04-04
 */
public abstract class Unit {
    protected char symbol;
    protected String name;
    protected double health;
    protected double healthModifier;
    protected double damage;
    protected double damageModifier;
    protected int luck;
    protected int xCor;
    protected int yCor;
    protected int movement;
    protected int movementModifier;
    protected String teamColor;

    /**

     Constructor for Unit.
     @param symbol a char representing the symbol of the unit.
     @param name a string representing the name of the unit.
     @param health a double representing the health of the unit.
     @param healthModifier a double representing the health modifier of the unit.
     @param damage a double representing the damage of the unit.
     @param damageModifier a double representing the damage modifier of the unit.
     @param luck an integer representing the luck of the unit.
     @param xCor an integer representing the x coordinate of the unit.
     @param yCor an integer representing the y coordinate of the unit.
     @param movement an integer representing the movement of the unit.
     @param movementModifier an integer representing the movement modifier of the unit.
     @param teamColor a string representing the team color of the unit.
     */

    public Unit(char symbol, String name, double health, double healthModifier, double damage,
                double damageModifier, int luck, int xCor, int yCor, int movement, int movementModifier, String teamColor) {
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
        this.teamColor = teamColor;
    }


    // GETTERS

    /**
     Abstract method that creates a new unit of the same type.
     @return a new Unit instance.
     */
    public abstract Unit spawn();


    /**
     Returns the symbol of the unit.
     @return a char representing the symbol of the unit.
     */
    public char getSymbol() {
        return this.symbol;
    }

    /**
     Returns the name of the unit.
     @return a string representing the name of the unit.
     */
    public String getName() {
        return this.name;
    }

    /**
     Returns the health of the unit.
     @return a double representing the health of the unit.
     */
    public double getHealth() {
        return this.health;
    }

    /**
     Returns the health modifier of the unit.
     @return a double representing the health modifier of the unit.
     */
    public double getHealthModifier() {
        return this.healthModifier;
    }

    /**

     Returns the damage of the unit.
     @return a double representing the damage of the unit.
     */
    public double getDamage() {
        return this.damage;
    }

    /**

     Returns the damage modifier of the unit.
     @return a double representing the damage modifier of the unit.
     */
    public double getDamageModifier() {
        return this.damageModifier;
    }

    /**

     Returns the luck of the unit.
     @return an integer representing the luck of the unit.
     */
    public int getLuck() {
        return this.luck;
    }

    /**
     * Sets the x coordinate of the unit.
     * @return an integer representing the y coordinate of the unit.
     */
    public int getxCor() {
        return this.xCor;
    }

    /**
     * Returns the y coordinate of the unit.
     * @return an integer representing the y coordinate of the unit.
     */
    public int getyCor() {
        return this.yCor;
    }

    /**
     * Returns the movement of the unit.
     * @return an integer representing the movement of the unit.
     */
    public int getMovement() {
        return movement;
    }

    /**
     * Returns the movement modifier of the unit.
     * @return an integer representing the movement modifier of the unit.
     */
    public int getMovementModifier() {
        return movementModifier;
    }

    /**
     * Returns the team color of the unit.
     * @return a string representing the team color of the unit.
     */
    public String getTeamColor() {
        return teamColor;
    }

// SETTERS

    /**
     * Sets the symbol of the unit.
     * @param symbol a char representing the symbol of the unit.
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Sets the name of the unit.
     * @param name a string representing the name of the unit.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the health of the unit.
     * @param health a double representing the health of the unit.
     */
    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * Sets the health modifier of the unit.
     * @param healthModifier a double representing the health modifier of the unit.
     */
    public void setHealthModifier(double healthModifier) {
        this.healthModifier = healthModifier;
    }

    /**
     * Sets the damage of the unit.
     * @param damage a double representing the damage of the unit.
     */
    public void setDamage(double damage) {
        this.damage = damage;
    }

    /**
     * Sets the damage modifier of the unit.
     * @param damageModifier a double representing the damage modifier of the unit.
     */
    public void setDamageModifier(double damageModifier) {
        this.damageModifier = damageModifier;
    }

    /**
     * Sets the luck of the unit.
     * @param luck an integer representing the luck of the unit.
     */
    public void setLuck(int luck) {
        this.luck = luck;
    }

    /**
     * Sets the x coordinate of the unit.
     * @param xCor an integer representing the x coordinate of the unit.
     */
    public void setxCor(int xCor) {
        this.xCor = xCor;
    }

    /**
     * Sets the y coordinate of the unit.
     * @param yCor an integer representing the y coordinate of the unit.
     */
    public void setyCor(int yCor) {
        this.yCor = yCor;
    }

    /**
     * Sets the movement of the unit.
     * @param movement an integer representing the movement of the unit.
     */
    public void setMovement(int movement) {
        this.movement = movement;
    }

    /**
     * Sets the movement modifier of the unit.
     * @param movementModifier an integer representing the movement modifier of the unit.
     */
    public void setMovementModifier(int movementModifier) {
        this.movementModifier = movementModifier;
    }

    /**
     * Sets the team color of the unit.
     * @param teamColor a string representing the team color of the unit.
     */
    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }

    // toString

    /**
     * Returns a string representation of the unit.
     * @return a string representation of the unit.
     */
    @Override
    public String toString() {
        return teamColor + " " + symbol;
    }
}