package com.widera.adventofcode2015.day01;

import com.widera.adventofcode2015.FileInput;

public class Day01Part2 {

    public static void main(String[] args) {
        String input = FileInput.readAsString("input-day01.txt");
        System.out.println("First basement position: " + FloorCounter.positionOfFirstBasement(input));
    }
}
