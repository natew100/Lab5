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
    public abstract Unit spawn();

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

    public String getTeamColor() {
        return teamColor;
    }

    // SETTERS
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

    public void setTeamColor(String red) {
        this.teamColor = teamColor;
    }

    // to string
    @Override
    public String toString() {
        return teamColor + " " + symbol;
    }


}
