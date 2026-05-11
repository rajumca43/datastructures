package com.ds.bt;

import static java.lang.IO.print;
import static java.lang.IO.println;

/**
 * Prints a left-aligned right triangle of stars that grows by one star per row.
 *
 * <p>Example output for {@code n = 5}:
 * <pre>
 * (blank)
 * *
 * **
 * ***
 * ****
 * </pre>
 *
 * <p><b>Pattern logic:</b>
 * <ul>
 *   <li>Row {@code i} (0-indexed) contains exactly {@code i} stars.</li>
 *   <li>The first row ({@code i = 0}) is empty.</li>
 *   <li>The outer loop runs {@code n} times; the inner loop prints {@code i} stars.</li>
 * </ul>
 *
 * <p>Time complexity: O(n²). Space complexity: O(1).
 */
public class RightTriangle {

    /**
     * Entry point. Prints a right triangle with {@code n = 5} rows.
     */
    public static void main() {
        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                print("*");
            }
            println();
        }
    }
}
