package com.widera.adventofcode2015.day07;

import com.widera.adventofcode2015.FileInput;

class Day07Part2 {

    public static void main(String[] args) {
        GateSystem gateSystem = new GateSystem(FileInput.readLinesAsString("input-day07.txt"));
        int signalOfWireA = gateSystem.readWire("a");
        gateSystem.invalidCache();
        gateSystem.writeWire("b", signalOfWireA);
        System.out.println("wire a: " + gateSystem.readWire("a"));
    }
}
