package com.widera.adventofcode2015.day01;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FloorCounterTest {

    @Test
    void example1() {
        assertEquals(0, FloorCounter.count("(())"));
        assertEquals(0, FloorCounter.count("()()"));
    }

    @Test
    void example2() {
        assertEquals(3, FloorCounter.count("((("));
        assertEquals(3, FloorCounter.count("(()(()("));
    }

    @Test
    void example3() {
        assertEquals(3, FloorCounter.count("))((((("));
    }

    @Test
    void example4() {
        assertEquals(-1, FloorCounter.count("())"));
        assertEquals(-1, FloorCounter.count("))("));
    }

    @Test
    void example5() {
        assertEquals(-3, FloorCounter.count(")))"));
        assertEquals(-3, FloorCounter.count(")())())"));
    }

    @Test
    void example_basement_1() {
        assertEquals(1, FloorCounter.positionOfFirstBasement(")"));
    }

    @Test
    void example_basement_2() {
        assertEquals(5, FloorCounter.positionOfFirstBasement("()())"));
    }
}