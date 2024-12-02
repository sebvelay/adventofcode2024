package com.aoc.day2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Part2Test {
    @Test
    public void example_1_safe(){
        assertTrue(Part2.isSafe(Arrays.asList(7,6,4,2,1),Arrays.asList(7,6,4,2,1),0));
    }

    @Test
    public void example_2_safe(){
        assertTrue(Part2.isSafe(Arrays.asList(1,3,6,7,9),Arrays.asList(1,3,6,7,9),0));
    }

    @Test
    public void example_3_unsafe(){
        assertFalse(Part2.isSafe(Arrays.asList(1,2,7,8,9),Arrays.asList(1,2,7,8,9),0));

    }

    @Test
    public void example_4_unsafe(){
        assertFalse(Part2.isSafe(Arrays.asList(9,7,6,2,1),Arrays.asList(9,7,6,2,1),0));

    }

    @Test
    public void example_5_unsafe(){
        assertTrue(Part2.isSafe(Arrays.asList(1,3,2,4,5),Arrays.asList(1,3,2,4,5),0));

    }

    @Test
    public void example_6_unsafe(){
        assertTrue(Part2.isSafe(Arrays.asList(8,6,4,4,1),Arrays.asList(8,6,4,4,1),0));

    }

}