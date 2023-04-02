/**
 * <h1>TomJerryUnit</h1>
 * <h2>CISC 181-020L Spring 2023</h2>
 * <h3>University of Delaware</h3>
 *
 * @author Nathan Wolf
 */

/**
 * The TomJerryUnit class represents a unit of Tom and Jerry.
 * It has attributes such as symbol, name, health, health modifier,
 * damage, damage modifier, luck, x-coordinate, y-coordinate, movement,
 * movement modifier, homing rocket, offer cheese, and hiding. It also
 * contains methods for dealing damage, taking damage, and modifying
 * the attributes of the unit.
 **/

public class TomJerryUnit extends Unit {
    // initializing variables

    private boolean homingRocket;
    private boolean offerCheese;
    private boolean hiding;
    private int numTimesSpawned;

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

    public TomJerryUnit() {
        this('T', "Tom & Jerry", 100.0, 0.0, 25.0, 0.0, 0,
                5, 5,1, 0, true, true,
                false, "Default Team");
    }

    // ACCESSOR/GET METHODS

    public boolean canHomingRocket() {
        return homingRocket;
    }

    public boolean canOfferCheese() {
        return offerCheese;
    }

    public boolean isHiding() {
        return hiding;
    }


    // MUTATOR/SET METHODS


    public void setHomingRocket(boolean homingRocket) {
        this.homingRocket = homingRocket;
    }

    public void setOfferCheese(boolean offerCheese) {
        this.offerCheese = offerCheese;
    }

    public void setHiding(boolean hiding) {
        this.hiding = hiding;
    }

    // method that updates damage based on homing rocket
    public double dealDamage() {
        double totalDamage = this.damage + this.damageModifier;
        if (canHomingRocket() == true) {
            totalDamage = this.damage + this.damageModifier + 10.0;
        }
        return totalDamage;
    }

    // method that updates damage if not hiding
    public void takeDamage(double damage) {
        if (isHiding() == true) {
            System.out.println("No Damage Subtracted");
        }
        else {
            System.out.println("Subtracted Damage");
            this.health -= damage;
        }
    }

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
                this.getTeamColor());
        numTimesSpawned++;
        return newUnit;
    }
}
