package com.fmnk.easy.findCommonCharacters;

import java.util.*;

public class Solution {
    public List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<>();
        symbols: for (String symbol : A[0].split("")) {
           strings: for(int i = 1; i <= A.length - 1; i++) {
                if(A[i].contains(symbol) && i == A.length - 1) {
                    res.add(symbol);
                }
                if(A[i].contains(symbol)) {
                    A[i] = A[i].replaceFirst(symbol, "-");
                    continue strings;
                }
                continue symbols;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> res = new Solution().commonChars(new String[]{"cool","lock","cook"});
        System.out.println(res);
    }
}
