package com.widera.adventofcode2015.day05;

import com.widera.adventofcode2015.FileInput;

public class Day05Part1 {

    public static void main(String[] args) {
        long sizeOfNiceStrings = FileInput.readLinesAsString("input-day05.txt").stream()
                .map(NiceString::new)
                .filter(NiceString::isNice)
                .count();
        System.out.println("Size of nice strings: " + sizeOfNiceStrings);
    }
}
