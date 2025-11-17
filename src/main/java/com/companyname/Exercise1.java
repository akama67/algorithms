package com.companyname;

/**
 * Given an integer, return an array of string where:
 * arr[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * arr[i] == "Fizz" if i is divisible by 3.
 * arr[i] == "Buzz" if i is divisible by 5.
 * arr[i] == i (as a string) if none of the above conditions are true.
 */
public class Exercise1 {
    static void main() {
        fizzBuzz(16);
    }

    public static String[] fizzBuzz(int n) {
        String[] myList = new String[n];

        for (int curr = 1; curr <= n; curr++) {
            if (curr % 5 == 0 && curr % 3 == 0) {
                myList[curr - 1] = "FizzBuzz";
            } else if (curr % 3 == 0) {
                myList[curr - 1] = "Fizz";
            } else if (curr % 5 == 0) {
                myList[curr - 1] = "Buzz";
            } else {
                myList[curr - 1] = curr + "";
            }
        }

        return myList;
    }
}
