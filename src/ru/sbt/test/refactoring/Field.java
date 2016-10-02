package ru.sbt.test.refactoring;

public class Field {
    private final int BorderX;
    private final int BorderY;

    public Field(int BorderX, int BorderY) {
        this.BorderX = BorderX;
        this.BorderY = BorderY;
    }

    public int getBorderX() {
        return BorderX;
    }

    public int getBorderY() {
        return BorderY;
    }

    public boolean isOutOfBorder(Position position){
        if (position.getX() > this.getBorderX() || position.getY() > this.getBorderY()) {
            return true;
        }
        return false;
    }
}
