package com.ds.bt;

import static java.lang.IO.println;

public class ReverseNumber {
    static void main(String[] args) {
            int result = reverseNumber(45432);
            println(result);
    }
    public static int reverseNumber(int n){
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            reverse = reverse*10 + rem;
            n = n/10;
        }

        return reverse;
    }
}
