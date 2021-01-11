package com.fmnk.easy.lengthOfLastWord;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {
    Solution solution = new Solution();

    @Test
    public void testOneWordString() {
        assertEquals(0, solution.lengthOfLastWord(" "));
    }

    @Test
    public void testManyWordsString() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }
}
