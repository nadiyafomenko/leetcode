package com.fmnk.easy.lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings.length == 0 ? 0 : strings[strings.length - 1].length();
    }
}
