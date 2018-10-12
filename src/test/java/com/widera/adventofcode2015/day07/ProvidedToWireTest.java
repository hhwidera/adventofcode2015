package com.widera.adventofcode2015.day07;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProvidedToWireTest {

    @Test
    void test() {
        Map<String, Gate> gateMap = new HashMap<>();
        gateMap.put("a", SimpleGate.of(123));
        assertEquals(123, new ProvidedToWire("a", gateMap).run());
    }
}