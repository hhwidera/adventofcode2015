package com.widera.adventofcode2015.day07;

import java.util.Map;

class OrGate extends AbstractTwoInputLogicGate {

    OrGate(final String inputA, final String inputB, final Map<String, Gate> gateMap) {
        super(inputA, inputB, gateMap);
    }

    @Override
    public int calculate() {
        return this.inputA().run() | this.inputB().run() & 0x0000FFFF;
    }
}
