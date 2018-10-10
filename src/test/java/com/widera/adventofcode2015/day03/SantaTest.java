package com.widera.adventofcode2015.day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SantaTest {

    @Test
    void example1() {
        Santa santa = new Santa();
        santa.move(">");
        assertEquals(2, santa.visitedHousesSize());
    }

    @Test
    void example2() {
        Santa santa = new Santa();
        for (String move : "^>v<".split("")) {
            santa.move(move);
        }
        assertEquals(4, santa.visitedHousesSize());
    }

    @Test
    void example3() {
        Santa santa = new Santa();
        for (String move : "^v^v^v^v^v".split("")) {
            santa.move(move);
        }
        assertEquals(2, santa.visitedHousesSize());
    }

}