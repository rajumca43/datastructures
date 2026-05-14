package com.ds.bt.Assignments.part1;

import java.util.Arrays;

import static java.lang.IO.print;

/**
 * Solves the "Two Sum II – Input Array Is Sorted" problem (LeetCode #167).
 *
 * <p><b>Problem statement:</b> Given a 1-indexed, sorted (non-decreasing) integer
 * array {@code arr} and a target integer, find two numbers whose sum equals
 * {@code target} and return their 1-based indices as {@code [index1, index2]}.
 * There is guaranteed to be exactly one solution.
 *
 * <p>Example:
 * <ul>
 *   <li>Input:  {@code arr = [2, 7, 11, 15]}, {@code target = 9}</li>
 *   <li>Output: {@code [1, 2]} (since {@code arr[0] + arr[1] = 2 + 7 = 9})</li>
 * </ul>
 *
 * <p><b>Algorithm (two-pointer):</b> Because the array is sorted, place one
 * pointer {@code p1} at the left end and another {@code p2} at the right end.
 * <ol>
 *   <li>If {@code arr[p1] + arr[p2] == target}, return {@code [p1+1, p2+1]}.</li>
 *   <li>If the sum is less than {@code target}, move {@code p1} right to
 *       increase the sum.</li>
 *   <li>If the sum is greater, move {@code p2} left to decrease the sum.</li>
 * </ol>
 *
 * <p>Time complexity: O(n). Space complexity: O(1).
 */
public class TwoSumSortedArray {

    /**
     * Entry point. Finds and prints the 1-based indices of the two numbers
     * in {@code [2, 7, 11, 15]} that sum to {@code 9}.
     */
    static void main() {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        print(Arrays.toString(twoSum(arr, target)));
    }

    /**
     * Finds two elements in the sorted array whose sum equals {@code target}
     * and returns their 1-based indices.
     *
     * @param arr    a non-null integer array sorted in non-decreasing order
     * @param target the desired sum of two elements
     * @return a two-element array {@code [index1, index2]} (1-based, index1 &lt; index2)
     *         if a pair is found; otherwise {@code [0, 0]} (zeroed array of length 2)
     */
    public static int[] twoSum(int[] arr, int target) {

        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 < p2) {
            int sum = arr[p1] + arr[p2];

            if (sum == target) {
                return new int[]{p1 + 1, p2 + 1};
            } else if (sum < target) {
                p1++;
            } else {
                p2--;
            }
        }

        return new int[2];
    }


}
