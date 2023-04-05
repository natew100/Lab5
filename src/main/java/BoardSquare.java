/**
 * <h1>BoardSquare</h1>
 *
 * This class represents a square on the board. It contains information about whether the square
 * is empty or not, what type of unit is on the square (if any), and the color of the square.
 *
 * @author Nathan Wolf, Aditya Gill, Ethan Fassnacht
 * @version 1.0
 * @since 2023-04-04
 */
public class BoardSquare {

    private boolean empty; // whether the square is empty or not
    private Unit unit; // the unit on the square (if any)
    private String squareColor; // the color of the square

    /**
     * Creates a new BoardSquare object with the specified color.
     *
     * @param squareColor the color of the square
     */
    public BoardSquare(String squareColor) {
        this.squareColor = squareColor;
        this.empty = true;
        this.unit = null;
    }

    // GETTER METHODS

    /**
     * Returns the unit on the square.
     *
     * @return the unit on the square (or null if there is no unit)
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * Returns whether the square is empty or not.
     *
     * @return true if the square is empty, false otherwise
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * Returns the color of the square.
     *
     * @return the color of the square
     */
    public String getSquareColor() {
        return squareColor;
    }

    // SETTER METHODS

    /**
     * Sets the unit on the square to the specified unit.
     *
     * @param unit the unit to set on the square
     */
    public void setUnit(Unit unit) {
        this.unit = unit;
        this.empty = (unit == null);
    }

    /**
     * Removes the unit from the square and returns it.
     *
     * @return the unit that was removed (or null if there was no unit on the square)
     */
    public Unit removeUnit() {
        Unit removedUnit = this.unit;
        this.unit = null;
        this.empty = true;
        return removedUnit;
    }

    // TO STRING

    /**
     * Returns a string representation of the square. If the square is empty, the string will be
     * "-------". If the square contains a unit, the string will be "-<unit>-".
     *
     * @return a string representation of the square
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "-------";
        }
        else {
            return "-" + unit.toString() + "-";
        }
    }
}
