package com.ds.bt.arrays;

import static java.lang.IO.println;

public class MinMax {
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
