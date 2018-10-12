package com.widera.adventofcode2015.day07;

import java.util.Map;

class NotGate implements Gate {

    private final String from;
    private final Map<String, Gate> gateMap;
    private int result = -1;

    NotGate(final String from, final Map<String, Gate> gateMap) {
        this.from = from;
        this.gateMap = gateMap;
    }

    @Override
    public int run() {
        if (this.result == -1) {
            Gate fromGate = this.gateMap.get(this.from);
            this.result = ~fromGate.run() & 0x0000FFFF;
        }
        return this.result;
    }

    @Override
    public void invalidCache() {
        this.result = -1;
    }
}
