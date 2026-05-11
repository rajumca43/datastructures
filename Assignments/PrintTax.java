package com.ds.bt.Assignments;

import static java.lang.IO.println;

public class PrintTax {
    static void main(String[] args) {
        println(printTax(4000));
    }

    public static double printTax(int total) {
        return total > 5000 ? total * (10d / 100) : total * (5d / 100);
    }
}
