package com.ds.bt;

import static java.lang.IO.println;

public class SumOfDigit {
    static void main(String[] args) {
        int n = 12345;
        int sum =0;
        while(n%10 >0){
            sum = sum + n%10;

            n=n/10;
        }

        println(sum);

    }
}
