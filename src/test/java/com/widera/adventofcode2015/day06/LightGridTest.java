package com.widera.adventofcode2015.day06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightGridTest {

    @Test
    void testLightOn() {
        LightGrid grid = new LightGrid();
        grid.turnOn(10, 10);
        assertEquals(1, grid.sizeOfLitLight());
    }

    @Test
    void testLightOff() {
        LightGrid grid = new LightGrid();
        grid.turnOn(10, 10);
        grid.turnOff(10, 10);
        assertEquals(0, grid.sizeOfLitLight());
    }

    @Test
    void testToggle() {
        LightGrid grid = new LightGrid();
        assertEquals(0, grid.sizeOfLitLight());
        grid.toggle(10,10);
        assertEquals(1, grid.sizeOfLitLight());
        grid.toggle(10,10);
        assertEquals(0, grid.sizeOfLitLight());
    }

}