public class BoardSquare {
    private boolean empty;
    private Unit unit;
    private String squareColor;

    public BoardSquare(String squareColor) {
        this.squareColor = squareColor;
        this.empty = true;
        this.unit = null;
    }

    public Unit getUnit() {
        return unit;
    }

    public boolean isEmpty() {
        return empty;
    }

    public String getSquareColor() {
        return squareColor;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
        this.empty = (unit == null);
    }

    public Unit removeUnit() {
        Unit removedUnit = this.unit;
        this.unit = null;
        this.empty = true;
        return removedUnit;
    }

    @Override
    public String toString() {
        if (isEmpty() == true) {
            return "-------";
        }
        else {
            return "-" + unit.toString() + "-";
        }
    }
}
