package com.companyname;

/**
 * Single Number
 * Given a non-empty array of integers nums, every element appears twice except one element. Find that single one.
 * Expected TC: O(n) and SC: O(1)
 */
public class Exercise2 {
    static void main() {
        findSingleNumber(new int[]{2, 2, 5, 3, 4, 6, 4, 6, 3});
    }

    public static int findSingleNumber(int[] nums) {
        int numResult = 0;
        for (int num : nums) {
            numResult = numResult ^ num;
            System.out.println(numResult);
        }
        System.out.println("Result: " + numResult);
        return numResult;
    }
}
