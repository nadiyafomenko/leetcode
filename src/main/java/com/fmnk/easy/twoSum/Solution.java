package com.fmnk.easy.twoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int j = 0; j < nums.length; j++) {
            int pending = nums[j];
            for (int i = 0; i < nums.length; i++) {
                if (i == j) continue;
                if (pending + nums[i] == target) answer = new int[]{j, i};
            }
        }
        return answer;
    }
}
