package com.widera.adventofcode2015.day07;

import java.util.Map;

abstract class AbstractTwoInputLogicGate implements Gate {
    private final String nameOfInputA;
    private final String nameOfInputB;
    private final Map<String, Gate> gateMap;
    private int result = -1;

    AbstractTwoInputLogicGate(String inputA, String inputB, Map<String, Gate> gateMap) {
        this.nameOfInputA = inputA;
        this.nameOfInputB = inputB;
        this.gateMap = gateMap;
    }

    Gate inputA() {
        return this.gateMap.get(this.nameOfInputA);
    }

    Gate inputB() {
        return this.gateMap.get(this.nameOfInputB);
    }

    abstract int calculate();

    @Override
    public int run() {
        if (this.result == -1) {
            this.result = calculate();
        }
        return this.result;
    }

    @Override
    public void invalidCache() {
        this.result = -1;
    }
}
