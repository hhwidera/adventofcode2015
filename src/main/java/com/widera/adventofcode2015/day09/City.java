package com.widera.adventofcode2015.day09;

import java.util.Objects;

class City {

    static final City EMPTY = new City("");

    static City of(final String name) {
        return new City(name);
    }

    private final String name;

    private City(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
