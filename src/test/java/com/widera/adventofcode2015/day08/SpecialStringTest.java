package com.widera.adventofcode2015.day08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialStringTest {

    @Test
    void testEmptyString() {
        SpecialString string = new SpecialString("\"\"");
        assertEquals(2, string.numberOfCharactersOfCode());
        assertEquals(0, string.numberOfCharacters());
    }

    @Test
    void testSimpleString() {
        SpecialString string = new SpecialString("\"abc\"");
        assertEquals(5, string.numberOfCharactersOfCode());
        assertEquals(3, string.numberOfCharacters());
    }

    @Test
    void testEscapeDoubleQuoteString() {
        SpecialString string = new SpecialString("\"aaa\\\"aaa\"");
        assertEquals(10, string.numberOfCharactersOfCode());
        assertEquals(7, string.numberOfCharacters());
    }

    @Test
    void testEscapeBackslashString() {
        SpecialString string = new SpecialString("\"aaa\\\\aaa\"");
        assertEquals(10, string.numberOfCharactersOfCode());
        assertEquals(7, string.numberOfCharacters());
    }

    @Test
    void testEscapeHexadecimalString() {
        SpecialString string = new SpecialString("\"\\x27\"");
        assertEquals(6, string.numberOfCharactersOfCode());
        assertEquals(1, string.numberOfCharacters());
    }

    @Test
    void testEncodeStringExample1() {
        SpecialString string = new SpecialString("\"\"");
        SpecialString encodeString = string.encode();
        assertEquals(6, encodeString.numberOfCharactersOfCode());
    }

    @Test
    void testEncodeStringExample2() {
        SpecialString string = new SpecialString("\"abc\"");
        SpecialString encodeString = string.encode();
        assertEquals(9, encodeString.numberOfCharactersOfCode());
    }

    @Test
    void testEncodeStringExample3() {
        SpecialString string = new SpecialString("\"aaa\\\"aaa\"");
        SpecialString encodeString = string.encode();
        assertEquals(16, encodeString.numberOfCharactersOfCode());
    }

    @Test
    void testEncodeStringExample4() {
        SpecialString string = new SpecialString("\"\\x27\"");
        SpecialString encodeString = string.encode();
        assertEquals(11, encodeString.numberOfCharactersOfCode());
    }
}