package com.fmnk.easy.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> dictionary = new HashMap();
        dictionary.put("I", 1);
        dictionary.put("V", 5);
        dictionary.put("X", 10);
        dictionary.put("L", 50);
        dictionary.put("C", 100);
        dictionary.put("D", 500);
        dictionary.put("M", 1000);
        dictionary.put("IV", -2);
        dictionary.put("IX", -2);
        dictionary.put("XL", -20);
        dictionary.put("XC", -20);
        dictionary.put("CD", -200);
        dictionary.put("CM", -200);

        String[] characters = s.split("");
        int result = 0;

        for (int i = 0; i < characters.length; i++) {
            result += dictionary.get(characters[i]);
            if (i + 1 < characters.length) {
                String next = characters[i] + characters[i + 1];
                if (dictionary.containsKey(next)) {
                    result += dictionary.get(next);
                }
            }
        }
        return result;
    }
}
