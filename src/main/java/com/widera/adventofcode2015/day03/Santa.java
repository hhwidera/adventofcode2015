package com.widera.adventofcode2015.day03;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Santa {

    private final Set<Position> visitedHouses = new HashSet<>();

    private Position actualPosition;

    Santa() {
        actualPosition = new Position(0, 0);
        visitedHouses.add(actualPosition);
    }

    int visitedHousesSize() {
        return visitedHouses.size();
    }

    void move(final String move) {
        switch (move) {
            case "^":
                actualPosition = actualPosition.north();
                break;
            case "v":
                actualPosition = actualPosition.south();
                break;
            case ">":
                actualPosition = actualPosition.east();
                break;
            case "<":
                actualPosition = actualPosition.west();
                break;
            default:
                break;
        }
        visitedHouses.add(actualPosition);
    }

    Set<Position> visitedHouses() {
        return Collections.unmodifiableSet(visitedHouses);
    }

    public class Position {
        private final int x;
        private final int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Position north() {
            return new Position(this.x, this.y + 1);
        }

        Position south() {
            return new Position(this.x, this.y - 1);
        }

        Position east() {
            return new Position(this.x + 1, this.y);
        }

        Position west() {
            return new Position(this.x - 1, this.y);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return x == position.x &&
                    y == position.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
