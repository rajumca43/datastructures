package com.ds.bt;

import static java.lang.IO.println;

/**
 * Calculates and prints the sum of all digits of a positive integer.
 *
 * <p>Example: for {@code n = 12345}, the digit sum is {@code 1+2+3+4+5 = 15}.
 *
 * <p><b>Algorithm:</b> Uses a while loop to extract the last digit via
 * {@code n % 10}, accumulate it into {@code sum}, then strip the last digit
 * with {@code n / 10}. Repeats until {@code n % 10 == 0} (i.e., no more
 * non-zero digits remain).
 *
 * <p><b>Note:</b> The loop condition {@code n % 10 > 0} will exit early if a
 * digit {@code 0} is encountered in the middle of the number (e.g., {@code 102}
 * would stop after summing {@code 2}). For a fully correct implementation,
 * the condition should be {@code n > 0}.
 *
 * <p>Time complexity: O(d) where {@code d} is the number of digits.
 * Space complexity: O(1).
 */
public class SumOfDigit {

    /**
     * Entry point. Computes and prints the digit sum of {@code 12345}.
     *
     * @param args command-line arguments (not used)
     */
    static void main(String[] args) {
        int n = 12345;
        int sum =0;
        while(n%10 >0){
            sum = sum + n%10;

            n=n/10;
        }

        println(sum);

    }
}
