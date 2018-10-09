package com.widera.adventofcode2015.day01;

import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class FloorCounter {

    private FloorCounter() {

    }

    private static final String GO_UP_STRING = "(";
    private static final int GO_UP = 1;
    private static final int GO_DOWN = -1;

    private static final ToIntFunction<String> mapper = instruction -> instruction.equals(GO_UP_STRING) ? GO_UP : GO_DOWN;

    private static IntStream stream(final String input) {
        return Stream.of(input.split("")).mapToInt(mapper);
    }

    static int count(final String input) {
        return stream(input).sum();
    }

    static int positionOfFirstBasement(final String input) {
        FindingFirstBasementPosition findingFirstBasementPosition = new FindingFirstBasementPosition();
        stream(input).forEach(findingFirstBasementPosition);
        return findingFirstBasementPosition.firstPosition();
    }

    static class FindingFirstBasementPosition implements IntConsumer {

        private int sum = 0;
        private int position = 0;
        private int firstPosition = -1;

        @Override
        public void accept(int value) {
            sum += value;
            position++;
            if (firstPosition == -1 && sum < 0) {
                firstPosition = position;
            }
        }

        int firstPosition() {
            return firstPosition;
        }
    }
}
