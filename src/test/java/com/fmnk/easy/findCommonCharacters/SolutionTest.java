package com.fmnk.easy.findCommonCharacters;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest extends TestCase {
    Solution solution = new Solution();

    private final List test1;
    private final List test2;

    public SolutionTest() {
        this.test1 = new ArrayList();
        test1.add("e");
        test1.add("l");
        test1.add("l");
        this.test2 = new ArrayList();
        test2.add("c");
        test2.add("o");
    }

    @Test
    public void testCommonCharactersWithoutDuplication() {
        assertEquals(test2, solution.commonChars(new String[]{"cool","lock","cook"}));
    }

    @Test
    public void testCommonCharactersWithDuplication() {
        assertEquals(test1, solution.commonChars(new String[]{"bella","label","roller"}));
    }
}