package com.widera.adventofcode2015.day06;

import com.widera.adventofcode2015.FileInput;

class Day06Part2 {

    public static void main(String[] args) {
        LightGridBrightness grid = new LightGridBrightness();
        FileInput.readLinesAsString("input-day06.txt").stream()
                .map(Instruction::new)
                .forEach(grid::run);
        System.out.println("Total brightness: " + grid.sizeOfLitLightBrightness());
    }
}
