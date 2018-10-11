package com.widera.adventofcode2015.day01;

import com.widera.adventofcode2015.FileInput;

class Day01Part1 {

    public static void main(String[] args) {
        String input = FileInput.readAsString("input-day01.txt");
        System.out.println("Floor: " + FloorCounter.count(input));
    }
}
