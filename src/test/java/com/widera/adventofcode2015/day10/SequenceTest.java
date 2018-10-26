package com.widera.adventofcode2015.day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {

    @Test
    void testExample1() {
        assertEquals("11", new Sequence("1").lookAndSay().toString());
    }

    @Test
    void testExample2() {
        assertEquals("21", new Sequence("11").lookAndSay().toString());
    }

    @Test
    void testExample3() {
        assertEquals("1211", new Sequence("21").lookAndSay().toString());
    }

    @Test
    void testExample4() {
        assertEquals("111221", new Sequence("1211").lookAndSay().toString());
    }

    @Test
    void testExample5() {
        assertEquals("312211", new Sequence("111221").lookAndSay().toString());
    }
}