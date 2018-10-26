package com.widera.adventofcode2015.day09;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class TravelingSantaProblem {

    private final Set<City> cities = new HashSet<>();
    private final Set<CityDistance> distances = new HashSet<>();

    void addDistance(final City cityA, final City cityB, final long distance) {
        cities.add(cityA);
        cities.add(cityB);
        distances.add(new CityDistance(cityA, cityB, distance));
    }

    long distanceOfShortestRoute() {
        return new Route(City.EMPTY, cityList(), Collections.unmodifiableSet(this.distances)).shortestDistance();
    }

    Set<City> cityList() {
        return Collections.unmodifiableSet(this.cities);
    }

    long distanceOfLongestRoute() {
        return new Route(City.EMPTY, cityList(), Collections.unmodifiableSet(this.distances)).longestDistance();
    }
}
