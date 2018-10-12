package com.widera.adventofcode2015.day07;

import com.widera.adventofcode2015.FileInput;

class Day07Part1 {

    public static void main(String[] args) {
        GateSystem gateSystem = new GateSystem(FileInput.readLinesAsString("input-day07.txt"));
        System.out.println("wire a: " + gateSystem.readWire("a"));
    }
}
