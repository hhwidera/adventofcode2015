package com.widera.adventofcode2015.day10;

class Day10Part1 {

    public static void main(String[] args) {
        Sequence sequence = new Sequence("1113222113");
        for (int i = 0; i < 40; i++) {
            sequence = sequence.lookAndSay();
        }
        System.out.println("Final sequence: " + sequence);
        System.out.println("Length of final sequence: " + sequence.toString().length());
    }
}
