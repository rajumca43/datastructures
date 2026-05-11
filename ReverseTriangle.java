package com.ds.bt;

import static java.lang.IO.print;
import static java.lang.IO.println;

/**
 * Prints a centered, inverted (downward-pointing) triangle of stars where
 * each row is two stars shorter than the previous and indented by one space.
 *
 * <p>Example output for {@code n = 5}:
 * <pre>
 * *****
 *  ***
 *   *
 * </pre>
 *
 * <p><b>Pattern logic:</b>
 * <ul>
 *   <li>Starts with a full row of {@code n} stars.</li>
 *   <li>Each subsequent row adds one leading space and prints two fewer stars.</li>
 *   <li>The outer loop decrements {@code i} by {@code 2} per iteration;
 *       the variable {@code s} tracks how many leading spaces to add.</li>
 * </ul>
 *
 * @see ReduceOneBothSides for an equivalent implementation
 */
public class ReverseTriangle {

    /**
     * Entry point. Prints the inverted triangle pattern for {@code n = 5}.
     */
    public static void main() {
        int n =5;
        for (int i = n; i >0; i=i-2) {
            int s = n-i;
            for (int j = 0; j < i+s; j++) {
                if(j<s) {
                    print(" ");
                    s--;
                }
                else
                    print("*");
            }
            println();
        }
    }
}
