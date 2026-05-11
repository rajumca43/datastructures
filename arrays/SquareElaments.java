package com.ds.bt.arrays;

import java.util.Arrays;

import static java.lang.IO.print;

public class SquareElaments {
    static void main() {
        int[] arr = new int[]{-4, -2, 1, 5,10};
        square(arr);
    }
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
