package com.fmnk.easy.palindromNumber;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {
    Solution solution = new Solution();

    @Test
    public void testPalindromNumber() {
        assertEquals(true, solution.isPalindrome(121));
        assertEquals(true, solution.isPalindrome(111));
        assertEquals(true, solution.isPalindrome(1));
        assertEquals(false, solution.isPalindrome(1222222));
        assertEquals(false, solution.isPalindrome(-1));
        assertEquals(false, solution.isPalindrome(10));
    }
}
