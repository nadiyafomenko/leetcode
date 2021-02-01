package com.fmnk.easy.squaresOfASortedArray;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] res = new Solution().sortedSquares(new int[]{-4, -1, 0, 3, 10});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
