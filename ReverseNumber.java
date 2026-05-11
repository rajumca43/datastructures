package com.ds.bt;

import static java.lang.IO.println;

/**
 * Demonstrates how to reverse the digits of a positive integer.
 *
 * <p>Example: {@code reverseNumber(45432)} returns {@code 23454}.
 *
 * <p><b>Algorithm:</b> Repeatedly extracts the last digit of {@code n} using
 * the modulo operator ({@code n % 10}), appends it to the result
 * ({@code reverse = reverse * 10 + rem}), then removes the last digit from
 * {@code n} by integer division ({@code n / 10}). Continues until all digits
 * are processed.
 *
 * <p>Time complexity: O(d) where {@code d} is the number of digits in {@code n}.
 * Space complexity: O(1).
 */
public class ReverseNumber {

    /**
     * Entry point. Reverses {@code 45432} and prints the result.
     *
     * @param args command-line arguments (not used)
     */
    static void main(String[] args) {
            int result = reverseNumber(45432);
            println(result);
    }

    /**
     * Reverses the digits of the given positive integer.
     *
     * <p>For example:
     * <ul>
     *   <li>{@code reverseNumber(45432)} → {@code 23454}</li>
     *   <li>{@code reverseNumber(100)}   → {@code 1} (leading zeros are dropped)</li>
     * </ul>
     *
     * @param n the positive integer whose digits are to be reversed
     * @return  the integer formed by reversing the digits of {@code n};
     *          leading zeros in the reversed number are lost
     */
    public static int reverseNumber(int n){
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            reverse = reverse*10 + rem;
            n = n/10;
        }

        return reverse;
    }
}
