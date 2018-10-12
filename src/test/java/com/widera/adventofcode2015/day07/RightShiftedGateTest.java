package com.widera.adventofcode2015.day07;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RightShiftedGateTest {

    @Test
    void test() {
        Map<String, Gate> gateMap = new HashMap<>();
        gateMap.put("456", SimpleGate.of(456));
        gateMap.put("2", SimpleGate.of(2));
        assertEquals(114, new RightShiftedGate("456", "2", gateMap).run());
    }
}