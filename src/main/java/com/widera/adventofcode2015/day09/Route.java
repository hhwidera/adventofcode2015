package com.widera.adventofcode2015.day09;

import java.util.HashSet;
import java.util.Set;

class Route {

    private final City actualCity;
    private final Set<City> possibleCities;
    private final Set<CityDistance> distances;

    Route(final City actualCity, final Set<City> possibleCities, final Set<CityDistance> distances) {
        this.actualCity = actualCity;
        this.possibleCities = possibleCities;
        this.distances = distances;
    }

    long shortestDistance() {
        if (this.possibleCities.isEmpty()) {
            return 0L;
        } else {
            long minDistance = Long.MAX_VALUE;
            for (City city : this.possibleCities) {
                CityDistance cityDistance = getCityDistanceFromActualCityTo(city);
                long routeDistance = cityDistance.distance()
                        + new Route(city, possibleCitiesWithout(city), this.distances).shortestDistance();
                if (routeDistance < minDistance) {
                    minDistance = routeDistance;
                }
            }
            return minDistance;
        }
    }

    private CityDistance getCityDistanceFromActualCityTo(final City city) {
        if (City.EMPTY.equals(this.actualCity)) {
            return CityDistance.EMPTY_DISTANCE;
        }
        for (CityDistance cityDistance : this.distances) {
            if (cityDistance.between(city, this.actualCity)) {
                return cityDistance;
            }
        }
        throw new IllegalArgumentException("can't find distance between " + actualCity + " and " + city);
    }

    private Set<City> possibleCitiesWithout(final City city) {
        Set<City> result = new HashSet<>(this.possibleCities);
        result.remove(city);
        return result;
    }

    long longestDistance() {
        if (this.possibleCities.isEmpty()) {
            return 0L;
        } else {
            long maxDistance = 0L;
            for (City city : this.possibleCities) {
                CityDistance cityDistance = getCityDistanceFromActualCityTo(city);
                long routeDistance = cityDistance.distance()
                        + new Route(city, possibleCitiesWithout(city), distances).longestDistance();
                if (routeDistance > maxDistance) {
                    maxDistance = routeDistance;
                }
            }
            return maxDistance;
        }
    }
}
