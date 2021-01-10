package com.fmnk.easy.palindromNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        int reversed = 0;
        int start = x;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            reversed = reversed * 10 + pop;
        }
        return reversed == start;
    }
}
