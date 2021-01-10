package com.fmnk.easy.reverseInt;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {

    private static Solution solution = new Solution();

    @Test
    public void testReversePositive() {
        assertEquals(321, solution.reverse(123));
        assertEquals(11, solution.reverse(11));
        assertEquals(0, solution.reverse(0));
    }

    @Test
    public void testReverseNegative() {
        assertEquals(-321, solution.reverse(-123));
        assertEquals(-1, solution.reverse(-100000));
        assertEquals(0, solution.reverse(0));
    }

    @Test
    public void testReverseOverflow() {
        assertEquals(0, solution.reverse(Integer.MAX_VALUE));
        assertEquals(0, solution.reverse(Integer.MIN_VALUE));
    }
}
