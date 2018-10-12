package com.widera.adventofcode2015.day07;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NotGateTest {

    @Test
    void test() {
        Map<String, Gate> gateMap = new HashMap<>();
        gateMap.put("123", SimpleGate.of(123));
        assertEquals(65412, new NotGate("123", gateMap).run());
    }
}