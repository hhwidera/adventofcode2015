package com.widera.adventofcode2015.day09;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class RouteTest {

    @Test
    void testShortestDistanceIsZeroIfNoPossibleCityLeft() {
        Route route = new Route(City.of("London"), Collections.emptySet(), Collections.emptySet());
        assertEquals(0L, route.shortestDistance());
    }

    @Test
    void testShortestDistanceWithOneCityLeft() {
        Route route = new Route(City.of("London"), Collections.singleton(City.of("Dublin")), Collections.singleton(new CityDistance(City.of("London"), City.of("Dublin"), 464)));
        assertEquals(464L, route.shortestDistance());
    }

    @Test
    void testShortestDistanceWithEmptyCityStart() {
        Route route = new Route(City.EMPTY, Collections.singleton(City.of("Dublin")), Collections.emptySet());
        assertEquals(0L, route.shortestDistance());
    }

    @Test
    void testLongestDistanceIsZeroIfNoPossibleCityLeft() {
        Route route = new Route(City.of("London"), Collections.emptySet(), Collections.emptySet());
        assertEquals(0L, route.longestDistance());
    }

    @Test
    void testLongestDistanceWithOneCityLeft() {
        Route route = new Route(City.of("London"), Collections.singleton(City.of("Dublin")), Collections.singleton(new CityDistance(City.of("London"), City.of("Dublin"), 464)));
        assertEquals(464L, route.longestDistance());
    }

    @Test
    void testLongestDistanceWithEmptyCityStart() {
        Route route = new Route(City.EMPTY, Collections.singleton(City.of("Dublin")), Collections.emptySet());
        assertEquals(0L, route.longestDistance());
    }
}