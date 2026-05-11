package com.ds.bt.arrays;

import java.util.Arrays;

import static java.lang.IO.print;

public class TwoSumSortedArray {
    static void main() {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        print(Arrays.toString(twoSum(arr, target)));
    }

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
