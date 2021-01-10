package com.fmnk.easy.twoSum;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest extends TestCase {
    private Solution solution = new Solution();

    @Test
    public void testTwoSum() {
        Assert.assertArrayEquals(new int[]{1, 0}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[]{2, 1}, solution.twoSum(new int[]{3, 2, 4}, 6));
        Assert.assertArrayEquals(new int[]{1, 0}, solution.twoSum(new int[]{3, 3}, 6));
    }
}
