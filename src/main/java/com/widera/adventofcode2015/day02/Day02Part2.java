package com.widera.adventofcode2015.day02;

import com.widera.adventofcode2015.FileInput;

public class Day02Part2 {

    public static void main(String[] args) {
        int totalFeetOfRibbon = FileInput.readLinesAsString("input-day02.txt").stream()
                .map(line -> line.split("x"))
                .map(dimensionsAsString -> new int[] {Integer.valueOf(dimensionsAsString[0]), Integer.valueOf(dimensionsAsString[1]), Integer.valueOf(dimensionsAsString[2])})
                .map(dimensions -> new PresentBox(dimensions[0], dimensions[1], dimensions[2]))
                .mapToInt(PresentBox::feetOfRibbon)
                .sum();
        System.out.println("Total feet of ribbon: " + totalFeetOfRibbon);
    }
}
