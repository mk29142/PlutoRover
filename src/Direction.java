package src;

import src.Rover;

public enum Direction {

    N(0, 1, Rotation.RIGHT, Rotation.RIGHT),
    E(1, 0, Rotation.RIGHT, Rotation.RIGHT), 
    S(0, -1, Rotation.RIGHT, Rotation.RIGHT), 
    W(-1, 0, Rotation.RIGHT, Rotation.RIGHT);

    private int deltaX;
    private int deltaY;
    private Rotation reflX;
    private Rotation reflY;

    private Direction(int deltaX, int deltaY, Rotation reflX, Rotation reflY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.reflX = reflX;
        this.reflY = reflY;
    }

    public int getdX() {
        return deltaX;
    }

    public int getdY() {
        return deltaY;
    }

    public Direction rotate(Rotation rotation) {
        int index = (rotation == Rotation.LEFT ? ordinal() - 1
                : ordinal() + 1);
        if (index < 0 | index > 3) {
            index = 4 - Math.abs(index);
        }
        return Direction.values()[index];
    }
}