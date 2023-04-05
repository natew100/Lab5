/**
 * <h1>TomJerryUnit</h1>
 * TomJerryUnit is a subclass of the Unit class and represents a unit in the game with Tom and Jerry theme.
 *
 * @author Nathan Wolf, Aditya Gill, Ethan Fassnacht
 * @version 1.0
 * @since 2023-04-04
 */

public class TomJerryUnit extends Unit {
    // initializing variables

    private boolean homingRocket;
    private boolean offerCheese;
    private boolean hiding;
    private int numTimesSpawned;

    /**
     * Constructor for TomJerryUnit.
     *
     * @param symbol           a char representing the symbol of the unit.
     * @param name             a string representing the name of the unit.
     * @param health           a double representing the health of the unit.
     * @param healthModifier   a double representing the health modifier of the unit.
     * @param damage           a double representing the damage of the unit.
     * @param damageModifier   a double representing the damage modifier of the unit.
     * @param luck             an integer representing the luck of the unit.
     * @param xCor             an integer representing the x coordinate of the unit.
     * @param yCor             an integer representing the y coordinate of the unit.
     * @param movement         an integer representing the movement of the unit.
     * @param movementModifier an integer representing the movement modifier of the unit.
     * @param homingRocket     a boolean representing whether the unit has homing rockets or not.
     * @param offerCheese      a boolean representing whether the unit can offer cheese to enemies or not.
     * @param hiding           a boolean representing whether the unit is hiding or not.
     * @param teamColor        a string representing the team color of the unit.
     */

    // constructor with parameters
    public TomJerryUnit(char symbol, String name, double health, double healthModifier, double damage, double damageModifier,
                        int luck, int xCor, int yCor, int movement, int movementModifier, boolean homingRocket,
                        boolean offerCheese, boolean hiding, String teamColor) {
        super(symbol, name, health, healthModifier, damage, damageModifier, luck, xCor,
                yCor, movement, movementModifier, teamColor);
        this.homingRocket = homingRocket;
        this.offerCheese = offerCheese;
        this.hiding = hiding;
    }

    /**
     * Default constructor for TomJerryUnit.
     */
    public TomJerryUnit() {
        this('T', "Tom & Jerry", 100.0, 0.0, 25.0, 0.0, 0,
                5, 5, 1, 0, true, true,
                false, "Default Team");
    }

    // ACCESSOR/GET METHODS

    /**
     * Returns whether the unit has homing rockets or not.
     *
     * @return a boolean representing whether the unit has homing rockets or not.
     */
    public boolean canHomingRocket() {
        return homingRocket;
    }

    /**
     * Returns whether the unit can offer cheese to enemies or not.
     *
     * @return a boolean representing whether the unit can offer cheese to enemies or not.
     */
    public boolean canOfferCheese() {
        return offerCheese;
    }

    /**
     * Returns whether the unit is hiding or not.
     *
     * @return a boolean representing whether the unit is hiding or not.
     */
    public boolean isHiding() {
        return hiding;
    }


    // MUTATOR/SET METHODS

    /**
     * Sets the homing rocket property of the unit.
     *
     * @param homingRocket a boolean representing whether the unit has homing rockets or not.
     */
    public void setHomingRocket(boolean homingRocket) {
        this.homingRocket = homingRocket;
    }

    /**
     * Sets the offer cheese property of the unit.
     *
     * @param offerCheese a boolean representing whether the unit can offer cheese to enemies or not.
     */
    public void setOfferCheese(boolean offerCheese) {
        this.offerCheese = offerCheese;
    }

    /**
     * Sets the hiding property of the unit.
     *
     * @param hiding a boolean representing whether the unit is hiding or not.
     */
    public void setHiding(boolean hiding) {
        this.hiding = hiding;
    }

    /**
     * Updates the health of the unit after taking damage, if the unit is not hiding.
     * If the unit is hiding, prints a message saying no damage is subtracted.
     *
     * @param damage a double representing the amount of damage taken by the unit.
     */
    public void takeDamage(double damage) {
        if (isHiding()) {
            System.out.println("No Damage Subtracted");
        } else {
            System.out.println("Subtracted Damage");
            this.health -= damage;
        }
    }

    /**
     * Spawns a new TomJerryUnit with default properties.
     *
     * @return a new TomJerryUnit instance.
     */
    @Override
    public TomJerryUnit spawn() {
        TomJerryUnit newUnit = new TomJerryUnit(
                't',
                "Tom & Jerry",
                100.0,
                0.0,
                25.0,
                0.0,
                0,
                1,
                1,
                1,
                0,
                true,
                true,
                false,
                "Default Color");
        numTimesSpawned++;
        return newUnit;
    }
}
