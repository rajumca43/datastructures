package com.ds.bt.arrays;

import static java.lang.IO.println;

/**
 * Counts and prints the number of even and odd integers in an array.
 *
 * <p>Example: for {@code arr = [1, 2, 3, 4, 5, 6, 7]}
 * <ul>
 *   <li>Even numbers: 2, 4, 6 → count = 3</li>
 *   <li>Odd  numbers: 1, 3, 5, 7 → count = 4</li>
 * </ul>
 *
 * <p><b>Algorithm:</b> Iterates through the array once. For each element,
 * uses the modulo operator ({@code arr[i] % 2 == 0}) to decide whether to
 * increment the {@code even} or {@code odd} counter.
 *
 * <p>Time complexity: O(n). Space complexity: O(1).
 */
public class EvenOddNumbers {

    /**
     * Entry point. Counts even and odd numbers in a hard-coded array and
     * prints both counts.
     *
     * @param args command-line arguments (not used)
     */
    static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5,6,7};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 == 0){
                even ++;
            }else{
                odd++;
            }
        }
        println("Even number count : "+even);
        println("Odd number count : "+odd);
    }
}
