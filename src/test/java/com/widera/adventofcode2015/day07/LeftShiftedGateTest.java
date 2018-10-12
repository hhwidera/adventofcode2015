package com.widera.adventofcode2015.day07;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LeftShiftedGateTest {

    @Test
    void test() {
        Map<String, Gate> gateMap = new HashMap<>();
        gateMap.put("123", SimpleGate.of(123));
        gateMap.put("2", SimpleGate.of(2));
        assertEquals(492, new LeftShiftedGate("123", "2", gateMap).run());
    }
}