package com.widera.adventofcode2015.day02;

import java.util.Arrays;

class PresentBox {

    private int length;
    private int width;
    private int height;

    PresentBox(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int squareFeetOfWrappingPaper() {
        return 2 * length * width + 2 * width * height + 2 * height * length + extraPaper();
    }

    private int extraPaper() {
        int[] smallestSides = smallestSides();
        return smallestSides[0] * smallestSides[1];
    }

    private int[] smallestSides() {
        int[] dimensions = new int[] {length, width, height};
        Arrays.sort(dimensions);
        return new int[] {dimensions[0], dimensions[1]};
    }

    int feetOfRibbon() {
        int[] smallestSides = smallestSides();
        return 2 * smallestSides[0] + 2 * smallestSides[1] + length * width * height;
    }
}
