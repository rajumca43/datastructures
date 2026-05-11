package com.ds.bt;

import static java.lang.IO.print;
import static java.lang.IO.println;

/**
 * Demonstrates two approaches to printing Pascal's Triangle.
 *
 * <p>Pascal's Triangle is a triangular array of numbers where each value is the
 * sum of the two numbers directly above it. The edges of the triangle are always 1.
 *
 * <p>Example output for {@code pascalTriangle(6)}:
 * <pre>
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * </pre>
 *
 * <p><b>Algorithm:</b> Uses a row-by-row approach where each current row is derived
 * from the previous row. Time complexity: O(n²). Space complexity: O(n).
 */
public class PascalTriangle {

    /**
     * Entry point. Prints Pascal's Triangle with 4 rows.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        //printTrainglewithNumberaddition(3);\
        pascalTriangle(4);
    }

    /**
     * Prints a formatted triangle where each row displays a number from a
     * pre-initialized array, padded with dashes to create a triangular shape.
     *
     * <p>Note: This method uses a pre-seeded array ({@code arr[0]=1, arr[1]=1})
     * rather than computing values dynamically, so it is limited to displaying
     * those initial values.
     *
     * <p>Example output for {@code n=3}:
     * <pre>
     * --1
     * -1-
     * 1--
     * </pre>
     *
     * @param n the number of rows to print
     */
    public static void printTrainglewithNumberaddition(int n) {

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        int space = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            flag = true;
            for (int j = 0; j <= n + i; j++) {
                if (j < n - i)
                    print("-");
                if (j >= n - i) {
                    if (flag) {
                        print(arr[i]);

                        flag = false;
                    } else {
                        print("-");
                        flag = true;
                    }
                }

            }
            println();
        }

    }

    /**
     * Prints {@code n} rows of Pascal's Triangle.
     *
     * <p>Each row is computed from the previous row: the first and last elements
     * of every row are always {@code 1}, and every interior element {@code curr[j]}
     * equals {@code prev[j-1] + prev[j]}.
     *
     * <p><b>Algorithm:</b>
     * <ol>
     *   <li>Maintain a {@code prev} array representing the last printed row.</li>
     *   <li>For each new row, create a {@code curr} array of the same length.</li>
     *   <li>Set boundary elements to {@code 1}; compute interior elements by adding
     *       adjacent values from {@code prev}.</li>
     *   <li>Replace {@code prev} with {@code curr} before moving to the next row.</li>
     * </ol>
     *
     * @param n the number of rows to generate and print (must be &gt; 0)
     */
    public static void pascalTriangle(int n) {
        int prev[] = new int[n];
        for (int i = 0; i < n; i++) {
            int curr[] = new int[n];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    curr[j] = 1;
                    print("1");
                } else {
                    int k = prev[j-1]+prev[j];
                    print(k);
                    curr[j]=k;

                }
            }
            prev = curr;
            println();
        }
    }
}
