package com.widera.adventofcode2015.day03;

import com.widera.adventofcode2015.FileInput;

import java.util.HashSet;
import java.util.Set;

public class Day03Part2 {

    public static void main(String[] args) {
        Santa santa = new Santa();
        Santa roboSanta = new Santa();
        boolean isMoveSanta = true;
        for (String move : FileInput.readAsString("input-day03.txt").split("")) {
            if (isMoveSanta) {
                santa.move(move);
            } else {
                roboSanta.move(move);
            }
            isMoveSanta = !isMoveSanta;
        }
        Set<Santa.Position> allVisitedHouses = new HashSet<>(santa.visitedHouses());
        allVisitedHouses.addAll(roboSanta.visitedHouses());
        System.out.println("Houses receive at least one present by santa and robo-santa: " + allVisitedHouses.size());
    }
}
