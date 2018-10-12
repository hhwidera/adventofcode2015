package com.widera.adventofcode2015.day07;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GateSystem {

    private final Map<String, String[]> instructions = new HashMap<>();
    private final Map<String, Gate> gateMap = new HashMap<>();

    GateSystem(final List<String> instructions) {
        instructions.stream().map(instruction -> instruction.split(" "))
                .forEach(instructionParts -> this.instructions.put(instructionParts[instructionParts.length - 1], instructionParts));
        buildGates();
    }

    private void buildGates() {
        for (Map.Entry<String, String[]> instruction : instructions.entrySet()) {
            String gateName = instruction.getKey();
            String[] instructionParts = instruction.getValue();
            Gate gate;
            Map<String, Gate> unmodifiableGateMap = Collections.unmodifiableMap(this.gateMap);
            if (instructionParts.length == 3) {
                String from = checkIfPartIsANumberThenAddToGateMap(instructionParts[0]);
                gate = new ProvidedToWire(from, unmodifiableGateMap);
            } else if (instructionParts.length == 4) {
                String from = checkIfPartIsANumberThenAddToGateMap(instructionParts[1]);
                gate = new NotGate(from, unmodifiableGateMap);
            } else {
                String inputA = checkIfPartIsANumberThenAddToGateMap(instructionParts[0]);
                String inputB = checkIfPartIsANumberThenAddToGateMap(instructionParts[2]);
                switch (instructionParts[1]) {
                    case "AND":
                        gate = new AndGate(inputA, inputB, Collections.unmodifiableMap(unmodifiableGateMap));
                        break;
                    case "OR":
                        gate = new OrGate(inputA, inputB, unmodifiableGateMap);
                        break;
                    case "LSHIFT":
                        gate = new LeftShiftedGate(inputA, inputB, unmodifiableGateMap);
                        break;
                    case "RSHIFT":
                        gate = new RightShiftedGate(inputA, inputB, unmodifiableGateMap);
                        break;
                    default:
                        throw new IllegalArgumentException("can't parse!");
                }
            }
            this.gateMap.put(gateName, gate);
        }
    }

    private String checkIfPartIsANumberThenAddToGateMap(final String instructionPart) {
        if (isANumber(instructionPart)) {
            Gate number = new Number(instructionPart);
            this.gateMap.put(instructionPart, number);
        }
        return instructionPart;
    }

    private boolean isANumber(String text) {
        return text.matches("-?\\d+");
    }

    void writeWire(final String wireName, final int value) {
        this.gateMap.put(wireName, new Number(value));
    }

    int readWire(final String wireNumber) {
        Gate gate = this.gateMap.get(wireNumber);
        return gate.run();
    }

    void invalidCache() {
        this.gateMap.values().forEach(Gate::invalidCache);
    }
}
