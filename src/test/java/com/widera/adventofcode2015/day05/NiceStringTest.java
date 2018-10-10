package com.widera.adventofcode2015.day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NiceStringTest {

    @Test
    void testContainsAtLeastThreeVowels() {
        assertTrue(new NiceString("xazegov").containsAtLeastThreeVowels());
        assertTrue(new NiceString("aeiouaeiouaeiou").containsAtLeastThreeVowels());
        assertFalse(new NiceString("dvszwmarrgswjxmb").containsAtLeastThreeVowels());
    }

    @Test
    void testContainsDoubleLetter() {
        assertTrue(new NiceString("xx").containsDoubleLetters());
        assertTrue(new NiceString("abcdde").containsDoubleLetters());
        assertTrue(new NiceString("aabbccdd").containsDoubleLetters());
        assertFalse(new NiceString("jchzalrnumimnmhp").containsDoubleLetters());
    }

    @Test
    void testContainsSpecialStrings() {
        assertTrue(new NiceString("ab").containsSpecialStrings());
        assertTrue(new NiceString("cd").containsSpecialStrings());
        assertTrue(new NiceString("pq").containsSpecialStrings());
        assertTrue(new NiceString("xy").containsSpecialStrings());
    }

    @Test
    void testIsNice() {
        assertTrue(new NiceString("ugknbfddgicrmopn").isNice());
        assertTrue(new NiceString("aaa").isNice());
        assertFalse(new NiceString("jchzalrnumimnmhp").isNice());
        assertFalse(new NiceString("haegwjzuvuyypxyu").isNice());
        assertFalse(new NiceString("dvszwmarrgswjxmb").isNice());
    }

    @Test
    void testContainsAPairOfAnyTwoLetters() {
        assertTrue(new NiceString("xyxy").containsAPairOfAnyTwoLetters());
        assertTrue(new NiceString("aabcdefgaa").containsAPairOfAnyTwoLetters());
        assertTrue(new NiceString("aaaa").containsAPairOfAnyTwoLetters());
        assertFalse(new NiceString("aaa").containsAPairOfAnyTwoLetters());
    }

    @Test
    void testContainsRepeatLetterWithOneLetterBetweenThem() {
        assertTrue(new NiceString("xyx").containsRepeatLetterWithOneLetterBetweenThem());
        assertTrue(new NiceString("abcdefeghi").containsRepeatLetterWithOneLetterBetweenThem());
        assertTrue(new NiceString("aaa").containsRepeatLetterWithOneLetterBetweenThem());
        assertFalse(new NiceString("abba").containsRepeatLetterWithOneLetterBetweenThem());
    }

    @Test
    void testIsNicePart2() {
        assertTrue(new NiceString("qjhvhtzxzqqjkmpb").isNicePart2());
        assertTrue(new NiceString("xxyxx").isNicePart2());
        assertFalse(new NiceString("uurcxstgmygtbstg").isNicePart2());
        assertFalse(new NiceString("ieodomkazucvgmuy").isNicePart2());
    }
}