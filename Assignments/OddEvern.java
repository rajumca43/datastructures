package com.ds.bt.Assignments;

import static java.lang.IO.println;

public class OddEvern {
    static void main(String[] args) {
        println("Identify even or odd : "+evenOrOdd(5));
    }

    public static String evenOrOdd(int num){
        if(num ==0)
            return "NA";
        else{
            return num %2 ==0 ?"even" : "odd";
        }
    }
}
