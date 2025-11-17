package com.companyname;

/**
 * Given an integer, return true if the given integer is a palindrome and false otherwise.
 */
public class Exercise3 {

    static void main() {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x != 0 && x % 10 == 0) return false;

        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }

        return (x == reverse) || (x == reverse / 10);
    }

}
