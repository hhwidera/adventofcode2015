package com.widera.adventofcode2015.day10;

class Sequence {

    private final String input;

    Sequence(final String input) {
        this.input = input;
    }

    Sequence lookAndSay() {
        StringBuilder resultBuffer = new StringBuilder();
        char actualChar = this.input.charAt(0);
        int counterOfActualChar = 0;
        for (char character : input.toCharArray()) {
            if (actualChar == character) {
                counterOfActualChar++;
            } else {
                resultBuffer.append(counterOfActualChar);
                resultBuffer.append(actualChar);
                actualChar = character;
                counterOfActualChar = 1;
            }
        }
        resultBuffer.append(counterOfActualChar);
        resultBuffer.append(actualChar);
        return new Sequence(resultBuffer.toString());
    }

    @Override
    public String toString() {
        return input;
    }
}
