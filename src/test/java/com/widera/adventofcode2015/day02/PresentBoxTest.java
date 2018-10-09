package com.widera.adventofcode2015.day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PresentBoxTest {

    @Test
    void example1() {
        assertEquals(58, new PresentBox(2, 3, 4).squareFeetOfWrappingPaper());
    }

    @Test
    void example2() {
        assertEquals(43, new PresentBox(1, 1, 10).squareFeetOfWrappingPaper());
    }

    @Test
    void exampleRibbon1() {
        assertEquals(34, new PresentBox(2, 3, 4).feetOfRibbon());
    }

    @Test
    void exampleRibbon2() {
        assertEquals(14, new PresentBox(1, 1, 10).feetOfRibbon());
    }
}