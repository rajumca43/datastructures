package com.ds.bt.arrays;

import java.util.Arrays;

import static java.lang.IO.println;

public class MovingZeroToEnd {
    static void main(String[] args) {
        int arr[] = new int[]{1,0,3,5,0,4};
        moveZeros(arr);
    }

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
