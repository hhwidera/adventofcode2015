package com.widera.adventofcode2015.day11;


class Day11Part2 {

    public static void main(String[] args) {
        Password password = Password.of("hxbxwxba");
        System.out.println("Next next password: " + password.nextValidPassword().nextValidPassword());
    }
}
