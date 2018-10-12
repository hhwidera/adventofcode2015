package com.widera.adventofcode2015.day08;

import com.widera.adventofcode2015.FileInput;

class Day08Part1 {

    public static void main(String[] args) {
        int sum = FileInput.readLinesAsString("input-day08.txt").stream()
                .map(SpecialString::new)
                .mapToInt(specialString -> specialString.numberOfCharactersOfCode() - specialString.numberOfCharacters())
                .sum();
        System.out.println("The number of characters of code for string literals minus " +
                "the number of characters in memory for the values of the strings in total: " + sum);
    }
}
