package com.aoc.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class NumbersTest {

        @Test
        public void a1_2_5_strictlyIncrease() {
                assertTrue(Numbers.isStrictlyIncrease(new int[]{1, 2, 5}));
        }

        @Test
        public void a1_2_2_not_strictlyIncrease() {
                assertFalse(Numbers.isStrictlyIncrease(new int[]{1, 2, 2, 5}));
        }

        @Test
        public void a5_2_1_strictlyDecrease() {
                assertTrue(Numbers.isStrictlyDecrease(new int[]{5, 2, 1}));
        }

        @Test
        public void a5_2_2_not_strictlyIncrease() {
                assertFalse(Numbers.isStrictlyDecrease(new int[]{5, 2, 2, 1}));
        }

}