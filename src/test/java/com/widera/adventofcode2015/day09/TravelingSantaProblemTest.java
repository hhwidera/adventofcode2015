package com.widera.adventofcode2015.day09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TravelingSantaProblemTest {

    @Test
    void testExampleTestCities() {
        TravelingSantaProblem travelingSantaProblem = new TravelingSantaProblem();
        travelingSantaProblem.addDistance(City.of("London"), City.of("Dublin"), 464L);
        travelingSantaProblem.addDistance(City.of("London"), City.of("Belfast"), 518L);
        travelingSantaProblem.addDistance(City.of("Dublin"), City.of("Belfast"), 141L);

        assertEquals(3, travelingSantaProblem.cityList().size());
        assertTrue(travelingSantaProblem.cityList().contains(City.of("London")));
        assertTrue(travelingSantaProblem.cityList().contains(City.of("Belfast")));
        assertTrue(travelingSantaProblem.cityList().contains(City.of("Dublin")));
    }

    @Test
    void testExampleTestShortestDistance() {
        TravelingSantaProblem travelingSantaProblem = new TravelingSantaProblem();
        travelingSantaProblem.addDistance(City.of("London"), City.of("Dublin"), 464L);
        travelingSantaProblem.addDistance(City.of("London"), City.of("Belfast"), 518L);
        travelingSantaProblem.addDistance(City.of("Dublin"), City.of("Belfast"), 141L);

        assertEquals(605L, travelingSantaProblem.distanceOfShortestRoute());
    }

    @Test
    void testExampleTestLongestDistance() {
        TravelingSantaProblem travelingSantaProblem = new TravelingSantaProblem();
        travelingSantaProblem.addDistance(City.of("London"), City.of("Dublin"), 464L);
        travelingSantaProblem.addDistance(City.of("London"), City.of("Belfast"), 518L);
        travelingSantaProblem.addDistance(City.of("Dublin"), City.of("Belfast"), 141L);

        assertEquals(982L, travelingSantaProblem.distanceOfLongestRoute());
    }
}