package com.ds.bt;

import static java.lang.IO.print;
import static java.lang.IO.println;

/**
 *   *****
 *    ***
 *     *
 */

public class ReduceOneBothSides {
    public static void main() {
        int n =5;
        for (int i = n; i >0; i=i-2) {
            int s = n-i;
            for (int j = 0; j < i+s; j++) {
                if(j<s) {
                    print(" ");
                    s--;
                }
               else
                print("*");
            }
            println();
        }
    }
}
