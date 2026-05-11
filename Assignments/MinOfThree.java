package com.ds.bt.Assignments;

/**
 * Finds and prints the minimum of three integers without using any built-in
 * {@code Math} utility methods.
 *
 * <p>Example: for {@code a = 10}, {@code b = 1}, {@code c = 5}, the output is:
 * <pre>Minimum of three numbers: 1</pre>
 *
 * <p><b>Algorithm:</b>
 * <ol>
 *   <li>Assume {@code a} is the minimum ({@code min = a}).</li>
 *   <li>If {@code b < min}, update {@code min = b}.</li>
 *   <li>If {@code c < min}, update {@code min = c}.</li>
 *   <li>Print the result.</li>
 * </ol>
 *
 * <p>This approach requires exactly two comparisons regardless of the input
 * values. Time complexity: O(1). Space complexity: O(1).
 */
public class MinOfThree {

    /**
     * Entry point. Determines the minimum of three hard-coded values
     * ({@code a = 10}, {@code b = 1}, {@code c = 5}) and prints it.
     */
    static void main() {
        int a = 10, b = 1, c = 5;
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Minimum of three numbers: " + min);
    }
}
