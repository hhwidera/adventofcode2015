package com.widera.adventofcode2015.day07;

class SimpleGate implements Gate {

    static SimpleGate of(int number) {
        return new SimpleGate(number);
    }

    private final int number;

    private SimpleGate(int number) {
        this.number = number;
    }

    @Override
    public int run() {
        return number;
    }

    @Override
    public void invalidCache() {

    }
}
