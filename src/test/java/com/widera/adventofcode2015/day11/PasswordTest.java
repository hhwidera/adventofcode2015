package com.widera.adventofcode2015.day11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void testNextPassword() {
        assertEquals(Password.of("abcdffaa"),Password.of("abcdefgh").nextValidPassword());
        assertEquals(Password.of("ghjaabcc"),Password.of("ghijklmn").nextValidPassword());
    }

    @Test
    void testValidPassword() {
        assertFalse(Password.of("hijklmmn").isValid());
        assertFalse(Password.of("abbceffg").isValid());
        assertFalse(Password.of("abbcegjk").isValid());
    }

    @Test
    void testRequirementEightLetters() {
        assertTrue(Password.of("abcdefgh").isEightLettersValid());

        assertFalse(Password.of("abcdefg").isEightLettersValid());
        assertFalse(Password.of("abcdefghi").isEightLettersValid());
    }

    @Test
    void testRequirementLettersAreLowercase() {
        assertTrue(Password.of("abcdefgh").isLowerCaseLettersValid());
        assertTrue(Password.of("a").isLowerCaseLettersValid());
        assertTrue(Password.of("z").isLowerCaseLettersValid());

        assertFalse(Password.of("aBcdefgh").isLowerCaseLettersValid());
        assertFalse(Password.of("a cdef1h").isLowerCaseLettersValid());
    }

    @Test
    void testRequirementIncreasingStraightThreeLetters() {
        assertTrue(Password.of("abc").isIncreasingStraightThreeLettersValid());
        assertTrue(Password.of("bcd").isIncreasingStraightThreeLettersValid());
        assertTrue(Password.of("cde").isIncreasingStraightThreeLettersValid());
        assertTrue(Password.of("xyz").isIncreasingStraightThreeLettersValid());

        assertFalse(Password.of("abd").isIncreasingStraightThreeLettersValid());
    }

    @Test
    void testRequirementNotAllowedLetters() {
        assertTrue(Password.of("abc").isNotAllowedLettersValid());
        assertTrue(Password.of("bcd").isNotAllowedLettersValid());
        assertTrue(Password.of("cde").isNotAllowedLettersValid());
        assertTrue(Password.of("xyz").isNotAllowedLettersValid());

        assertFalse(Password.of("i").isNotAllowedLettersValid());
        assertFalse(Password.of("o").isNotAllowedLettersValid());
        assertFalse(Password.of("l").isNotAllowedLettersValid());
    }

    @Test
    void testRequirementTwoDoubleLetters() {
        assertTrue(Password.of("aaaa").isTwoDoubleLettersValid());
        assertTrue(Password.of("aabb").isTwoDoubleLettersValid());
        assertTrue(Password.of("aabcdeff").isTwoDoubleLettersValid());

        assertFalse(Password.of("a").isTwoDoubleLettersValid());
        assertFalse(Password.of("aaa").isTwoDoubleLettersValid());
    }
}