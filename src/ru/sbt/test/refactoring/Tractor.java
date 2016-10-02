package ru.sbt.test.refactoring;

public class Tractor {

    private Position position;
    private final Field field;
    private Orientation orientation;

    public Tractor(Position position, Field field, Orientation orientation) {
        this.position = position;
        this.field = field;
        this.orientation = orientation;
    }

    public void move(String command) {
        if (command.equals("F")) {
            moveForwards();
        }
        else if (command.equals("T")) {
            turnClockwise();
        }
    }

    private void moveForwards() {
        position = orientation.moveForwards(position);
        if(field.isOutOfBorder(position))
            throw new TractorInDitchException();
    }

    private void turnClockwise() {
        orientation = orientation.turnClockwise();
    }

    public int getPositionX() {
        return position.getX();
    }

    public int getPositionY() {
        return position.getY();
    }

    public Orientation getOrientation() {
        return orientation;
    }

}
