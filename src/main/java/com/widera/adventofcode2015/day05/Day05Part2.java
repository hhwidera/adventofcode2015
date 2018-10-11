package com.widera.adventofcode2015.day05;

import com.widera.adventofcode2015.FileInput;

class Day05Part2 {

    public static void main(String[] args) {
        long sizeOfNiceStrings = FileInput.readLinesAsString("input-day05.txt").stream()
                .map(NiceString::new)
                .filter(NiceString::isNicePart2)
                .count();
        System.out.println("Size of nice strings part 2: " + sizeOfNiceStrings);
    }
}
