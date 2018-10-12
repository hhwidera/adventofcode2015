package com.widera.adventofcode2015.day07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void test() {
        assertEquals(123, new Number("123").run());
    }
}