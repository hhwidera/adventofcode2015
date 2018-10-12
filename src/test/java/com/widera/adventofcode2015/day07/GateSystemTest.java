package com.widera.adventofcode2015.day07;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GateSystemTest {

    @Test
    void test() {
        List<String> instructions = Arrays.asList(
                "x LSHIFT 2 -> f",
                "y RSHIFT 2 -> g",
                "123 -> x",
                "456 -> y",
                "x AND y -> d",
                "x OR y -> e",
                "NOT x -> h",
                "NOT y -> i");
        GateSystem gateSystem = new GateSystem(instructions);
        assertEquals(72, gateSystem.readWire("d"));
        assertEquals(507, gateSystem.readWire("e"));
        assertEquals(492, gateSystem.readWire("f"));
        assertEquals(114, gateSystem.readWire("g"));
        assertEquals(65412, gateSystem.readWire("h"));
        assertEquals(65079, gateSystem.readWire("i"));
        assertEquals(123, gateSystem.readWire("x"));
        assertEquals(456, gateSystem.readWire("y"));
    }

    @Test
    void testWriteWire() {
        List<String> instructions = Arrays.asList(
                "x -> f",
                "123 -> x");
        GateSystem gateSystem = new GateSystem(instructions);
        gateSystem.writeWire("x", 444);
        assertEquals(444, gateSystem.readWire("f"));
    }
}