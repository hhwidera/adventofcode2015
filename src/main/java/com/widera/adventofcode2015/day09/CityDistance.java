package com.widera.adventofcode2015.day09;

import java.util.Arrays;
import java.util.Objects;

class CityDistance {

    static final CityDistance EMPTY_DISTANCE = new CityDistance(City.EMPTY, City.EMPTY, 0L);

    private final City[] cities;
    private final long distance;

    CityDistance(final City cityA, final City cityB, final long distance) {
        this.cities = new City[]{cityA, cityB};
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityDistance that = (CityDistance) o;
        return distance == that.distance &&
                Arrays.equals(cities, that.cities);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(distance);
        result = 31 * result + Arrays.hashCode(cities);
        return result;
    }

    boolean between(final City cityA, final City cityB) {
        return (this.cities[0].equals(cityA) && this.cities[1].equals(cityB)) ||
                (this.cities[0].equals(cityB) && this.cities[1].equals(cityA));
    }

    long distance() {
        return this.distance;
    }
}
