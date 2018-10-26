package com.widera.adventofcode2015.day11;


class Day11Part1 {

    public static void main(String[] args) {
        Password password = Password.of("hxbxwxba");
        System.out.println("Next password: " + password.nextValidPassword());
    }
}
