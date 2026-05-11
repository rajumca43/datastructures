package com.ds.bt;

import static java.lang.IO.print;
import static java.lang.IO.println;

/**
 * Prints a centered, symmetrically shrinking star pattern where each row
 * loses one star from each side compared to the row above.
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
 *   <li>Row 1 starts with {@code n} stars and no leading spaces.</li>
 *   <li>Each subsequent row adds one leading space and removes two stars
 *       (one from each side), keeping the pattern centered.</li>
 *   <li>The loop decrements {@code i} by 2 each iteration, stopping when
 *       {@code i <= 0}.</li>
 * </ul>
 */
public class ReduceOneBothSides {

    /**
     * Entry point. Prints the shrinking star pattern for {@code n = 5}.
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
