package com.widera.adventofcode2015.day06;

import com.widera.adventofcode2015.FileInput;

class Day06Part1 {

    public static void main(String[] args) {
        LightGrid grid = new LightGrid();
        FileInput.readLinesAsString("input-day06.txt").stream()
                .map(Instruction::new)
                .forEach(grid::run);
        System.out.println("Size of lint lights: " + grid.sizeOfLitLight());
    }
}
