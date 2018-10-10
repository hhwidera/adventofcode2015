package com.widera.adventofcode2015.day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdventCoinsTest {

    @Test
    void example1() {
        AdventCoins adventCoins = new AdventCoins("abcdef");
        assertEquals(609043, adventCoins.mine(5));
    }

    @Test
    void example2() {
        AdventCoins adventCoins = new AdventCoins("pqrstuv");
        assertEquals(1048970, adventCoins.mine(5));
    }
}