package com.widera.adventofcode2015.day06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightGridBrightnessTest {

    @Test
    void testLightOn() {
        LightGridBrightness grid = new LightGridBrightness();
        grid.turnOn(10, 10);
        assertEquals(1, grid.sizeOfLitLightBrightness());
    }

    @Test
    void testLightOff() {
        LightGridBrightness grid = new LightGridBrightness();
        grid.turnOn(10, 10);
        grid.turnOff(10, 10);
        grid.turnOff(10, 10);
        grid.turnOff(10, 10);
        assertEquals(0, grid.sizeOfLitLightBrightness());
    }

    @Test
    void testToggle() {
        LightGridBrightness grid = new LightGridBrightness();
        assertEquals(0, grid.sizeOfLitLightBrightness());
        grid.toggle(10,10);
        assertEquals(2, grid.sizeOfLitLightBrightness());
    }
}