package com.widera.adventofcode2015.day07;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AndGateTest {

    @Test
    void test() {
        Map<String, Gate> gateMap = new HashMap<>();
        gateMap.put("123", SimpleGate.of(123));
        gateMap.put("456", SimpleGate.of(456));
        assertEquals(72, new AndGate("123", "456", gateMap).run());
    }
}