package com.fmnk.easy.romanToInteger;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {
    Solution solution = new Solution();

    @Test
    public void testXV() {
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(2, solution.romanToInt("II"));
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    public void testRomanToInt() {
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
