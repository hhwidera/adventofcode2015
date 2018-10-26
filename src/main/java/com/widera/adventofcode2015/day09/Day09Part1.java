package com.widera.adventofcode2015.day09;

import com.widera.adventofcode2015.FileInput;

class Day09Part1 {

    public static void main(String[] args) {
        TravelingSantaProblem travelingSantaProblem = new TravelingSantaProblem();

        FileInput.readLinesAsString("input-day09.txt").stream()
                .map(row -> row.split(" "))
                .forEach(rowParts -> travelingSantaProblem.addDistance(
                        City.of(rowParts[0]),
                        City.of(rowParts[2]),
                        Long.valueOf(rowParts[4])));

        System.out.println("Distance of the shortest route: " + travelingSantaProblem.distanceOfShortestRoute());
    }
}
