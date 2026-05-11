package com.ds.bt;

import static java.lang.IO.print;
import static java.lang.IO.println;

/**
 * 1
 * 1     1
 * 1    2    1
 * 1    3     3     1
 * 1    4     6     4     1
 * 1   5     10    10   5      1
 *
 *
 */

public class PascalTriangle {
    public static void main(String[] args) {
        //printTrainglewithNumberaddition(3);\
        pascalTriangle(4);
    }

    public static void printTrainglewithNumberaddition(int n) {

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        int space = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            flag = true;
            for (int j = 0; j <= n + i; j++) {
                if (j < n - i)
                    print("-");
                if (j >= n - i) {
                    if (flag) {
                        print(arr[i]);

                        flag = false;
                    } else {
                        print("-");
                        flag = true;
                    }
                }

            }
            println();
        }

    }

    public static void pascalTriangle(int n) {
        int prev[] = new int[n];
        for (int i = 0; i < n; i++) {
            int curr[] = new int[n];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    curr[j] = 1;
                    print("1");
                } else {
                    int k = prev[j-1]+prev[j];
                    print(k);
                    curr[j]=k;

                }
            }
            prev = curr;
            println();
        }
    }
}
