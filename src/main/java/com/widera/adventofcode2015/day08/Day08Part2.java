package com.widera.adventofcode2015.day08;

import com.widera.adventofcode2015.FileInput;

class Day08Part2 {

    public static void main(String[] args) {
        int sum = FileInput.readLinesAsString("input-day08.txt").stream()
                .map(SpecialString::new)
                .mapToInt(specialString ->
                        specialString.encode().numberOfCharactersOfCode()
                        - specialString.numberOfCharactersOfCode())
                .sum();
        System.out.println("Total number of characters to represent the newly encoded strings " +
                "minus the number of characters of code in each original string literal: " + sum);
    }
}
