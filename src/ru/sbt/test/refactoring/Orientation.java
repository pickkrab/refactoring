package ru.sbt.test.refactoring;

public enum Orientation {

    NORTH {
        @Override
        public Position moveForwards(Position position) {
            return new Position(position.getX(), position.getY() + 1);
        }

        @Override
        public Orientation turnClockwise() {
            return EAST;
        }
    },
    WEST {
        @Override
        public Position moveForwards(Position position) {
            return new Position(position.getX() - 1, position.getY());
        }

        @Override
        public Orientation turnClockwise() {
            return NORTH;
        }
    },
    SOUTH {
        @Override
        public Position moveForwards(Position position) {
            return new Position(position.getX(), position.getY() - 1);
        }

        @Override
        public Orientation turnClockwise() {
            return WEST;
        }
    },
    EAST {
        @Override
        public Position moveForwards(Position position) {
            return new Position(position.getX() + 1, position.getY());
        }

        @Override
        public Orientation turnClockwise() {
            return SOUTH;
        }
    };

    public abstract Position moveForwards(Position position);

    public abstract Orientation turnClockwise();
}
