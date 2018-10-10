package com.widera.adventofcode2015.day05;

class NiceString {

    private final String world;

    NiceString(final String world) {
        this.world = world;
    }

    boolean containsAtLeastThreeVowels() {
        int countOfVowels = 0;
        for (String character : this.world.split("")) {
            if ("a".equals(character) || "e".equals(character) || "i".equals(character) || "o".equals(character)
                || "u".equals(character)) {
                countOfVowels++;
            }
        }
        return countOfVowels >= 3;
    }

    boolean containsDoubleLetters() {
        String lastCharacter = "";
        for (String character : this.world.split("")) {
            if (lastCharacter.equals(character)) {
                return true;
            } else {
                lastCharacter = character;
            }
        }
        return false;
    }

    boolean containsSpecialStrings() {
        return this.world.contains("ab") || this.world.contains("cd") || this.world.contains("pq") || this.world.contains("xy");
    }

    boolean isNice() {
        return containsAtLeastThreeVowels() && containsDoubleLetters() && !containsSpecialStrings();
    }

    boolean containsAPairOfAnyTwoLetters() {
        String[] character = this.world.split("");
        for (int c = 0; c < character.length - 2; c++) {
            for (int d = c + 2; d < character.length - 1; d++) {
                if (character[c].equals(character[d]) && character[c+1].equals(character[d+1])) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean containsRepeatLetterWithOneLetterBetweenThem() {
        String[] character = this.world.split("");
        for (int c = 0; c < character.length - 2; c++) {
            if (character[c].equals(character[c+2])) {
                return true;
            }
        }
        return false;
    }

    boolean isNicePart2() {
        return containsAPairOfAnyTwoLetters() && containsRepeatLetterWithOneLetterBetweenThem();
    }
}
