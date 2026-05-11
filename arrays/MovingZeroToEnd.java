package com.ds.bt.arrays;

import java.util.Arrays;

import static java.lang.IO.println;

/**
 * Provides two strategies for moving all zero elements of an array to the end
 * while keeping non-zero elements at the front.
 *
 * <p>Example input: {@code [1, 0, 3, 5, 0, 4]}
 * <ul>
 *   <li>{@link #moveZeros} (order not preserved) → e.g., {@code [1, 4, 3, 5, 0, 0]}</li>
 *   <li>{@link #moveZerosPreserved} (order preserved) → {@code [1, 3, 5, 4, 0, 0]}
 *       — <em>implementation incomplete</em></li>
 * </ul>
 */
public class MovingZeroToEnd {

    /**
     * Entry point. Applies the non-order-preserving zero-move to a sample array
     * and prints the result.
     *
     * @param args command-line arguments (not used)
     */
    static void main(String[] args) {
        int arr[] = new int[]{1,0,3,5,0,4};
        moveZeros(arr);
    }

    /**
     * Moves all zeros to the end of the array <em>without</em> preserving the
     * relative order of non-zero elements.
     *
     * <p><b>Algorithm (two-pointer / shrinking window):</b>
     * <ol>
     *   <li>Walk forward with pointer {@code i}.</li>
     *   <li>When a {@code 0} is found, check the last active element
     *       ({@code arr[n-1]}):</li>
     *   <ul>
     *     <li>If it is non-zero, swap it with {@code arr[i]} (fills the gap
     *         with a non-zero value, places 0 at the back).</li>
     *     <li>If it is also {@code 0}, just shrink the active window
     *         ({@code n--}) to skip that trailing zero.</li>
     *   </ul>
     *   <li>Continue until {@code i >= n}.</li>
     * </ol>
     *
     * <p>Time complexity: O(n). Space complexity: O(1) in-place.
     *
     * @param arr the array to modify in-place
     */
    /*Non zeros not preserved*/
    public static void moveZeros(int[] arr){

        int n =arr.length;
        for(int i = 0; i<n; i++){

            if(arr[i] == 0){
                if(arr[n -1] != 0){
                    arr[i] = arr[n-1];
                    arr[n-1] = 0;
                }else{
                    n--;
                }
            }
        }
        println(Arrays.toString(arr));
    }

    /**
     * Intended to move all zeros to the end while <em>preserving</em> the
     * relative order of non-zero elements.
     *
     * <p><b>Status: incomplete.</b> Currently only finds the index of the last
     * zero in the array ({@code zeropont}) but does not perform any swaps or
     * rearrangement.
     *
     * <p><b>Intended algorithm (two-pointer):</b>
     * <ol>
     *   <li>Use a slow pointer to track the next insertion position for
     *       non-zero elements.</li>
     *   <li>On each non-zero element, place it at the slow pointer and
     *       advance both pointers.</li>
     *   <li>Fill remaining positions with {@code 0}.</li>
     * </ol>
     *
     * @param arr the array to modify in-place
     */
    /*Non zeros in preserved*/
    public static void moveZerosPreserved(int[] arr){

        int n =arr.length;
        int zeropont = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                zeropont = i;

            }
        }
    }
}
