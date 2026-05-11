package com.ds.bt.Assignments;

public class MaxOfThree {
    static void main(String[] args) {
        int a = 10, b = 1, c = 5;
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Max of three numbers: " + max);
    }
}
