package com.companyname;

/**
 * Factorial Trailing Zeroes
 * Given an integer n, return the number of trailing zeroes in n!.
 * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1
 */
public class Exercise4 {

    static void main() {
        System.out.println(trailingZeroes(125));
    }

    public static int trailingZeroes(int n) {
        if (n < 5) return 0;

        int currentPowerOfFive = 5;
        int result = 0;

        while (n >= currentPowerOfFive) {
            result += n / currentPowerOfFive;
            currentPowerOfFive *= 5;
        }

        return result;
    }
}
