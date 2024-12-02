package com.aoc.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Part1Test {

    @Test
    public void example_1_safe(){
        assertTrue(Part1.isSafe(new int[]{7,6,4,2,1}));
    }

    @Test
    public void example_2_safe(){
        assertTrue(Part1.isSafe(new int[]{1,3,6,7,9}));
    }

    @Test
    public void example_3_unsafe(){
        assertFalse(Part1.isSafe(new int[]{1,2,7,8,9}));
    }

    @Test
    public void example_4_unsafe(){
        assertFalse(Part1.isSafe(new int[]{9,7,6,2,1}));
    }

    @Test
    public void example_5_unsafe(){
        assertFalse(Part1.isSafe(new int[]{1,3,2,4,5}));
    }

    @Test
    public void example_6_unsafe(){
        assertFalse(Part1.isSafe(new int[]{8,6,4,4,1}));
    }

}