package com.widera.adventofcode2015.day06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructionTest {

    @Test
    void testTypeToggle() {
        assertTrue(new Instruction("toggle 0,0 through 999,0").isTypeToggle());
        assertFalse(new Instruction("toggle 0,0 through 999,0").isTypeTurnOn());
        assertFalse(new Instruction("toggle 0,0 through 999,0").isTypeTurnOff());
    }

    @Test
    void testTypeTurnOn() {
        assertFalse(new Instruction("turn on 0,0 through 999,0").isTypeToggle());
        assertTrue(new Instruction("turn on 0,0 through 999,0").isTypeTurnOn());
        assertFalse(new Instruction("turn on 0,0 through 999,0").isTypeTurnOff());
    }

    @Test
    void testTypeTurnOff() {
        assertFalse(new Instruction("turn off 0,0 through 999,0").isTypeToggle());
        assertFalse(new Instruction("turn off 0,0 through 999,0").isTypeTurnOn());
        assertTrue(new Instruction("turn off 0,0 through 999,0").isTypeTurnOff());
    }

    @Test
    void example1() {
        LightGrid grid = new LightGrid();
        Instruction instruction = new Instruction("turn on 0,0 through 999,999");
        grid.run(instruction);
        assertEquals(1_000_000, grid.sizeOfLitLight());
    }

    @Test
    void example2() {
        LightGrid grid = new LightGrid();
        Instruction instruction = new Instruction("toggle 0,0 through 999,0");
        grid.run(instruction);
        assertEquals(1_000, grid.sizeOfLitLight());
    }

    @Test
    void example3() {
        LightGrid grid = new LightGrid();
        Instruction instruction = new Instruction("turn on 499,499 through 500,500");
        grid.run(instruction);
        assertEquals(4, grid.sizeOfLitLight());
    }
}