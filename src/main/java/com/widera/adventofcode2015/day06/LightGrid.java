package com.widera.adventofcode2015.day06;

class LightGrid implements LightGridManipulation {

    private final boolean[][] grid =  new boolean[1000][1000];

    @Override
    public void turnOn(int x, int y) {
        this.grid[x][y] = true;
    }

    int sizeOfLitLight() {
        int sum = 0;
        for (boolean[] line : grid) {
            for (boolean light : line) {
                if (light) {
                    sum++;
                }
            }
        }
        return sum;
    }

    @Override
    public void turnOff(int x, int y) {
        grid[x][y] = false;
    }

    @Override
    public void toggle(int x, int y) {
        grid[x][y] = !grid[x][y];
    }

    void run(Instruction instruction) {
        instruction.runOn(this);
    }
}
