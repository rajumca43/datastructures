package com.ds.bt.arrays;

import static java.lang.IO.println;

public class EvenOddNumbers {
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
