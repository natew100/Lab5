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

public class TomJerryUnit {
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
    private boolean homingRocket;
    private boolean offerCheese;
    private boolean hiding;

    // constructor with parameters
    public TomJerryUnit(char symbol, String name, double health, double healthModifier, double damage, double damageModifier,
                        int luck, int xCor, int yCor, int movement, int movementModifier, boolean homingRocket,
                        boolean offerCheese, boolean hiding) {
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
        this.homingRocket = homingRocket;
        this.offerCheese = offerCheese;
        this.hiding = hiding;
    }

    public TomJerryUnit() {
        this('T', "Tom & Jerry", 100.0, 0.0, 25.0, 0.0, 0,
                5, 5,1, 0, true, true, false);
    }


    // ACCESSOR/GET METHODS
    public char getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public double getHealth() {
        return this.health;
    }

    public double getHealthModifier() {
        return this.healthModifier;
    }

    public double getDamage() {
        return this.damage;
    }

    public double getDamageModifier() {
        return this.damageModifier;
    }

    public int getLuck() {
        return this.luck;
    }

    public int getxCor() {
        return this.xCor;
    }

    public int getyCor() {
        return this.yCor;
    }

    public int getMovement() {
        return movement;
    }

    public int getMovementModifier() {
        return movementModifier;
    }

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
}
