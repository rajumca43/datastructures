package com.ds.bt.arrays;

import static java.lang.IO.println;

/**
 * Finds and prints the top three maximum values in an integer array.
 *
 * <p>Example: for {@code arr = [1, 2, 8, 1, 6, 7, 4]}, the output is:
 * <pre>8 - 7 - 6</pre>
 *
 * <p><b>Algorithm:</b> Maintains a three-element array {@code max[]} initialised
 * to {@link Integer#MIN_VALUE}. On each iteration:
 * <ol>
 *   <li>If {@code a > max[0]}, shift existing top-2 down and set {@code max[0] = a}.</li>
 *   <li>Else if {@code a > max[1]} (and not the first array element), shift the
 *       second value down and set {@code max[1] = a}.</li>
 *   <li>Else if {@code a > max[2]} (and not the first two array elements), set
 *       {@code max[2] = a}.</li>
 * </ol>
 *
 * <p><b>Note:</b> The duplicate-exclusion guards ({@code a != arr[0]},
 * {@code a != arr[1]}) use the original array positions, not the tracked
 * maximum values, which may produce incorrect results with duplicate elements.
 *
 * <p>Time complexity: O(n). Space complexity: O(1).
 */
public class MinMax {

    /**
     * Entry point. Finds the three largest values in a hard-coded array
     * and prints them separated by dashes.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,8,1,6,7,4};
        int max[] = new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};

        for(int a: arr){

            if(a > max[0]){
                max[2] = max[1];
                max[1] = max[0];
                max[0] = a;
            }else if( a > max[1] && a != arr[0]){
                max[2] = max[1];
                max[1] =a;
            }else if( a > max[2] && a != arr[0] && a != arr[1]){
                max[2] = a;
            }
        }
        println(max[0]+" - "+ max[1]+" - "+max[2]);
    }
}
