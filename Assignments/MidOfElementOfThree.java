package com.ds.bt.Assignments;

import static java.lang.IO.println;

public class MidOfElementOfThree {
    static void main(String[] args) {
        int a = 25, b =20, c= 22;
        int mid = a;

        if((a < b && c > b) || (a > b && c < b)){
            mid = b;
        }else if((a < b && c > b) || (a > b && c < b)){
            mid = c;
        }
        println("Mid number : "+mid);
    }
}
