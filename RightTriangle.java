package com.ds.bt;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class RightTriangle {
    public static void main() {
        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                print("*");
            }
            println();
        }
    }
}
