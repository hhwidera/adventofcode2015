package com.widera.adventofcode2015.day06;

class LightGridBrightness implements LightGridManipulation {

    private final int[][] grid =  new int[1000][1000];

    @Override
    public void turnOn(int x, int y) {
        this.grid[x][y]++;
    }

    int sizeOfLitLightBrightness() {
        int sum = 0;
        for (int[] line : grid) {
            for (int light : line) {
                sum += light;
            }
        }
        return sum;
    }

    @Override
    public void turnOff(int x, int y) {
        if (grid[x][y] > 0) {
            grid[x][y]--;
        }
    }

    @Override
    public void toggle(int x, int y) {
        grid[x][y] += 2;
    }

    void run(Instruction instruction) {
        instruction.runOn(this);
    }
}
