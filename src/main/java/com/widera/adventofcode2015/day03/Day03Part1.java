package com.widera.adventofcode2015.day03;

import com.widera.adventofcode2015.FileInput;

public class Day03Part1 {

    public static void main(String[] args) {
        Santa santa = new Santa();
        for (String move : FileInput.readAsString("input-day03.txt").split("")) {
            santa.move(move);
        }
        System.out.println("Houses receive at least one present: " + santa.visitedHousesSize());
    }
}
