package com.widera.adventofcode2015.day06;

class Instruction {

    private final String instructionString;

    Instruction(final String instructionString) {
        this.instructionString = instructionString;
    }

    boolean isTypeToggle() {
        return this.instructionString.startsWith("toggle");
    }

    boolean isTypeTurnOn() {
        return this.instructionString.startsWith("turn on");
    }

    boolean isTypeTurnOff() {
        return this.instructionString.startsWith("turn off");
    }

    void runOn(final LightGridManipulation lightGrid) {
        String[] words = this.instructionString.split(" ");
        String[] sourceCoordinates = words[words.length - 3].split(",");
        String[] targetCoordinates = words[words.length - 1].split(",");

        for (int x = Integer.parseInt(sourceCoordinates[0]); x <= Integer.parseInt(targetCoordinates[0]); x++) {
            for (int y = Integer.parseInt(sourceCoordinates[1]); y <= Integer.parseInt(targetCoordinates[1]); y++) {
                if (isTypeToggle()) {
                    lightGrid.toggle(x, y);
                } else if (isTypeTurnOn()) {
                    lightGrid.turnOn(x, y);
                } else {
                    lightGrid.turnOff(x, y);
                }
            }
        }

    }
}
