package com.fmnk.easy.squaresOfASortedArray;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest extends TestCase {
    Solution solution = new Solution();

    @Test
    public void testSquaresOfSortedArray() {
        Assert.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
        Assert.assertArrayEquals(new int[]{4, 9, 9, 49, 121}, solution.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }
}