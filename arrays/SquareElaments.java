package com.ds.bt.arrays;

import java.util.Arrays;

import static java.lang.IO.print;

/**
 * Produces a sorted array of the squares of each element in a sorted input array.
 *
 * <p>Because the input array is sorted but may contain negative numbers, simply
 * squaring each element does not guarantee a sorted output. For example,
 * {@code [-4, -2, 1, 5, 10]} squared element-wise gives {@code [16, 4, 1, 25, 100]},
 * which is out of order.
 *
 * <p>Example:
 * <ul>
 *   <li>Input:  {@code [-4, -2, 1, 5, 10]}</li>
 *   <li>Output: {@code [1, 4, 16, 25, 100]}</li>
 * </ul>
 *
 * <p><b>Algorithm (two-pointer, fill from the back):</b>
 * <ol>
 *   <li>Use a left pointer {@code min} at the start and a right pointer
 *       {@code max} at the end.</li>
 *   <li>Compare the squares of the two pointed elements.</li>
 *   <li>Place the larger square at the current back index of the result array
 *       and advance the corresponding pointer inward.</li>
 *   <li>Repeat until the two pointers meet.</li>
 * </ol>
 *
 * <p>Time complexity: O(n). Space complexity: O(n) for the result array.
 */
public class SquareElaments {

    /**
     * Entry point. Squares and sorts a sample sorted array with negative values.
     */
    static void main() {
        int[] arr = new int[]{-4, -2, 1, 5,10};
        square(arr);
    }

    /**
     * Returns (and prints) a new array containing the squares of each element
     * of {@code arr}, in non-decreasing order.
     *
     * <p>The input array must be sorted in non-decreasing order (may contain
     * negative values).
     *
     * @param arr a non-null, sorted integer array (ascending order)
     */
    public static void square(int[] arr){
        int[] result = new int[arr.length];

        int min = 0;
        int max = arr.length-1;
        int index = max;
        while (min <= max){
            int sqMin = arr[min] * arr[min];
            int sqMax = arr[max] * arr[max];

            if(sqMin < sqMax){
                result[index] = sqMax;
                max--;
            }else{
                result[index] = sqMin;
                min++;
            }
            index--;
        }
        print(Arrays.toString(result));
    }
}
