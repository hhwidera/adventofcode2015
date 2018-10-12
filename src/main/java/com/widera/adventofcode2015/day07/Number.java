package com.widera.adventofcode2015.day07;

class Number implements Gate {

    private final int value;

    Number(final String numberAsString) {
        this.value = Integer.parseInt(numberAsString);
    }

    Number(final int value) {
        this.value = value;
    }

    @Override
    public int run() {
        return this.value;
    }

    @Override
    public void invalidCache() {
        // not needed here
    }
}
